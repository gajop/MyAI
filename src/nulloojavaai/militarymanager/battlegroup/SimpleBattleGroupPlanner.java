package nulloojavaai.militarymanager.battlegroup;

import java.util.Collection;
import java.util.List;

import nulloojavaai.militarymanager.battlegroup.orders.AttackUnitOrder;
import nulloojavaai.militarymanager.battlegroup.orders.MoveUnitOrder;
import nulloojavaai.militarymanager.toplevel.clustering.force.Force;
import nulloojavaai.militarymanager.toplevel.clustering.force.simpleforce.SimpleForce;
import nulloojavaai.militarymanager.toplevel.orders.AttackForceBattleGroupOrder;
import nulloojavaai.militarymanager.toplevel.orders.BattleGroupOrder;
import nulloojavaai.militarymanager.toplevel.orders.MoveBattleGroupOrder;
import nulloojavaai.utility.SpringCommunications;
import nulloojavaai.utility.VectorUtil;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.Unit;

public class SimpleBattleGroupPlanner extends BattleGroupPlanner {
	SpringCommunications spring;

	public SimpleBattleGroupPlanner(SpringCommunications spring, BattleGroup battleGroup) {
		super(battleGroup);
		this.spring = spring;
		// TODO Auto-generated constructor stub
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
				double timeSpent = (this.spring.getClb().getGame().getCurrentFrame() - simpleForce.getFrameCreated());
				if (simpleForce.getMaxSpeed() != 0) {
					timeSpent += originalDistance / simpleForce.getMaxSpeed();
				}
				destination.x += simpleForce.getVelocity().x * timeSpent;
				destination.y += simpleForce.getVelocity().y * timeSpent;
				destination.z += simpleForce.getVelocity().z * timeSpent;				
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
