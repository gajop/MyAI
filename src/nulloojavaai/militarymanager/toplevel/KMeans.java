/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.Unit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.vecmath.Vector3f;

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
	    do {
	        totalError = 0;
	        for (DeterministicCentroid centroid : centroids) {
	            centroid.assignments.clear();
	        }
	        for (Unit unit : units) { //assign clusters
	    double closestDistance = Double.MAX_VALUE;
	    DeterministicCentroid selectedCentroid = null;
	    for (DeterministicCentroid centroid : centroids) {
	        Vector3f centroidCenter = centroid.getCenter().toVector3f();
	        Vector3f unitCenter = unit.getPos().toVector3f();
	        Vector3f result = centroidCenter;
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
	        if (centroid.assignments.isEmpty()) {
	            centroid.center = units.get(random.nextInt(units.size())).getPos();
	            continue;
	        }
	        Vector3f center = new Vector3f(0, 0, 0);
	        for (Unit unit : centroid.assignments) {
	            center.add(unit.getPos().toVector3f());
	        }
	        center.scale(1.0f / centroid.assignments.size());
	        if (!center.equals(centroid.getCenter().toVector3f())) {
	            Vector3f tmp = new Vector3f(center);
	            tmp.negate();
	            tmp.add(centroid.getCenter().toVector3f());
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
