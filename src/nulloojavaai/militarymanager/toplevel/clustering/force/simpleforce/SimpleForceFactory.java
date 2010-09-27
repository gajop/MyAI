/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel.clustering.force.simpleforce;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.Resource;
import com.springrts.ai.oo.Unit;
import com.springrts.ai.oo.UnitDef;
import com.springrts.ai.oo.WeaponDef;
import com.springrts.ai.oo.WeaponMount;
import java.util.Collection;
import java.util.logging.Logger;

import nulloojavaai.militarymanager.battlegroup.BattleGroup;
import nulloojavaai.militarymanager.toplevel.clustering.deterministic.DeterministicCentroid;
import nulloojavaai.militarymanager.toplevel.clustering.force.Force;
import nulloojavaai.militarymanager.toplevel.clustering.force.ForceFactory;
import nulloojavaai.utility.SpringCommunications;

/**
 *
 * @author gajop
 */
public class SimpleForceFactory implements ForceFactory {
    public final double METAL_VALUE = 15;

    public Force generate(BattleGroup battleGroup) {
        SimpleForce newForce = new SimpleForce(spring, spring.getClb().getGame().getCurrentFrame(), battleGroup);
        return generateFields(battleGroup.getUnits(), newForce);
    }

    public Force generate(DeterministicCentroid clusteredGroup) {
    	int teamId = -1;
    	if (!clusteredGroup.getAssignments().isEmpty()) {
    		teamId = clusteredGroup.getAssignments().get(0).getTeam();
    	}
    	SimpleForce newForce = new SimpleForce(spring, clusteredGroup.getCenter(), spring.getClb().getGame().getCurrentFrame(), teamId);
        return generateFields(clusteredGroup.getAssignments(), newForce);
    }

    SpringCommunications spring;
    Logger log;

    public SimpleForceFactory(SpringCommunications spring) {
        this.spring = spring;
        this.log = spring.getLogger("force-factory");
    }

    private SimpleForce generateFields(Collection<Unit> units, 
            SimpleForce force) {
        if (!units.isEmpty()) {
            double hp = 0;
            double dpf = 0;
            double maxSpeed = 0;
            double value = 0;
            double range = 0;
            AIFloat3 velocity = new AIFloat3(0.0f, 0.0f, 0.0f);
            for (Unit unit : units) {
            	if (unit.isBeingBuilt()) {
            		continue;
            	}
            	velocity.x += unit.getVel().x;
            	velocity.y += unit.getVel().y;
            	velocity.z += unit.getVel().z;
            	UnitDef unitDef = unit.getDef();
            	if (unitDef == null) {
            		log.severe("unitDef not found for unit of id: " + unit.getUnitId());
            		continue;
            	}                
                hp += unit.getHealth();
                maxSpeed += unitDef.getSpeed();                
                for (Resource resource : spring.getClb().getResources()) {
                    if (resource.getName().equals("Metal")) {                    	
                        value += METAL_VALUE * unitDef.getCost(resource);
                    } else if (resource.getName().equals("Solar")) {
                        value += unitDef.getCost(resource);
                    }
                }
                for (WeaponMount weaponMount : unitDef.getWeaponMounts()) {
                    WeaponDef weaponDef = weaponMount.getWeaponDef();
                    range += weaponDef.getRange();
                    dpf += weaponDef.getDamage().getTypes().get(0) /
                            weaponDef.getReload();
                }
            }
            velocity.x /= units.size();
            velocity.y /= units.size();
            velocity.z /= units.size();
            maxSpeed /= units.size();
            range /= units.size();
            force.setVelocity(velocity);
            force.setHp(hp);
            force.setDpf(dpf);
            force.setMaxSpeed(maxSpeed);
            force.setValue(value);
            force.setRange(range);
        }
        return force;
    }
}
