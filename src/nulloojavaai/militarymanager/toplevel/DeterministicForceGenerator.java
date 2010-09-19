/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel;

import com.springrts.ai.oo.Unit;
import java.util.LinkedList;
import java.util.List;

import nulloojavaai.militarymanager.BattleGroup;
import nulloojavaai.militarymanager.MilitaryManager;
import nulloojavaai.utility.SpringCommunications;

/**
 * Generates forces based on current BattleGroups and clustered enemy units
 * @author gajop
 */
public class DeterministicForceGenerator extends ForceGenerator {
    SpringCommunications spring;
    
    public DeterministicForceGenerator(SpringCommunications spring,
            MilitaryManager military, ForceFactory forceFactory) {
        super(military, forceFactory);
        this.spring = spring;
    }

    public List<Force> generateForces() {
        List<Force> forces = new LinkedList<Force>();
        for (BattleGroup battleGroup : this.militaryManager.getBattleGroups()) {
            forces.add(forceFactory.generate(battleGroup));
        }
        List<Unit> enemyUnits = spring.getClb().getEnemyUnits();
        if (!enemyUnits.isEmpty()) {
            KMeansWrapper kmeans = new KMeansWrapper();
            DeterministicClusteringResult result = kmeans.cluster(enemyUnits);
            for (DeterministicCentroid centroid : result.getCentroids()) {
                forces.add(forceFactory.generate(centroid));
            }
            /* DRAWING DOESNT WORK ATM
            int centroidNum = 0;
            for (DeterministicCentroid centroid : result.getCentroids()) {
                AICommand drawCommand = new AddPointDrawAICommand(centroid.getCenter(), "test");
                for (Unit unit : centroid.getAssignments()) {
                    spring.handleEngineCommand(drawCommand);
                    drawCommand = new AddLineDrawAICommand(unit.getPos(),
                            centroid.getCenter());
                    spring.handleEngineCommand(drawCommand);
                }
                centroidNum++;
            }*/
        }
        return forces;
    }

}
