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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((position == null) ? 0 : position.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BuildingBuildJob other = (BuildingBuildJob) obj;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}

}
