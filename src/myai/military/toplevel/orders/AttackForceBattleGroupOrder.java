package myai.military.toplevel.orders;

import myai.military.battlegroup.BattleGroup;
import myai.military.toplevel.clustering.force.Force;

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
