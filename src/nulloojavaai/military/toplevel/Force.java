/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.military.toplevel;

import com.springrts.ai.AIFloat3;
import nulloojavaai.military.BattleGroup;

/**
 *
 * @author gajop
 */
public abstract class Force {
    private BattleGroup originalBattleGroup;
    private AIFloat3 originalPosition;

    public void setOriginalBattleGroup(BattleGroup originalBattleGroup) {
        this.originalBattleGroup = originalBattleGroup;
    }

    public void setOriginalPosition(AIFloat3 originalPosition) {
        this.originalPosition = originalPosition;
    }

    public BattleGroup getOriginalBattleGroup() {
        return originalBattleGroup;
    }

    public AIFloat3 getOriginalPosition() {
        return originalPosition;
    }

    public Force(BattleGroup originalBattleGroup) {
        this.originalBattleGroup = originalBattleGroup;        
    }

    public Force(AIFloat3 originalPosition) {
        this.originalPosition = originalPosition;
    }


}
