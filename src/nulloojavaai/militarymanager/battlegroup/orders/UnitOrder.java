package nulloojavaai.militarymanager.battlegroup.orders;

import com.springrts.ai.oo.Unit;

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
}
