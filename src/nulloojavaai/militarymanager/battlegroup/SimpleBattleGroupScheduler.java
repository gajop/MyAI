package nulloojavaai.militarymanager.battlegroup;

import java.util.ArrayList;

import com.springrts.ai.AICommand;
import com.springrts.ai.command.MoveUnitAICommand;

import nulloojavaai.militarymanager.battlegroup.orders.MoveUnitOrder;
import nulloojavaai.militarymanager.battlegroup.orders.UnitOrder;
import nulloojavaai.utility.SpringCommunications;

public class SimpleBattleGroupScheduler extends BattleGroupScheduler {
	SpringCommunications spring;


	@Override
	public void execute(BattleGroupPlan plan) {
		for (UnitOrder unitOrder : plan.getPlan()) {
			MoveUnitOrder moveOrder = (MoveUnitOrder) unitOrder;
			if (unitOrder.getOrderType().equals(UnitOrder.OrderType.MOVE)) {
                MoveUnitAICommand command = new MoveUnitAICommand(moveOrder.getActor(), -1,
                        new ArrayList<AICommand.Option>(), 10000, moveOrder.getDestination());
                spring.handleEngineCommand(command);
			}
		}
	}


	public SimpleBattleGroupScheduler(SpringCommunications spring) {
		super();
		this.spring = spring;
	}


	public SpringCommunications getSpring() {
		return spring;
	}


	public void setSpring(SpringCommunications spring) {
		this.spring = spring;
	}

}