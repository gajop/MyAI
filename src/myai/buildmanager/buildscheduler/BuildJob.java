/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.buildmanager.buildscheduler;

import com.springrts.ai.oo.Unit;
import com.springrts.ai.oo.UnitDef;

/**
 *
 * @author gajop
 */
public abstract class BuildJob {
    public enum Status { ORDERED, STARTED, FINISHED, FAILED };
    UnitDef unitToBuild;
    Unit actor;
    Status status;
    int frameOrdered;


    public void setActor(Unit actor) {
        this.actor = actor;
    }

    public void setFrameOrdered(int frameOrdered) {
        this.frameOrdered = frameOrdered;
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


    public Status getStatus() {
        return status;
    }

	public BuildJob(UnitDef unitToBuild, Unit actor, Status status,
			int frameOrdered) {
		super();
		this.unitToBuild = unitToBuild;
		this.actor = actor;
		this.status = status;
		this.frameOrdered = frameOrdered;
	}

	public UnitDef getUnitToBuild() {
		return unitToBuild;
	}

	public void setUnitToBuild(UnitDef unitToBuild) {
		this.unitToBuild = unitToBuild;
	}

	@Override
	public String toString() {
		return "BuildJob [unitToBuild=" + unitToBuild + ", actor=" + actor
				+ ", status=" + status + ", frameOrdered=" + frameOrdered + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actor == null) ? 0 : actor.hashCode());
		result = prime * result + frameOrdered;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((unitToBuild == null) ? 0 : unitToBuild.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BuildJob other = (BuildJob) obj;
		if (actor == null) {
			if (other.actor != null)
				return false;
		} else if (!actor.equals(other.actor))
			return false;
		if (frameOrdered != other.frameOrdered)
			return false;
		if (status != other.status)
			return false;
		if (unitToBuild == null) {
			if (other.unitToBuild != null)
				return false;
		} else if (!unitToBuild.equals(other.unitToBuild))
			return false;
		return true;
	}
}
