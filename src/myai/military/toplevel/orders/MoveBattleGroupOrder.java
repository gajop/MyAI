/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.military.toplevel.orders;

import com.springrts.ai.oo.AIFloat3;

import myai.military.battlegroup.BattleGroup;

/**
 *
 * @author gajop
 */
public class MoveBattleGroupOrder extends BattleGroupOrder {

    AIFloat3 destination;

    public MoveBattleGroupOrder(BattleGroup actor, AIFloat3 destination) {
        super(actor);
        this.destination = destination;
    }

    public void setDestination(AIFloat3 destination) {
        this.destination = destination;
    }
    
    public AIFloat3 getDestination() {
        return destination;
    }

}
