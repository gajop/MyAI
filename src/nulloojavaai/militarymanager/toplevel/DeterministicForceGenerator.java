/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel;

import com.springrts.ai.AICommand;
import com.springrts.ai.command.AddPointDrawAICommand;
import com.springrts.ai.command.CreateLineFigureDrawerAICommand;
import com.springrts.ai.oo.Unit;
import java.util.LinkedList;
import java.util.List;

import nulloojavaai.militarymanager.MilitaryManager;
import nulloojavaai.militarymanager.battlegroup.BattleGroup;
import nulloojavaai.utility.SpringCommunications;

/**
 * Generates forces based on current BattleGroups and clustered enemy units
 * @author gajop
 */
public class DeterministicForceGenerator extends ForceGenerator {
    SpringCommunications spring;
    KMeansWrapper kmeans = new KMeansWrapper();
    
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
            DeterministicClusteringResult result = kmeans.cluster(enemyUnits);
            for (DeterministicCentroid centroid : result.getCentroids()) {
                forces.add(forceFactory.generate(centroid));
            }
/*
            int centroidNum = 0;
            for (DeterministicCentroid centroid : result.getCentroids()) {
                AICommand drawCommand = new AddPointDrawAICommand(centroid.getCenter(), "test");
                for (Unit unit : centroid.getAssignments()) {
                    drawCommand = new CreateLineFigureDrawerAICommand(unit.getPos(),
                            centroid.getCenter(), 1, false, 10000, 0, 42);
                    spring.handleEngineCommand(drawCommand);
                }
                centroidNum++;
            }*/
        }
        return forces;
    }

}
