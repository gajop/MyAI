/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.military.toplevel;

import com.springrts.ai.oo.Unit;
import java.util.List;

/**
 * The "Deterministic" means a type of clustering which produces clusters in
 * which data points are assigned to different clusters in a deterministic
 * fashion. This does not imply that the clustering algorithm isn't using
 * any sort of non-deterministic process, like randomization.
 * @author gajop
 */
public interface DeterministicClustering {
    DeterministicClusteringResult cluster(List<Unit> units);
}
