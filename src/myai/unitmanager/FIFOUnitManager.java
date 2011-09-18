package myai.unitmanager;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.logging.Logger;

import myai.Module;
import myai.utility.SpringCommunications;

import com.springrts.ai.oo.Unit;

public class FIFOUnitManager implements UnitManager {
	List<UnitManagerListener> listeners = new LinkedList<UnitManagerListener>();
	Map<Unit, Queue<UnitManagerListener>> requests = new HashMap<Unit, Queue<UnitManagerListener>>(); 
	Map<Unit, UnitManagerListener> ownership = new HashMap<Unit, UnitManagerListener>();
	Logger log;
	SpringCommunications spring;
	
	public FIFOUnitManager(SpringCommunications spring) {
		super();
		this.spring = spring;
		this.log = spring.getLogger("unit-manager");
	}

	@Override
	public boolean requestUnit(Unit unit, UnitManagerListener listener) {
		if (!listeners.contains(listener)) {
			log.warning("UnitManagerListener is not registered");
		}
		if (ownership.get(unit).equals(listener)) {
			return true;
		}
		Queue<UnitManagerListener> requestQueue = requests.get(unit);
		if (requestQueue != null) {
			if (ownership.get(unit) == null) {
				ownership.put(unit, listener);
				return true;
			} else {
				requestQueue.add(listener);
				return false;
			}
		} else {
			log.warning("Request of unit that isn't tracked by the UnitManager");
		}
		return false;
	}

	@Override
	public boolean releaseUnit(Unit unit, UnitManagerListener listener) {
		if (!listeners.contains(listener)) {
			log.warning("UnitManagerListener is not registered");
		}
		if (!ownership.get(unit).equals(listener)) {
			log.warning("UnitManagerListener trying to release unit it doesn't own");
		}
		ownership.remove(unit);
		Queue<UnitManagerListener> unitRequests = requests.get(unit);
		if (!unitRequests.isEmpty()) {
			UnitManagerListener newOwner = unitRequests.remove(); 
			ownership.put(unit, newOwner);
			newOwner.unitOwnershipGained(unit);
		}
		return true;
	}

	@Override
	public boolean isOwned(Unit unit) {
		return ownership.containsKey(unit);
	}

	@Override
	public UnitManagerListener getOwner(Unit unit) {
		return ownership.get(unit);
	}

	@Override
	public void register(UnitManagerListener listener) {
		listeners.add(listener);
	}

    @Override
    public void registerUnit(Unit unit) {
        requests.put(unit, new LinkedList<UnitManagerListener>());
    }

    @Override
    public void deRegisterUnit(Unit unit) {
        ownership.remove(unit);
        requests.remove(unit);
    }
}
