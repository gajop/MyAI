package myai.militarymanager.battlegroup;

import java.util.ArrayList;

import com.springrts.ai.AICommand;
import com.springrts.ai.command.AttackUnitAICommand;
import com.springrts.ai.command.MoveUnitAICommand;

import myai.militarymanager.battlegroup.orders.AttackUnitOrder;
import myai.militarymanager.battlegroup.orders.MoveUnitOrder;
import myai.militarymanager.battlegroup.orders.UnitOrder;
import myai.utility.SpringCommunications;

public class SimpleBattleGroupScheduler extends BattleGroupScheduler {
	SpringCommunications spring;


	@Override
	public void execute(BattleGroupPlan plan) {
		for (UnitOrder unitOrder : plan.getPlan()) {		
			if (unitOrder instanceof MoveUnitOrder) {
				MoveUnitOrder moveOrder = (MoveUnitOrder) unitOrder;
                MoveUnitAICommand command = new MoveUnitAICommand(moveOrder.getActor(), -1,
                        new ArrayList<AICommand.Option>(), 10000, moveOrder.getDestination());
                spring.handleEngineCommand(command);
			} else if (unitOrder instanceof AttackUnitOrder) { //pray the unit exists, haven't found a way to check that yet
				AttackUnitOrder attackOrder = (AttackUnitOrder) unitOrder;
				AttackUnitAICommand command = new AttackUnitAICommand(attackOrder.getActor(), -1,
						new ArrayList<AICommand.Option>(), 10000, attackOrder.getTarget());
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
