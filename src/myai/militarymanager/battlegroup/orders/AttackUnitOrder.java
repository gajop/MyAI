package myai.militarymanager.battlegroup.orders;

import com.springrts.ai.oo.Unit;

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
	
}
