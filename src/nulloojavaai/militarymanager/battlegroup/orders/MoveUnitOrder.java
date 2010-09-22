package nulloojavaai.militarymanager.battlegroup.orders;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.Unit;

public class MoveUnitOrder extends UnitOrder {
	public MoveUnitOrder(Unit actor, AIFloat3 destination) {
		super(actor, UnitOrder.OrderType.MOVE);
		this.destination = destination;
	}

	AIFloat3 destination;

	public AIFloat3 getDestination() {
		return destination;
	}

	public void setDestination(AIFloat3 destination) {
		this.destination = destination;
	}

}
