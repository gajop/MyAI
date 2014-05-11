/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface FeatureDef extends Comparable<FeatureDef> {

	public int getFeatureDefId();

	public String getName();

	public String getDescription();

	public String getFileName();

	public float getContainedResource(Resource resource);

	public float getMaxHealth();

	public float getReclaimTime();

	/**
	 * Used to see if the object can be overrun by units of a certain heavyness
	 */
	public float getMass();

	public boolean isUpright();

	public int getDrawType();

	public String getModelName();

	/**
	 * Used to determine whether the feature is resurrectable.
	 * 
	 * @return  -1: (default) only if it is the 1st wreckage of
	 *              the UnitDef it originates from
	 *           0: no, never
	 *           1: yes, always
	 */
	public int getResurrectable();

	public int getSmokeTime();

	public boolean isDestructable();

	public boolean isReclaimable();

	public boolean isBlocking();

	public boolean isBurnable();

	public boolean isFloating();

	public boolean isNoSelect();

	public boolean isGeoThermal();

	/**
	 * Name of the FeatureDef that this turns into when killed (not reclaimed).
	 */
	public String getDeathFeature();

	/**
	 * Size of the feature along the X axis - in other words: height.
	 * each size is 8 units
	 */
	public int getXSize();

	/**
	 * Size of the feature along the Z axis - in other words: width.
	 * each size is 8 units
	 */
	public int getZSize();

	public java.util.Map<String, String> getCustomParams();

}

