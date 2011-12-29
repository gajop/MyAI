package myai.military.battlegroup;

import com.springrts.ai.oo.clb.Group;

import myai.military.battlegroup.orders.UnitOrder;
import myai.utility.SpringCommunications;

public class SimpleBattleGroupScheduler extends BattleGroupScheduler {
	SpringCommunications spring;

	@Override
	public void execute(BattleGroupPlan plan) {
		for (UnitOrder unitOrder : plan.getPlan()) {	
			unitOrder.execute();
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
