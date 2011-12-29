package myai.military.battlegroup;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import myai.military.battlegroup.orders.UnitOrder;

import com.springrts.ai.oo.clb.Unit;

public class BattleGroupPlan {
	List<UnitOrder> plan;

	public List<UnitOrder> getPlan() {
		return plan;
	}

	public void setPlan(List<UnitOrder> plan) {
		this.plan = plan;
	}

	public BattleGroupPlan() {
		this.plan = new LinkedList<UnitOrder>();
	}

	public BattleGroupPlan(List<UnitOrder> plan) {
		this.plan = plan;
	}
	
	public void addOrder(UnitOrder unitOrder) {
		plan.add(unitOrder);
	}
}
