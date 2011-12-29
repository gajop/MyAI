package myai.military.battlegroup.orders;

import com.springrts.ai.oo.clb.Unit;

public abstract class UnitOrder {
		
	public UnitOrder(Unit actor) {	
		this.actor = actor;
	}
	
	Unit actor;

	public Unit getActor() {
		return actor;
	}
	public void setActor(Unit actor) {
		this.actor = actor;
	}	
	
	public abstract void execute();
}
