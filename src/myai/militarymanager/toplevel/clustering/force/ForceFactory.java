/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.militarymanager.toplevel.clustering.force;

import myai.militarymanager.battlegroup.BattleGroup;
import myai.militarymanager.toplevel.clustering.deterministic.DeterministicCentroid;

/**
 *
 * @author gajop
 */
public interface ForceFactory {
    Force generate(BattleGroup battleGroup);
    Force generate(DeterministicCentroid clusteredGroup);
}
