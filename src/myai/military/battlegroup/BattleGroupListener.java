package myai.military.battlegroup;

public interface BattleGroupListener {
	public void battleGroupAdded(BattleGroup battleGroup);
	public void battleGroupRemoved(BattleGroup battleGroup);
	public void battleGroupChanged(BattleGroup battleGroup);
}
