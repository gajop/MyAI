package nulloojavaai.unitmanager;

import com.springrts.ai.oo.Unit;

public interface UnitManagerListener {
    void onUnitOwnershipGained(Unit unit);
    void onUnitOwnershipLost(Unit unit);
    void setUnitManager(UnitManager unitManager);
}
