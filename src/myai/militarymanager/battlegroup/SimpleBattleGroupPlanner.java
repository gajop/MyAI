package myai.militarymanager.battlegroup;

import java.util.Collection;
import java.util.List;

import myai.militarymanager.battlegroup.orders.AttackUnitOrder;
import myai.militarymanager.battlegroup.orders.MoveUnitOrder;
import myai.militarymanager.toplevel.clustering.force.Force;
import myai.militarymanager.toplevel.clustering.force.simpleforce.SimpleForce;
import myai.militarymanager.toplevel.orders.AttackForceBattleGroupOrder;
import myai.militarymanager.toplevel.orders.BattleGroupOrder;
import myai.militarymanager.toplevel.orders.MoveBattleGroupOrder;
import myai.utility.SpringCommunications;
import myai.utility.VectorUtil;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.Unit;

public class SimpleBattleGroupPlanner extends BattleGroupPlanner {
	SpringCommunications spring;

	public SimpleBattleGroupPlanner(SpringCommunications spring, BattleGroup battleGroup) {
		super(battleGroup);
		this.spring = spring;
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Calculates the intercept position for self unit given self and target position, target velocity (vector), 
	 * and self speed (absolute value). If there is no intercept vector (target won't be catched if it continues 
	 * on it's course) it returns null.
	 */
	AIFloat3 getInterceptPosition(AIFloat3 selfStart, AIFloat3 targetStart, AIFloat3 targetVelocity, double selfSpeed) {
		AIFloat3 deltaStart = new AIFloat3(targetStart.x - selfStart.x, 
				targetStart.y - selfStart.y, targetStart.z - selfStart.z);
		double sumTargetVelocity = targetVelocity.x + targetVelocity.y + targetVelocity.z;
		double sumSquaredTargetVelocity = targetVelocity.x * targetVelocity.x + 
			targetVelocity.y * targetVelocity.y + targetVelocity.z * targetVelocity.z;
		double a = sumSquaredTargetVelocity - selfSpeed;
		double b = 2 * sumTargetVelocity;
		double c = deltaStart.x * deltaStart.x + deltaStart.y * deltaStart.y + 
			deltaStart.z * deltaStart.z;
		double discriminant = b * b - 4 * a * c;
		if (discriminant < 0) {
			return null; //or collision with map boundaries
		} else {
			double squaredDet = Math.sqrt(discriminant);
			double t1 = (-b + squaredDet) / (2 * a);
			double t2 = (-b - squaredDet) / (2 * a);
			double t;
			if (t1 < 0) {
				t = t1;
			} else {
				t = t2;
			}
			return new AIFloat3((float)(selfStart.x + deltaStart.x + targetVelocity.x * t), 
					(float)(deltaStart.y + selfStart.y + targetVelocity.y * t), 
					(float)(deltaStart.z + selfStart.z + targetVelocity.z * t));
		}		
	}
	
	@Override
	public BattleGroupPlan plan() {
		BattleGroupPlan plan = new BattleGroupPlan();
		BattleGroupOrder order = battleGroup.getOrder();
		if (order instanceof MoveBattleGroupOrder) {
			MoveBattleGroupOrder moveOrder = (MoveBattleGroupOrder) order;
			Collection<Unit> myUnits = battleGroup.getUnits();			
			AIFloat3 battleGroupCenter = VectorUtil.averageFromUnits(myUnits);
			AIFloat3 destination = moveOrder.getDestination();
			if (VectorUtil.distance(battleGroupCenter, destination) > 500) { //we are too far away, let's just move there
				for (Unit myUnit : myUnits) {
					plan.addOrder(new MoveUnitOrder(myUnit, destination));
				}
			} else { //we are close enough, let's pick enemies to fight
				for (Unit myUnit : myUnits) {
					List<Unit> enemyUnits = spring.getClb().getEnemyUnitsIn(myUnit.getPos(), 1000);
					double closestDistance = Double.MAX_VALUE;
					Unit closest = null;
					for (Unit enemyUnit : enemyUnits) {
						double distance = VectorUtil.distance(myUnit.getPos(), enemyUnit.getPos());
						if (distance < closestDistance) {
							closest = enemyUnit;
							closestDistance = distance;
						}
					}
					if (closest != null) {
						plan.addOrder(new MoveUnitOrder(myUnit, closest.getPos()));
					}
				}
			}
		} else if (order instanceof AttackForceBattleGroupOrder) {
			AttackForceBattleGroupOrder attackForceOrder = (AttackForceBattleGroupOrder) order;
			Collection<Unit> myUnits = battleGroup.getUnits();			
			AIFloat3 battleGroupCenter = VectorUtil.averageFromUnits(myUnits);
			Force targetForce = attackForceOrder.getTargetForce();
			AIFloat3 destination = targetForce.getOriginalPosition(); 
			double originalDistance = VectorUtil.distance(battleGroupCenter, destination); //assuming they don't move
			if (targetForce instanceof SimpleForce) { //let's see where they would go if they kept on going (well not exactly, would be unsolvable if they're faster than us and running away)
				SimpleForce simpleForce = (SimpleForce) targetForce;
				
				double averageSpeed = 0;
				if (!myUnits.isEmpty()) {
					for (Unit unit : myUnits) {
						averageSpeed += unit.getDef().getSpeed();
					}
					averageSpeed /= myUnits.size();
				}
				double timeSpent = (this.spring.getClb().getGame().getCurrentFrame() - simpleForce.getFrameCreated()); //calculate the time spent since cluster was created
				destination.x += simpleForce.getVelocity().x * timeSpent;
				destination.y += simpleForce.getVelocity().x * timeSpent;
				destination.z += simpleForce.getVelocity().x * timeSpent;
				AIFloat3 interceptPosition = getInterceptPosition(battleGroupCenter, destination, simpleForce.getVelocity(), averageSpeed);
				if (interceptPosition == null) {	
					if (averageSpeed != 0) {
						destination.x += simpleForce.getVelocity().x * originalDistance / averageSpeed;
						destination.y += simpleForce.getVelocity().y * originalDistance / averageSpeed;
						destination.z += simpleForce.getVelocity().z * originalDistance / averageSpeed;				
					}
				} else {
					destination = interceptPosition;
				}
			}
			if (VectorUtil.distance(battleGroupCenter, destination) > 500) { //we are too far away, let's just move there
				for (Unit myUnit : myUnits) {
					plan.addOrder(new MoveUnitOrder(myUnit, destination));
				}
			} else { //we are close enough, let's pick enemies to fight
				for (Unit myUnit : myUnits) {
					List<Unit> enemyUnits = spring.getClb().getEnemyUnitsIn(myUnit.getPos(), 1000);
					double closestDistance = Double.MAX_VALUE;
					Unit closest = null;
					for (Unit enemyUnit : enemyUnits) {
						double distance = VectorUtil.distance(myUnit.getPos(), enemyUnit.getPos());
						if (distance < closestDistance) {
							closest = enemyUnit;
							closestDistance = distance;
						}
					}
					if (closest != null) {
						plan.addOrder(new AttackUnitOrder(myUnit, closest));
					}
				}
			}
		}
		return plan;
	}
}
