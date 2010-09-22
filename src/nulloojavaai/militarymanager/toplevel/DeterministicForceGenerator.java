/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel;

import com.springrts.ai.AICommand;
import com.springrts.ai.command.AddPointDrawAICommand;
import com.springrts.ai.command.CreateLineFigureDrawerAICommand;
import com.springrts.ai.command.DeleteFigureDrawerAICommand;
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
    DeterministicClustering kmeans;
    boolean drawClusters = true;
    
    public DeterministicForceGenerator(SpringCommunications spring,
            MilitaryManager military, ForceFactory forceFactory) {
        super(military, forceFactory);
        this.spring = spring;
        this.kmeans =  new MinDistanceBasedKMeansWrapper(400);
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

            if (drawClusters) {
	            int centroidNum = 0;
	            DeleteFigureDrawerAICommand command = new DeleteFigureDrawerAICommand(42);
	            spring.handleEngineCommand(command);
	            for (DeterministicCentroid centroid : result.getCentroids()) {
	                for (Unit unit : centroid.getAssignments()) {
	                    spring.drawLine(unit.getPos(), centroid.getCenter());
	                }
	                centroidNum++;
	            }
            }
        }
        return forces;
    }

	public boolean isDrawClusters() {
		return drawClusters;
	}

	public void setDrawClusters(boolean drawClusters) {
		this.drawClusters = drawClusters;
	}

}
