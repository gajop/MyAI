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
public abstract class BattleGroupOrder {
	public enum OrderType { MOVE, IDLE};
	OrderType orderType;
    BattleGroup actor;

    public BattleGroupOrder(BattleGroup actor, OrderType orderType) {
        this.actor = actor;
        this.orderType = orderType;
    }

    public BattleGroup getActor() {
        return actor;
    }

    public void setActor(BattleGroup actor) {
        this.actor = actor;
    } 

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

}
