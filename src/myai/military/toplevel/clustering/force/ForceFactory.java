/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.military.toplevel.clustering.force;

import myai.military.battlegroup.BattleGroup;
import myai.military.toplevel.clustering.deterministic.DeterministicCentroid;

/**
 *
 * @author gajop
 */
public interface ForceFactory {
    Force generate(BattleGroup battleGroup);
    Force generate(DeterministicCentroid clusteredGroup);
}
