/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubWeaponMount extends AbstractWeaponMount implements WeaponMount {

	public void setUnitDefId(int unitDefId) {
		this.unitDefId = unitDefId;
	}
	private int unitDefId = 0;
	@Override
	public int getUnitDefId() {
		return unitDefId;
	}

	public void setUnitDef(UnitDef unitDef) {
		this.unitDef = unitDef;
	}
	private UnitDef unitDef = null;
	@Override
	public UnitDef getUnitDef() {
		return unitDef;
	}

	public void setWeaponMountId(int weaponMountId) {
		this.weaponMountId = weaponMountId;
	}
	private int weaponMountId = 0;
	@Override
	public int getWeaponMountId() {
		return weaponMountId;
	}

	public void setName(String name) {
		this.name = name;
	}
	private String name = "";
	@Override
	public String getName() {
		return name;
	}

	public void setWeaponDef(WeaponDef weaponDef) {
		this.weaponDef = weaponDef;
	}
	private WeaponDef weaponDef = null;
	@Override
	public WeaponDef getWeaponDef() {
		return weaponDef;
	}

	public void setSlavedTo(int slavedTo) {
		this.slavedTo = slavedTo;
	}
	private int slavedTo = 0;
	@Override
	public int getSlavedTo() {
		return slavedTo;
	}

	public void setMainDir(AIFloat3 mainDir) {
		this.mainDir = mainDir;
	}
	private AIFloat3 mainDir = null;
	@Override
	public AIFloat3 getMainDir() {
		return mainDir;
	}

	public void setMaxAngleDif(float maxAngleDif) {
		this.maxAngleDif = maxAngleDif;
	}
	private float maxAngleDif = 0;
	@Override
	public float getMaxAngleDif() {
		return maxAngleDif;
	}

	/**
	 * How many seconds of fuel it costs for the owning unit to fire this weapon.
	 */
	public void setFuelUsage(float fuelUsage) {
		this.fuelUsage = fuelUsage;
	}
	private float fuelUsage = 0;
	@Override
	public float getFuelUsage() {
		return fuelUsage;
	}

	/**
	 * Returns the bit field value denoting the categories this weapon should
	 * not target.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public void setBadTargetCategory(int badTargetCategory) {
		this.badTargetCategory = badTargetCategory;
	}
	private int badTargetCategory = 0;
	@Override
	public int getBadTargetCategory() {
		return badTargetCategory;
	}

	/**
	 * Returns the bit field value denoting the categories this weapon should
	 * target, excluding all others.
	 * @see Game#getCategoryFlag
	 * @see Game#getCategoryName
	 */
	public void setOnlyTargetCategory(int onlyTargetCategory) {
		this.onlyTargetCategory = onlyTargetCategory;
	}
	private int onlyTargetCategory = 0;
	@Override
	public int getOnlyTargetCategory() {
		return onlyTargetCategory;
	}

}

