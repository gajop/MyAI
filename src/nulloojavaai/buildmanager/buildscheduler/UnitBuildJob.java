/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.buildmanager.buildscheduler;

import com.springrts.ai.oo.Unit;
import com.springrts.ai.oo.UnitDef;

/**
 *
 * @author gajop
 */
public class UnitBuildJob extends BuildJob {

    public UnitBuildJob(UnitDef jobUnitDef, Unit actor, Status status, int frameOrdered) {
        super(jobUnitDef, actor, status, frameOrdered);
    }

}
