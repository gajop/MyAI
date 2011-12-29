package myai.utility;

import com.springrts.ai.oo.clb.UnitDef;

public class UnitDefUtil {
    public static boolean isBuilder(UnitDef unitDef) {
        return unitDef.getBuildOptions().size() > 0;
    }

    public static boolean isNano(UnitDef unitDef) {
    	return unitDef.getSpeed() == 0 && (unitDef.isAbleToRepair() || unitDef.isBuilder());
    }
}
