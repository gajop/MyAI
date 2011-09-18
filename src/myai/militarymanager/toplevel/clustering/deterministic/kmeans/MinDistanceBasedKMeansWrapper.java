package myai.militarymanager.toplevel.clustering.deterministic.kmeans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import myai.militarymanager.toplevel.clustering.deterministic.DeterministicCentroid;
import myai.militarymanager.toplevel.clustering.deterministic.DeterministicClustering;
import myai.militarymanager.toplevel.clustering.deterministic.DeterministicClusteringResult;
import myai.utility.VectorUtil;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.Unit;

public class MinDistanceBasedKMeansWrapper implements DeterministicClustering { //fear not, java supports class names up to 65536 characters
	Map<Integer, List<AIFloat3>> clusterSets = new HashMap<Integer, List<AIFloat3>>();
	int k = 1;
	double minClusterDistance;
    public DeterministicClusteringResult cluster(List<Unit> units) {
        if (units.isEmpty()) {
            return new DeterministicClusteringResult(new LinkedList<DeterministicCentroid>());
        }
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
                        
            boolean failed = false;
            for (DeterministicCentroid first : result.getCentroids()) { //checks to see if min intra cluster distance exceeds a given constant
                for (DeterministicCentroid second : result.getCentroids()) {
                	if (first.equals(second)) {
                		continue;
                	}
                	double distance = VectorUtil.distance(first.getCenter(), second.getCenter());
                	if (distance < minClusterDistance) {
                		failed = true;
                		break;
                	}
                }            	
                if (failed) {
                	break;
                }
            }
            
            if (failed) { //checks to see if k should be increased or decreased
            	k--;
            	decreased = true;
            } else {
            	bestResult = result;
            	List<AIFloat3> centroids = new LinkedList<AIFloat3>();
                for (DeterministicCentroid centroid : result.getCentroids()) {
                	centroids.add(centroid.getCenter());
                }
            	clusterSets.put(realK, centroids);
            	if (k == units.size()) {
            		break;
            	}
            	k++;            	
            	increased = true;
            }
        }
        return bestResult;
    }
	public MinDistanceBasedKMeansWrapper(double minClusterDistance) {
		this.minClusterDistance = minClusterDistance;
	}
    
    
}
