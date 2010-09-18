/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.military.toplevel.simpleforce;

import com.springrts.ai.AIFloat3;
import nulloojavaai.military.BattleGroup;
import nulloojavaai.military.toplevel.Force;
import nulloojavaai.utility.SpringCommunications;

/**
 *
 * @author gajop
 */
public class SimpleForce extends Force {

    public enum Type { NORMAL, BUILDINGS, WORKERS };
    double hp;
    double dpf;
    double speed;
    double value;
    double range;
    int owner; //should be a Player object imo
    SpringCommunications spring;

    public SimpleForce(SpringCommunications spring, AIFloat3 originalPosition,
            double hp, double dpf, double speed, double value, double range) {
        super(originalPosition);
        this.spring = spring;
        this.owner = 1;
        this.hp = hp;
        this.dpf = dpf;
        this.speed = speed;
        this.value = value;
        this.range = range;
    }

    public SimpleForce(SpringCommunications spring, BattleGroup originalBattleGroup,
            double hp, double dpf, double speed, double value, double range) {
        super(originalBattleGroup);
        this.spring = spring;
        this.owner = spring.getClb().getTeamId();
        this.hp = hp;
        this.dpf = dpf;
        this.speed = speed;
        this.value = value;
        this.range = range;
    }

    public SimpleForce(SpringCommunications spring, AIFloat3 originalPosition) {
        super(originalPosition);
        this.spring = spring;
        this.owner = 1;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public int getOwner() {
        return owner;
    }

    public SimpleForce(SpringCommunications spring, BattleGroup originalBattleGroup) {
        super(originalBattleGroup);
        this.spring = spring;
        this.owner = spring.getClb().getTeamId();
    }

    @Override
    public String toString() {
        return "SimpleForce{" + "hp=" + hp + "dpf=" + dpf + "speed=" + speed + "value=" + value + "range=" + range + "owner=" + owner + '}';
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getRange() {
        return range;
    }

    public void setDpf(double dpf) {
        this.dpf = dpf;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getDpf() {
        return dpf;
    }

    public double getHp() {
        return hp;
    }

    public double getSpeed() {
        return speed;
    }

    public double getValue() {
        return value;
    }
}
