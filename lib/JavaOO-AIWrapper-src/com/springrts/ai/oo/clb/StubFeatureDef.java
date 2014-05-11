/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubFeatureDef extends AbstractFeatureDef implements FeatureDef {

	public void setFeatureDefId(int featureDefId) {
		this.featureDefId = featureDefId;
	}
	private int featureDefId = 0;
	@Override
	public int getFeatureDefId() {
		return featureDefId;
	}

	public void setName(String name) {
		this.name = name;
	}
	private String name = "";
	@Override
	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	private String description = "";
	@Override
	public String getDescription() {
		return description;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	private String fileName = "";
	@Override
	public String getFileName() {
		return fileName;
	}

	@Override
	public float getContainedResource(Resource resource) {
		return 0;
	}

	public void setMaxHealth(float maxHealth) {
		this.maxHealth = maxHealth;
	}
	private float maxHealth = 0;
	@Override
	public float getMaxHealth() {
		return maxHealth;
	}

	public void setReclaimTime(float reclaimTime) {
		this.reclaimTime = reclaimTime;
	}
	private float reclaimTime = 0;
	@Override
	public float getReclaimTime() {
		return reclaimTime;
	}

	/**
	 * Used to see if the object can be overrun by units of a certain heavyness
	 */
	public void setMass(float mass) {
		this.mass = mass;
	}
	private float mass = 0;
	@Override
	public float getMass() {
		return mass;
	}

	public void setUpright(boolean isUpright) {
		this.isUpright = isUpright;
	}
	private boolean isUpright = false;
	@Override
	public boolean isUpright() {
		return isUpright;
	}

	public void setDrawType(int drawType) {
		this.drawType = drawType;
	}
	private int drawType = 0;
	@Override
	public int getDrawType() {
		return drawType;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	private String modelName = "";
	@Override
	public String getModelName() {
		return modelName;
	}

	/**
	 * Used to determine whether the feature is resurrectable.
	 * 
	 * @return  -1: (default) only if it is the 1st wreckage of
	 *              the UnitDef it originates from
	 *           0: no, never
	 *           1: yes, always
	 */
	public void setResurrectable(int resurrectable) {
		this.resurrectable = resurrectable;
	}
	private int resurrectable = 0;
	@Override
	public int getResurrectable() {
		return resurrectable;
	}

	public void setSmokeTime(int smokeTime) {
		this.smokeTime = smokeTime;
	}
	private int smokeTime = 0;
	@Override
	public int getSmokeTime() {
		return smokeTime;
	}

	public void setDestructable(boolean isDestructable) {
		this.isDestructable = isDestructable;
	}
	private boolean isDestructable = false;
	@Override
	public boolean isDestructable() {
		return isDestructable;
	}

	public void setReclaimable(boolean isReclaimable) {
		this.isReclaimable = isReclaimable;
	}
	private boolean isReclaimable = false;
	@Override
	public boolean isReclaimable() {
		return isReclaimable;
	}

	public void setBlocking(boolean isBlocking) {
		this.isBlocking = isBlocking;
	}
	private boolean isBlocking = false;
	@Override
	public boolean isBlocking() {
		return isBlocking;
	}

	public void setBurnable(boolean isBurnable) {
		this.isBurnable = isBurnable;
	}
	private boolean isBurnable = false;
	@Override
	public boolean isBurnable() {
		return isBurnable;
	}

	public void setFloating(boolean isFloating) {
		this.isFloating = isFloating;
	}
	private boolean isFloating = false;
	@Override
	public boolean isFloating() {
		return isFloating;
	}

	public void setNoSelect(boolean isNoSelect) {
		this.isNoSelect = isNoSelect;
	}
	private boolean isNoSelect = false;
	@Override
	public boolean isNoSelect() {
		return isNoSelect;
	}

	public void setGeoThermal(boolean isGeoThermal) {
		this.isGeoThermal = isGeoThermal;
	}
	private boolean isGeoThermal = false;
	@Override
	public boolean isGeoThermal() {
		return isGeoThermal;
	}

	/**
	 * Name of the FeatureDef that this turns into when killed (not reclaimed).
	 */
	public void setDeathFeature(String deathFeature) {
		this.deathFeature = deathFeature;
	}
	private String deathFeature = "";
	@Override
	public String getDeathFeature() {
		return deathFeature;
	}

	/**
	 * Size of the feature along the X axis - in other words: height.
	 * each size is 8 units
	 */
	public void setXSize(int xSize) {
		this.xSize = xSize;
	}
	private int xSize = 0;
	@Override
	public int getXSize() {
		return xSize;
	}

	/**
	 * Size of the feature along the Z axis - in other words: width.
	 * each size is 8 units
	 */
	public void setZSize(int zSize) {
		this.zSize = zSize;
	}
	private int zSize = 0;
	@Override
	public int getZSize() {
		return zSize;
	}

	public void setCustomParams(java.util.Map<String, String> customParams) {
		this.customParams = customParams;
	}
	private java.util.Map<String, String> customParams = null;
	@Override
	public java.util.Map<String, String> getCustomParams() {
		return customParams;
	}

}

