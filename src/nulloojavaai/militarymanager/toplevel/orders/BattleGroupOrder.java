/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel.orders;

import nulloojavaai.militarymanager.BattleGroup;

/**
 *
 * @author gajop
 */
public abstract class BattleGroupOrder {
    BattleGroup actor;

    public BattleGroupOrder(BattleGroup actor) {
        this.actor = actor;
    }

    public BattleGroup getActor() {
        return actor;
    }

    public void setActor(BattleGroup actor) {
        this.actor = actor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BattleGroupOrder other = (BattleGroupOrder) obj;
        if (this.actor != other.actor && (this.actor == null || !this.actor.equals(other.actor))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.actor != null ? this.actor.hashCode() : 0);
        return hash;
    }

}
