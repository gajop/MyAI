/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel.orders;

import nulloojavaai.militarymanager.battlegroup.BattleGroup;

/**
 *
 * @author gajop
 */
public class IdleBattleGroupOrder extends BattleGroupOrder {

    public IdleBattleGroupOrder(BattleGroup actor) {
        super(actor, BattleGroupOrder.OrderType.IDLE);
    }

}
