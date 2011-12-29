/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.build.scheduler;

import com.springrts.ai.oo.clb.Unit;
import com.springrts.ai.oo.clb.UnitDef;

/**
 *
 * @author gajop
 */
public class UnitBuildJob extends BuildJob {

    public UnitBuildJob(UnitDef jobUnitDef, Unit actor, Status status, int frameOrdered) {
        super(jobUnitDef, actor, status, frameOrdered);
    }

}
