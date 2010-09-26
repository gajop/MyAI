package nulloojavaai.unitmanager;

import com.springrts.ai.oo.Unit;

public interface UnitManager {
	public void register(UnitManagerListener listener);
	public void registerUnit(Unit unit);
	public void deRegisterUnit(Unit unit);
    public boolean requestUnit(Unit unit, UnitManagerListener listener);
    public boolean releaseUnit(Unit unit, UnitManagerListener listener);
    public boolean isOwned(Unit unit);
    public UnitManagerListener getOwner(Unit unit);
}
