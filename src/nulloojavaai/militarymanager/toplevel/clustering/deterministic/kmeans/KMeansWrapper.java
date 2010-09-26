/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel.clustering.deterministic.kmeans;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.Unit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import nulloojavaai.militarymanager.toplevel.clustering.deterministic.DeterministicCentroid;
import nulloojavaai.militarymanager.toplevel.clustering.deterministic.DeterministicClustering;
import nulloojavaai.militarymanager.toplevel.clustering.deterministic.DeterministicClusteringResult;
import nulloojavaai.utility.VectorUtil;

/**
 *
 * @author gajop
 */
public class KMeansWrapper implements DeterministicClustering {
	Map<Integer, List<AIFloat3>> clusterSets = new HashMap<Integer, List<AIFloat3>>();
	int k = 1;
    public DeterministicClusteringResult cluster(List<Unit> units) {
        if (units.isEmpty()) {
            return new DeterministicClusteringResult(new LinkedList<DeterministicCentroid>());
        }
       // k = (units.size() >= 4) ? units.size() / 4 : 1;
        if (k > units.size()) {
        	k = units.size();
        }
        DeterministicClusteringResult bestResult = null;    
        boolean increased = false;
        boolean decreased = false;
        while (!increased || !decreased) {            
            DeterministicClusteringResult result;
            if (clusterSets.containsKey(k)) {
            	List<AIFloat3> oldCluster = clusterSets.get(k);
            	result = KMeans.cluster(k, units, oldCluster);
            } else {
            	result = KMeans.cluster(k, units);	
            }       
             
            for (Iterator<DeterministicCentroid> i = result.getCentroids().iterator(); i.hasNext(); ) { //remove empty clusters
            	DeterministicCentroid centroid = i.next();
            	if (centroid.getAssignments().isEmpty()) {
            		i.remove();
            	}
            }
            int realK = result.getCentroids().size();
            double MIN_CLUSTER_DISTANCE = 200;
            boolean failed = false;
            for (DeterministicCentroid first : result.getCentroids()) {
                for (DeterministicCentroid second : result.getCentroids()) {
                	if (first.equals(second)) {
                		continue;
                	}
                	double distance = VectorUtil.distance(first.getCenter(), second.getCenter());
                	if (distance < MIN_CLUSTER_DISTANCE) {
                		failed = true;
                		break;
                	}
                }            	
                if (failed) {
                	break;
                }
            }
            if (failed) {
            	k--;
            	decreased = true;
            } else {
            	bestResult = result;
            	if (k == units.size()) {
            		break;
            	}
            	k++;            	
            	increased = true;
            }
            /*double evaluation = (intraClusterDistance(result) + Double.MIN_VALUE)
                    / (interClusterDistance(result) + Double.MIN_VALUE);
            if (bestEvaluation < evaluation) {
                bestEvaluation = evaluation;
                bestResult = result;
                improved = true;
                List<AIFloat3> centroids = new LinkedList<AIFloat3>();
                for (DeterministicCentroid centroid : result.centroids) {
                	centroids.add(centroid.center);
                }
                clusterSets.put(realK, centroids);
            }
            break;*/
        }
        return bestResult;
    }

    private double intraClusterDistance(DeterministicClusteringResult result) {
        double averageMinIntraClusterDistance = 0;
        if (!result.getCentroids().isEmpty()) {
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
            averageMinIntraClusterDistance /= result.getCentroids().size();
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
