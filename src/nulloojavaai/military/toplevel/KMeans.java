/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.military.toplevel;

import com.springrts.ai.AIFloat3;
import com.springrts.ai.oo.Unit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.vecmath.Vector3f;

/**
 *
 * @author gajop
 */
public class KMeans implements DeterministicClustering {
    int k;

    public void setK(int k) {
        this.k = k;
    }

    public int getK() {
        return k;
    }

    public KMeans(int k) {
        this.k = k;
    }
    
    public DeterministicClusteringResult cluster(List<Unit> units) {
        if (units.size() < k) {
            throw new RuntimeException("kmeans requires k smaller than amount of samples");
        }
        ArrayList<DeterministicCentroid> centroids = new ArrayList<DeterministicCentroid>();
        Random random = new Random();
        for (int i = 0; i < k; i++) {
            Unit randomUnit = units.get(random.nextInt(units.size()));
            centroids.add(new DeterministicCentroid(randomUnit.getPos(), new LinkedList<Unit>()));
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
        } while (totalError > 5);
        DeterministicClusteringResult results = new DeterministicClusteringResult(centroids);
        return results;
    }
    
}
