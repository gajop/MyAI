package myai.military.battlegroup.orders;

import myai.MyAI;

import com.springrts.ai.oo.clb.Unit;

public class AttackUnitOrder extends UnitOrder {
	Unit target;

	public AttackUnitOrder(Unit actor, Unit target) {
		super(actor);
		this.target = target;
	}

	public Unit getTarget() {
		return target;
	}

	public void setTarget(Unit target) {
		this.target = target;
	}

	@Override
	public void execute() {
		actor.attack(target, MyAI.getOpts(), MyAI.getTimeout());
	}
	
}
