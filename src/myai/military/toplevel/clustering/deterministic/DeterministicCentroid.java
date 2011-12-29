/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.military.toplevel.clustering.deterministic;

import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.Unit;
import java.util.List;

/**
 *
 * @author gajop
 */
public class DeterministicCentroid {
    AIFloat3 center;
    List<Unit> assignments;

    public DeterministicCentroid(AIFloat3 center, List<Unit> assignments) {
        this.center = center;
        this.assignments = assignments;
    }

    public List<Unit> getAssignments() {
        return assignments;
    }

    public AIFloat3 getCenter() {
        return center;
    }

    public void setAssignments(List<Unit> assignments) {
        this.assignments = assignments;
    }

    public void setCenter(AIFloat3 center) {
        this.center = center;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DeterministicCentroid other = (DeterministicCentroid) obj;
        if (this.center != other.center && (this.center == null || !this.center.equals(other.center))) {
            return false;
        }
        if (this.assignments != other.assignments && (this.assignments == null || !this.assignments.equals(other.assignments))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.center != null ? this.center.hashCode() : 0);
        hash = 29 * hash + (this.assignments != null ? this.assignments.hashCode() : 0);
        return hash;
    }

}
