package nulloojavaai.unitmanager;

import com.springrts.ai.oo.Unit;

public interface UnitManager {
    public boolean requestUnit(Unit unit, UnitManagerListener listener);
    public boolean releaseUnit(Unit unit, UnitManagerListener listener);
    public boolean isOwned(Unit unit);
    public UnitManagerListener getOwner(Unit unit);
}
