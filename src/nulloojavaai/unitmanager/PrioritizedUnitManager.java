package nulloojavaai.unitmanager;

import com.springrts.ai.oo.Unit;
import nulloojavaai.Module;
import nulloojavaai.utility.SpringCommunications;

import java.util.*;
import java.util.logging.Logger;

public class PrioritizedUnitManager implements UnitManager {
    Map<Unit, UnitManagerListener> ownership = new HashMap<Unit, UnitManagerListener>();
    Map<Unit, SortedSet<UnitManagerListener>> requests = new HashMap<Unit, SortedSet<UnitManagerListener>>();
    Map<UnitManagerListener, Integer> priorityLevels = new HashMap<UnitManagerListener, Integer>(); //the higher the greater the priority
    Logger log;
    SpringCommunications spring;

    public PrioritizedUnitManager(SpringCommunications spring, Map<UnitManagerListener, Integer> priorityLevels) {
        this.priorityLevels = priorityLevels;
        this.spring = spring;
        this.log = spring.getLogger("unit-manager");
    }

    public boolean isOwned(Unit unit) {
        return ownership.containsKey(unit);
    }

    public UnitManagerListener getOwner(Unit unit) {
        return ownership.get(unit);
    }

    public boolean requestUnit(Unit unit, UnitManagerListener listener) {
        if (!priorityLevels.containsKey(listener)) {
            log.severe("Listener requesting unit is not registered");
            return false;
        }
        if (!requests.containsKey(unit)) {
            log.warning("Listener requesting unit that isn't managed");
            return false;
        }
        if (!ownership.containsKey(unit)) {
            ownership.put(unit, listener);
            return true;
        } else {
            if (ownership.get(unit).equals(listener)) {
                return true;
            }
            SortedSet<UnitManagerListener> unitRequests = requests.get(unit);
            if (unitRequests.contains(listener)) {
                return false;
            }
            UnitManagerListener owner = ownership.get(unit);
            Integer ownerPriority = priorityLevels.get(owner);
            Integer requestPriority = priorityLevels.get(listener);
            if (ownerPriority < requestPriority) {
                listener.unitOwnershipGained(unit);
                owner.unitOwnershipLost(unit);
                unitRequests.add(owner);
                ownership.put(unit, listener);
                return true;
            } else {
                unitRequests.add(listener);
                return false;
            }
        }
    }

    public boolean releaseUnit(Unit unit, UnitManagerListener listener) {
        if (!priorityLevels.containsKey(listener)) {
            log.severe("Listener requesting unit is not registered");
            return false;
        }
        if (!requests.containsKey(unit)) {
            log.warning("Listener requesting unit that isn't managed");
            return false;
        }
        if (!ownership.containsKey(unit)) {
            log.warning("Listener trying to release ownership of a unit that isn't owned");
            return false;
        }
        if (listener.equals(ownership.get(unit))) {
            SortedSet<UnitManagerListener> unitRequests = requests.get(unit);
            if (!unitRequests.isEmpty()) {
                UnitManagerListener last = unitRequests.last();
                last.unitOwnershipGained(unit);
                unitRequests.remove(last);
                ownership.put(unit, last);
                return true;
            }
            ownership.remove(unit);
            return true;            
        } else {
            log.warning("Listener trying to release ownership of a unit that it doesn't own");
            return false;
        }
    }

    @Override
    public void registerUnit(Unit unit) {
        requests.put(unit, new TreeSet<UnitManagerListener>(new Comparator<UnitManagerListener>() {
            public int compare(UnitManagerListener o1, UnitManagerListener o2) {
                return priorityLevels.get(o1).compareTo(priorityLevels.get(o2));
            }
        }));
    }

    @Override
    public void deRegisterUnit(Unit unit) {
        ownership.remove(unit);
        requests.remove(unit);
    }

	@Override
	public void register(UnitManagerListener listener) {
		priorityLevels.put(listener, 0);
	}
}
