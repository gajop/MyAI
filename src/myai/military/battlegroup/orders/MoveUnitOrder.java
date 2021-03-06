package myai.military.battlegroup.orders;

import myai.MyAI;

import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.Unit;

public class MoveUnitOrder extends UnitOrder {
	public MoveUnitOrder(Unit actor, AIFloat3 destination) {
		super(actor);
		this.destination = destination;
	}

	AIFloat3 destination;

	public AIFloat3 getDestination() {
		return destination;
	}

	public void setDestination(AIFloat3 destination) {
		this.destination = destination;
	}

	@Override
	public void execute() {
		actor.moveTo(destination, MyAI.getOpts(), MyAI.getTimeout());
	}

}
