package myai.military.battlegroup;

public abstract class BattleGroupPlanner {
	BattleGroup battleGroup;
	
	public BattleGroupPlanner(BattleGroup battleGroup) {
		this.battleGroup = battleGroup;
	}

	public abstract BattleGroupPlan plan(); 

	public BattleGroup getBattleGroup() {
		return battleGroup;
	}

	public void setBattleGroup(BattleGroup battleGroup) {
		this.battleGroup = battleGroup;
	}
}
