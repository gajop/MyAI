/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.military.toplevel.clustering.force;

import com.springrts.ai.oo.AIFloat3;

import myai.military.battlegroup.BattleGroup;

/**
 *
 * @author gajop
 */
public abstract class Force {
    private BattleGroup originalBattleGroup;
    private AIFloat3 originalPosition;
    int frameCreated;

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

    public Force(BattleGroup originalBattleGroup, int frameCreated) {
        this.originalBattleGroup = originalBattleGroup;    
        this.frameCreated = frameCreated;
    }

    public Force(AIFloat3 originalPosition, int frameCreated) {
        this.originalPosition = originalPosition;
        this.frameCreated = frameCreated;
    }

	public int getFrameCreated() {
		return frameCreated;
	}

	public void setFrameCreated(int frameCreated) {
		this.frameCreated = frameCreated;
	}


}
