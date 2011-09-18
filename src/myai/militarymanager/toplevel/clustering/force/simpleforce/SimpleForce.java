/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.militarymanager.toplevel.clustering.force.simpleforce;

import com.springrts.ai.AIFloat3;

import myai.militarymanager.battlegroup.BattleGroup;
import myai.militarymanager.toplevel.clustering.force.Force;
import myai.utility.SpringCommunications;

/**
 *
 * @author gajop
 */
public class SimpleForce extends Force {

    public enum Type { NORMAL, BUILDINGS, WORKERS };
    double hp;
    double dpf;
    double maxSpeed;
    double value;
    double range;
    int owner; //should be a Player object imo
    SpringCommunications spring;
    AIFloat3 velocity;

    public SimpleForce(SpringCommunications spring, AIFloat3 originalPosition, int frameCreated, 
            double hp, double dpf, double maxSpeed, double value, double range, int owner, AIFloat3 velocity) {
        super(originalPosition, frameCreated);
        this.spring = spring;
        this.owner = 1;
        this.hp = hp;
        this.dpf = dpf;
        this.maxSpeed = maxSpeed;
        this.value = value;
        this.range = range;
        this.owner = owner;
        this.velocity = velocity;
    }

    public SimpleForce(SpringCommunications spring, BattleGroup originalBattleGroup,
    		int frameCreated, double hp, double dpf, double maxSpeed, double value, double range, AIFloat3 velocity) {
        super(originalBattleGroup, frameCreated);
        this.spring = spring;
        this.owner = spring.getClb().getTeamId();
        this.hp = hp;
        this.dpf = dpf;
        this.maxSpeed = maxSpeed;
        this.value = value;
        this.range = range;
        this.velocity = velocity;
    }

    public SimpleForce(SpringCommunications spring, AIFloat3 originalPosition, int frameCreated, int owner) {
        super(originalPosition, frameCreated);
        this.spring = spring;
        this.owner = owner;
    }
    
    public SimpleForce(SpringCommunications spring, int frameCreated, BattleGroup originalBattleGroup) {
        super(originalBattleGroup, frameCreated);
        this.spring = spring;
        this.owner = spring.getClb().getTeamId();
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public int getOwner() {
        return owner;
    }



    @Override
    public String toString() {
        return "SimpleForce{" + "hp=" + hp + "dpf=" + dpf + "maxSpeed=" + maxSpeed + "value=" + value + "range=" + range + "owner=" + owner + '}';
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

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
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

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getValue() {
        return value;
    }

	public AIFloat3 getVelocity() {
		return velocity;
	}

	public void setVelocity(AIFloat3 velocity) {
		this.velocity = velocity;
	}
}
