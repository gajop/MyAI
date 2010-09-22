package nulloojavaai.militarymanager.battlegroup;

import java.util.Collection;
import java.util.List;

import nulloojavaai.militarymanager.battlegroup.orders.MoveUnitOrder;
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
		if (order.getOrderType().equals(BattleGroupOrder.OrderType.MOVE)) {
			Collection<Unit> myUnits = battleGroup.getUnits();
			MoveBattleGroupOrder moveOrder = (MoveBattleGroupOrder) order;
			AIFloat3 battleGroupCenter = VectorUtil.averageFromUnits(myUnits);
			AIFloat3 destination = moveOrder.getDestination();
			if (VectorUtil.distance(battleGroupCenter, destination) > 500) { //we are too far away, let's just move there
				for (Unit myUnit : myUnits) {
					plan.addOrder(new MoveUnitOrder(myUnit, destination));
				}
			} else { //we are close enough, let's pick enemies to fight
				for (Unit myUnit : myUnits) {
					List<Unit> enemyUnits = spring.getClb().getEnemyUnitsIn(myUnit.getPos(), 500);
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
		}
		return plan;
	}
}
