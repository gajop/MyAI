/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.militarymanager.toplevel.orders;

import myai.militarymanager.battlegroup.BattleGroup;

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
}
