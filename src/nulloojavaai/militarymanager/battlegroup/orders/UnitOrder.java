package nulloojavaai.militarymanager.battlegroup.orders;

import com.springrts.ai.oo.Unit;

public abstract class UnitOrder {
	public enum OrderType { IDLE, MOVE };
		
	public UnitOrder(Unit actor, OrderType orderType) {	
		this.orderType = orderType;
		this.actor = actor;
	}
	
	Unit actor;
	OrderType orderType;

	public Unit getActor() {
		return actor;
	}

	public void setActor(Unit actor) {
		this.actor = actor;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}
	
}
