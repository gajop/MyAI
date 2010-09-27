package nulloojavaai.militarymanager.toplevel.orders;

import nulloojavaai.militarymanager.battlegroup.BattleGroup;
import nulloojavaai.militarymanager.toplevel.clustering.force.Force;

public class AttackForceBattleGroupOrder extends BattleGroupOrder {
	Force targetForce;

	public AttackForceBattleGroupOrder(BattleGroup actor, Force targetForce) {
		super(actor);
		this.targetForce = targetForce;
	}

	public Force getTargetForce() {
		return targetForce;
	}

	public void setTargetForce(Force targetForce) {
		this.targetForce = targetForce;
	}


}
