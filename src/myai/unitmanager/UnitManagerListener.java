package myai.unitmanager;

import com.springrts.ai.oo.Unit;

public interface UnitManagerListener {
    void unitOwnershipGained(Unit unit);
    void unitOwnershipLost(Unit unit);
    void setUnitManager(UnitManager unitManager);
}
