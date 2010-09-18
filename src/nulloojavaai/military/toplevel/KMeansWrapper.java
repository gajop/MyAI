/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.military.toplevel;

import com.springrts.ai.oo.Unit;
import java.util.LinkedList;
import java.util.List;
import javax.vecmath.Vector3f;
import nulloojavaai.utility.VectorUtil;

/**
 *
 * @author gajop
 */
public class KMeansWrapper implements DeterministicClustering {

    public DeterministicClusteringResult cluster(List<Unit> units) {
        if (units.size() < 1) {
            return new DeterministicClusteringResult(new LinkedList<DeterministicCentroid>());
        }
        int k = (units.size() >= 4) ? units.size() / 4 : 1;
        DeterministicClusteringResult bestResult = null;
        double bestEvaluation = Double.MIN_VALUE;
        boolean improved;
        do {            
            improved = false;
            for (int i = 0; i < 5; ++i) {
                KMeans kmeans = new KMeans(k);
                DeterministicClusteringResult result = kmeans.cluster(units);
                double evaluation = (intraClusterDistance(result) + Double.MIN_VALUE)
                        / (interClusterDistance(result) + Double.MIN_VALUE);
                if (bestEvaluation < evaluation) {
                    bestEvaluation = evaluation;
                    bestResult = result;
                    improved = true;
                }
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
