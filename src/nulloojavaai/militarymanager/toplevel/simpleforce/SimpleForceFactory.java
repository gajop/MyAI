/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel.simpleforce;

import com.springrts.ai.oo.Resource;
import com.springrts.ai.oo.Unit;
import com.springrts.ai.oo.UnitDef;
import com.springrts.ai.oo.WeaponDef;
import com.springrts.ai.oo.WeaponMount;
import java.util.Collection;

import nulloojavaai.militarymanager.BattleGroup;
import nulloojavaai.militarymanager.toplevel.DeterministicCentroid;
import nulloojavaai.militarymanager.toplevel.Force;
import nulloojavaai.militarymanager.toplevel.ForceFactory;
import nulloojavaai.utility.SpringCommunications;

/**
 *
 * @author gajop
 */
public class SimpleForceFactory implements ForceFactory {
    public final double METAL_VALUE = 15;

    public Force generate(BattleGroup battleGroup) {
        SimpleForce newForce = new SimpleForce(spring, battleGroup);
        return generateFields(battleGroup.getUnits(), newForce);
    }

    public Force generate(DeterministicCentroid clusteredGroup) {
        SimpleForce newForce = new SimpleForce(spring, clusteredGroup.getCenter());
        return generateFields(clusteredGroup.getAssignments(), newForce);
    }

    SpringCommunications spring;

    public SimpleForceFactory(SpringCommunications spring) {
        this.spring = spring;
    }

    private SimpleForce generateFields(Collection<Unit> units, 
            SimpleForce force) {
        if (!units.isEmpty()) {
            double hp = 0;
            double dpf = 0;
            double speed = 0;
            double value = 0;
            double range = 0;
            for (Unit unit : units) {
                UnitDef unitDef = unit.getDef();
                hp += unit.getHealth();
                speed += unitDef.getSpeed();                
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
            speed /= units.size();
            range /= units.size();
            force.setHp(hp);
            force.setDpf(dpf);
            force.setSpeed(speed);
            force.setValue(value);
            force.setRange(range);
        }
        return force;
    }
}
