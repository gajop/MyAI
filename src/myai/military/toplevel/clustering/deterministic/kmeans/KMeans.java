/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.military.toplevel.clustering.deterministic.kmeans;

import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.oo.clb.Unit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.vecmath.Vector3f;

import myai.military.toplevel.clustering.deterministic.DeterministicCentroid;
import myai.military.toplevel.clustering.deterministic.DeterministicClustering;
import myai.military.toplevel.clustering.deterministic.DeterministicClusteringResult;
import myai.utility.VectorUtil;

/**
 *
 * @author gajop
 */
public abstract class KMeans implements DeterministicClustering {
	
	public static DeterministicClusteringResult cluster(int k, List<Unit> units, List<AIFloat3> initialCentroids) {
        if (units.size() < k) {
            throw new RuntimeException("kmeans requires k smaller than amount of samples");
        }
        Random random = new Random();
        List<DeterministicCentroid> centroids = new ArrayList<DeterministicCentroid>();
        for (AIFloat3 centroid : initialCentroids) {
        	if (centroid != null) {
        		centroids.add(new DeterministicCentroid(centroid, new LinkedList<Unit>()));
        	} else {
        		centroids.add(new DeterministicCentroid(units.get(random.nextInt(units.size())).getPos(), new LinkedList<Unit>()));
        	}
        }
	    double totalError;
	    int iter = 0;
	    do {
	        totalError = 0;
	        for (DeterministicCentroid centroid : centroids) {
	            centroid.getAssignments().clear();
	        }
	        for (Unit unit : units) { //assign clusters
			    double closestDistance = Double.MAX_VALUE;
			    DeterministicCentroid selectedCentroid = null;
			    for (DeterministicCentroid centroid : centroids) {
			        AIFloat3 centroidCenter = centroid.getCenter();
			        AIFloat3 unitCenter = unit.getPos();
			        AIFloat3 result = new AIFloat3(centroidCenter);
			        result.negate();
			        result.add(unitCenter);
			        double distance = result.x * result.x + result.y * result.y +
			                result.z * result.z;
			        if (distance < closestDistance) {
			            selectedCentroid = centroid;
			            closestDistance = distance;
			        }
			    }
			    selectedCentroid.getAssignments().add(unit);
			}
		
			for (DeterministicCentroid centroid : centroids) { //move centroids
		        if (centroid.getAssignments().isEmpty()) {
		            centroid.setCenter(units.get(random.nextInt(units.size())).getPos());
		            continue;
		        }
		        AIFloat3 center = VectorUtil.averageFromUnits(centroid.getAssignments());
		        if (!center.equals(centroid.getCenter())) {
		        	AIFloat3 tmp = new AIFloat3(center);
		            tmp.negate();
		            tmp.add(centroid.getCenter());
		            totalError += tmp.x * tmp.x + tmp.y * tmp.y + tmp.z * tmp.z;
		            centroid.setCenter(new AIFloat3(center));
		        }
		    }
		} while (totalError > 5); //magic
	DeterministicClusteringResult results = new DeterministicClusteringResult(centroids);
	return results;
	}
    
    public static DeterministicClusteringResult cluster(int k, List<Unit> units) {
        ArrayList<AIFloat3> centroids = new ArrayList<AIFloat3>();
        Random random = new Random();
        for (int i = 0; i < k; i++) {
            Unit randomUnit = units.get(random.nextInt(units.size()));
            centroids.add(randomUnit.getPos());
        }
        return KMeans.cluster(k, units, centroids);
    }
    
}
