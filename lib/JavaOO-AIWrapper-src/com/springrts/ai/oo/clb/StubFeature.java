/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubFeature extends AbstractFeature implements Feature {

	public void setFeatureId(int featureId) {
		this.featureId = featureId;
	}
	private int featureId = 0;
	@Override
	public int getFeatureId() {
		return featureId;
	}

	public void setDef(FeatureDef def) {
		this.def = def;
	}
	private FeatureDef def = null;
	@Override
	public FeatureDef getDef() {
		return def;
	}

	public void setHealth(float health) {
		this.health = health;
	}
	private float health = 0;
	@Override
	public float getHealth() {
		return health;
	}

	public void setReclaimLeft(float reclaimLeft) {
		this.reclaimLeft = reclaimLeft;
	}
	private float reclaimLeft = 0;
	@Override
	public float getReclaimLeft() {
		return reclaimLeft;
	}

	public void setPosition(AIFloat3 position) {
		this.position = position;
	}
	private AIFloat3 position = null;
	@Override
	public AIFloat3 getPosition() {
		return position;
	}

}

