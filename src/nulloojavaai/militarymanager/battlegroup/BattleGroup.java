/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.battlegroup;

import com.springrts.ai.oo.Unit;

import java.util.Collections;
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
    int id;

    public boolean isSent() {
        return sent;
    }

    public Set<Unit> getUnits() {
        return units;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    void addUnit(Unit unit) {
        units.add(unit);
    }
    
    void removeUnit(Unit unit) {
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
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

	public BattleGroupOrder getOrder() {
		return order;
	}

	public void setOrder(BattleGroupOrder order) {
		this.order = order;
	}

	public int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}
}
