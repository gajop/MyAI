/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel.orders;

import com.springrts.ai.AIFloat3;

import nulloojavaai.militarymanager.battlegroup.BattleGroup;

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
