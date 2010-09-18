/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.buildmanager.buildscheduler;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.Unit;
import com.springrts.ai.oo.UnitDef;

/**
 *
 * @author gajop
 */
public class BuildingBuildJob extends BuildJob {
    AIFloat3 position;

    public BuildingBuildJob(UnitDef jobUnitDef, Unit actor, Status status,
            int frameOrdered, AIFloat3 position) {
        super(jobUnitDef, actor, status, frameOrdered);
        this.position = position;
    }

    public AIFloat3 getPosition() {
        return position;
    }

    public void setPosition(AIFloat3 position) {
        this.position = position;
    }

}
