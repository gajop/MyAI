/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.battlegroup;

import com.springrts.ai.oo.Unit;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import nulloojavaai.militarymanager.toplevel.orders.BattleGroupOrder;
import nulloojavaai.militarymanager.toplevel.orders.IdleBattleGroupOrder;

/**
 *
 * @author gajop
 */
public class BattleGroup {
    Set<Unit> units = new HashSet<Unit>();
    boolean sent = false;
    BattleGroupOrder order = new IdleBattleGroupOrder(this);

    public boolean isSent() {
        return sent;
    }

    public Set<Unit> getUnits() {
        return units;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }
    
    public void removeUnit(Unit unit) {
    	units.remove(unit);
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

	public BattleGroupOrder getOrder() {
		return order;
	}

	public void setOrder(BattleGroupOrder order) {
		this.order = order;
	}
}
