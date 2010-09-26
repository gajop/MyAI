/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.militarymanager.toplevel.clustering.force;

import nulloojavaai.militarymanager.battlegroup.BattleGroup;
import nulloojavaai.militarymanager.toplevel.clustering.deterministic.DeterministicCentroid;

/**
 *
 * @author gajop
 */
public interface ForceFactory {
    Force generate(BattleGroup battleGroup);
    Force generate(DeterministicCentroid clusteredGroup);
}
