/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.military.toplevel.orders;

import myai.military.battlegroup.BattleGroup;

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
