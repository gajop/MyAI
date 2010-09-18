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
public abstract class BuildJob {
    public enum Status { ORDERED, STARTED, FINISHED, FAILED };
    UnitDef jobUnitDef;
    Unit actor;
    Status status;
    int frameOrdered;

    @Override
    public String toString() {
        return "BuildJob{" + "jobUnitDef=" + jobUnitDef + "actor=" + actor +
                "status=" + status + "frameOrdered=" + frameOrdered + '}';
    }

    public void setActor(Unit actor) {
        this.actor = actor;
    }

    public void setFrameOrdered(int frameOrdered) {
        this.frameOrdered = frameOrdered;
    }

    public void setJobUnitDef(UnitDef jobUnitDef) {
        this.jobUnitDef = jobUnitDef;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Unit getActor() {
        return actor;
    }

    public int getFrameOrdered() {
        return frameOrdered;
    }

    public UnitDef getJobUnitDef() {
        return jobUnitDef;
    }

    public Status getStatus() {
        return status;
    }

    public BuildJob(UnitDef jobUnitDef, Unit actor, Status status, int frameOrdered) {
        this.jobUnitDef = jobUnitDef;
        this.actor = actor;
        this.status = status;
        this.frameOrdered = frameOrdered;
    }
}
