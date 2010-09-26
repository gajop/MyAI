package nulloojavaai.militarymanager.battlegroup;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.springrts.ai.oo.Unit;

public class BattleGroups {
	Set<BattleGroup> battleGroups = new HashSet<BattleGroup>();
	Set<BattleGroupListener> listeners = new HashSet<BattleGroupListener>();
	int id = 0;
	
	public void addBattleGroup(BattleGroup battleGroup) {
		battleGroup.setId(id++);
		battleGroups.add(battleGroup);
		for (BattleGroupListener listener : listeners) {
			listener.battleGroupAdded(battleGroup);
		}
	}
	
	public void removeBattleGroup(BattleGroup battleGroup) {
		battleGroups.remove(battleGroup);
	}
	
	public Set<BattleGroup> getBattleGroups() {
		return Collections.unmodifiableSet(battleGroups);
	}
	
	public void addUnit(Unit unit, BattleGroup battleGroup) {
		for (BattleGroup battleGroupIter : battleGroups) {
			if (battleGroupIter.equals(battleGroup)) {
				battleGroup.addUnit(unit);
				for (BattleGroupListener listener : listeners) {
					listener.battleGroupChanged(battleGroup);
				}
				return;
			}
		}
	}
	/*
	 * Removes the unit from all (probably only one) BattleGroups that own it.
	 * Also deletes the BattleGroup if it has no other units.
	 */
	public void removeUnit(Unit unit) {
		for (Iterator<BattleGroup> i = battleGroups.iterator(); i.hasNext();) {
			BattleGroup battleGroup = i.next();
			battleGroup.removeUnit(unit);
			if (battleGroup.getUnits().isEmpty()) {				
				i.remove();				
				for (BattleGroupListener listener : listeners) {
					listener.battleGroupRemoved(battleGroup);
				}
			} else {
				for (BattleGroupListener listener : listeners) {
					listener.battleGroupChanged(battleGroup);
				}
			}
		}
	}
	
	public void registerListener(BattleGroupListener listener) {
		listeners.add(listener);
	}
	
	public void deRegisterListener(BattleGroupListener listener) {
		if (listeners.contains(listener)) {
			listeners.remove(listener);
		}
	}
}
