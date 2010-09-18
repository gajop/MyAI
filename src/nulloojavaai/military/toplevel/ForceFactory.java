/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.military.toplevel;

import nulloojavaai.military.BattleGroup;

/**
 *
 * @author gajop
 */
public interface ForceFactory {
    Force generate(BattleGroup battleGroup);
    Force generate(DeterministicCentroid clusteredGroup);
}
