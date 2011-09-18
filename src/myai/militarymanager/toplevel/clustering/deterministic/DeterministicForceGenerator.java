/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.militarymanager.toplevel.clustering.deterministic;

import com.springrts.ai.command.DeleteFigureDrawerAICommand;
import com.springrts.ai.oo.Unit;
import java.util.LinkedList;
import java.util.List;

import myai.militarymanager.MilitaryManager;
import myai.militarymanager.battlegroup.BattleGroup;
import myai.militarymanager.toplevel.clustering.force.Force;
import myai.militarymanager.toplevel.clustering.force.ForceFactory;
import myai.militarymanager.toplevel.clustering.force.ForceGenerator;
import myai.utility.SpringCommunications;

/**
 * Generates forces based on current BattleGroups and clustered enemy units
 * @author gajop
 */
public class DeterministicForceGenerator extends ForceGenerator {
    SpringCommunications spring;
    DeterministicClustering clustering;
    boolean drawClusters = false;
    
    public DeterministicForceGenerator(SpringCommunications spring,
            MilitaryManager military, ForceFactory forceFactory,
            DeterministicClustering clustering) {
        super(military, forceFactory);
        this.spring = spring;
        this.clustering = clustering;
    }

    /*
     * Generate enemy forces from currently visible or assumed enemy units
     */
    public List<Force> generateEnemyForces() {
        List<Force> forces = new LinkedList<Force>();        
        List<Unit> enemyUnits = spring.getClb().getEnemyUnits();
        if (!enemyUnits.isEmpty()) {            
            DeterministicClusteringResult result = clustering.cluster(enemyUnits);
            for (DeterministicCentroid centroid : result.getCentroids()) {
                forces.add(this.getForceFactory().generate(centroid));
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
