/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.Unit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import nulloojavaai.utility.VectorUtil;

/**
 *
 * @author gajop
 */
public class KMeansWrapper implements DeterministicClustering {
	Map<Integer, List<AIFloat3>> clusterSets = new HashMap<Integer, List<AIFloat3>>();
    public DeterministicClusteringResult cluster(List<Unit> units) {
        if (units.isEmpty()) {
            return new DeterministicClusteringResult(new LinkedList<DeterministicCentroid>());
        }
        int k = (units.size() >= 4) ? units.size() / 4 : 1;
        DeterministicClusteringResult bestResult = null;
        double bestEvaluation = Double.MIN_VALUE;
        boolean improved;
        do {            
            improved = false;
            DeterministicClusteringResult result;
            if (clusterSets.containsKey(k)) {
            	List<AIFloat3> oldCluster = clusterSets.get(k);
            	result = KMeans.cluster(k, units, oldCluster);
            } else {
            	result = KMeans.cluster(k, units);	
            }       
             
            for (Iterator<DeterministicCentroid> i = result.centroids.iterator(); i.hasNext(); ) {
            	DeterministicCentroid centroid = i.next();
            	if (centroid.getAssignments().isEmpty()) {
            		i.remove();
            	}
            }
            double evaluation = (intraClusterDistance(result) + Double.MIN_VALUE)
                    / (interClusterDistance(result) + Double.MIN_VALUE);
            if (bestEvaluation < evaluation) {
                bestEvaluation = evaluation;
                bestResult = result;
                improved = true;
                List<AIFloat3> centroids = new LinkedList<AIFloat3>();
                for (DeterministicCentroid centroid : result.centroids) {
                	centroids.add(centroid.center);
                }
                clusterSets.put(k, centroids);
            }
            break;
        } while (improved && k <= units.size());
        return bestResult;
    }

    private double intraClusterDistance(DeterministicClusteringResult result) {
        double averageMinIntraClusterDistance = 0;
        if (!result.centroids.isEmpty()) {
            for (DeterministicCentroid first : result.getCentroids()) {
                double minIntraClusterDistance = Double.MAX_VALUE;
                for (DeterministicCentroid second : result.getCentroids()) {
                    if (!first.equals(second)) {
                        double distance = VectorUtil.distance(first.getCenter(),
                                second.getCenter());
                        if (minIntraClusterDistance > distance) {
                            minIntraClusterDistance = distance;
                        }
                    }
                }
                averageMinIntraClusterDistance += minIntraClusterDistance;
            }
            averageMinIntraClusterDistance /= result.centroids.size();
        }
        return averageMinIntraClusterDistance;
    }

    private double interClusterDistance(DeterministicClusteringResult result) {
        double totalInterClusterDistance = 0;
        for (DeterministicCentroid centroid : result.getCentroids()) {            
            for (Unit unit: centroid.getAssignments()) {
                totalInterClusterDistance += VectorUtil.distance(centroid.getCenter(), unit.getPos());
            }            
        }
        return totalInterClusterDistance;
    }
}
