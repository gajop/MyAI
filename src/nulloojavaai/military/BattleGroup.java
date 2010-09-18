/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.military;

import com.springrts.ai.oo.Unit;
import java.util.List;

/**
 *
 * @author gajop
 */
public class BattleGroup {
    List<Unit> units;
    boolean sent = false;

    public boolean isSent() {
        return sent;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BattleGroup other = (BattleGroup) obj;
        if (this.units != other.units && (this.units == null || !this.units.equals(other.units))) {
            return false;
        }
        if (this.sent != other.sent) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.units != null ? this.units.hashCode() : 0);
        hash = 41 * hash + (this.sent ? 1 : 0);
        return hash;
    }

    public BattleGroup(List<Unit> units) {
        this.units = units;
    }
}
