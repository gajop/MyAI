/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel.clustering.deterministic;

import java.util.List;

/**
 *
 * @author gajop
 */
public class DeterministicClusteringResult {
    List<DeterministicCentroid> centroids;

    public DeterministicClusteringResult(List<DeterministicCentroid> centroids) {
        this.centroids = centroids;
    }

    public List<DeterministicCentroid> getCentroids() {
        return centroids;
    }

    public void setCentroids(List<DeterministicCentroid> centroids) {
        this.centroids = centroids;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DeterministicClusteringResult other = (DeterministicClusteringResult) obj;
        if (this.centroids != other.centroids && (this.centroids == null || !this.centroids.equals(other.centroids))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.centroids != null ? this.centroids.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "DeterministicClusteringResult{" + "centroids=" + centroids + '}';
    }

}
