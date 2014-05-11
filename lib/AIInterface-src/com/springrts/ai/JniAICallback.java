/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai;


/**
 * Lets Java Skirmish AIs call back to the Spring engine.
 * We are using JNI for best speed.
 *
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class JniAICallback implements AICallback {

	static {
		System.loadLibrary("AIInterface");
	}

	private int skirmishAIId;

	public JniAICallback(int skirmishAIId) {
		this.skirmishAIId = skirmishAIId;
	}

	@Override
	public int SkirmishAI_getSkirmishAIId() {
		return this.skirmishAIId;
	}

	@Override
	public String Engine_Version_getMajor() {
		return this.Engine_Version_getMajor(this.skirmishAIId);
	}
	private native String Engine_Version_getMajor(int _skirmishAIId);

	/** @deprecated */
	@Override
	public String Engine_Version_getMinor() {
		return this.Engine_Version_getMinor(this.skirmishAIId);
	}
	private native String Engine_Version_getMinor(int _skirmishAIId);

	@Override
	public String Engine_Version_getPatchset() {
		return this.Engine_Version_getPatchset(this.skirmishAIId);
	}
	private native String Engine_Version_getPatchset(int _skirmishAIId);

	@Override
	public String Engine_Version_getCommits() {
		return this.Engine_Version_getCommits(this.skirmishAIId);
	}
	private native String Engine_Version_getCommits(int _skirmishAIId);

	@Override
	public String Engine_Version_getHash() {
		return this.Engine_Version_getHash(this.skirmishAIId);
	}
	private native String Engine_Version_getHash(int _skirmishAIId);

	@Override
	public String Engine_Version_getBranch() {
		return this.Engine_Version_getBranch(this.skirmishAIId);
	}
	private native String Engine_Version_getBranch(int _skirmishAIId);

	@Override
	public String Engine_Version_getAdditional() {
		return this.Engine_Version_getAdditional(this.skirmishAIId);
	}
	private native String Engine_Version_getAdditional(int _skirmishAIId);

	@Override
	public String Engine_Version_getBuildTime() {
		return this.Engine_Version_getBuildTime(this.skirmishAIId);
	}
	private native String Engine_Version_getBuildTime(int _skirmishAIId);

	@Override
	public boolean Engine_Version_isRelease() {
		return this.Engine_Version_isRelease(this.skirmishAIId);
	}
	private native boolean Engine_Version_isRelease(int _skirmishAIId);

	@Override
	public String Engine_Version_getNormal() {
		return this.Engine_Version_getNormal(this.skirmishAIId);
	}
	private native String Engine_Version_getNormal(int _skirmishAIId);

	@Override
	public String Engine_Version_getSync() {
		return this.Engine_Version_getSync(this.skirmishAIId);
	}
	private native String Engine_Version_getSync(int _skirmishAIId);

	@Override
	public String Engine_Version_getFull() {
		return this.Engine_Version_getFull(this.skirmishAIId);
	}
	private native String Engine_Version_getFull(int _skirmishAIId);

	@Override
	public int Teams_getSize() {
		return this.Teams_getSize(this.skirmishAIId);
	}
	private native int Teams_getSize(int _skirmishAIId);

	@Override
	public int SkirmishAIs_getSize() {
		return this.SkirmishAIs_getSize(this.skirmishAIId);
	}
	private native int SkirmishAIs_getSize(int _skirmishAIId);

	@Override
	public int SkirmishAIs_getMax() {
		return this.SkirmishAIs_getMax(this.skirmishAIId);
	}
	private native int SkirmishAIs_getMax(int _skirmishAIId);

	@Override
	public int SkirmishAI_getTeamId() {
		return this.SkirmishAI_getTeamId(this.skirmishAIId);
	}
	private native int SkirmishAI_getTeamId(int _skirmishAIId);

	@Override
	public int SkirmishAI_Info_getSize() {
		return this.SkirmishAI_Info_getSize(this.skirmishAIId);
	}
	private native int SkirmishAI_Info_getSize(int _skirmishAIId);

	@Override
	public String SkirmishAI_Info_getKey(int infoIndex) {
		return this.SkirmishAI_Info_getKey(this.skirmishAIId, infoIndex);
	}
	private native String SkirmishAI_Info_getKey(int _skirmishAIId, int infoIndex);

	@Override
	public String SkirmishAI_Info_getValue(int infoIndex) {
		return this.SkirmishAI_Info_getValue(this.skirmishAIId, infoIndex);
	}
	private native String SkirmishAI_Info_getValue(int _skirmishAIId, int infoIndex);

	@Override
	public String SkirmishAI_Info_getDescription(int infoIndex) {
		return this.SkirmishAI_Info_getDescription(this.skirmishAIId, infoIndex);
	}
	private native String SkirmishAI_Info_getDescription(int _skirmishAIId, int infoIndex);

	@Override
	public String SkirmishAI_Info_getValueByKey(String key) {
		return this.SkirmishAI_Info_getValueByKey(this.skirmishAIId, key);
	}
	private native String SkirmishAI_Info_getValueByKey(int _skirmishAIId, String key);

	@Override
	public int SkirmishAI_OptionValues_getSize() {
		return this.SkirmishAI_OptionValues_getSize(this.skirmishAIId);
	}
	private native int SkirmishAI_OptionValues_getSize(int _skirmishAIId);

	@Override
	public String SkirmishAI_OptionValues_getKey(int optionIndex) {
		return this.SkirmishAI_OptionValues_getKey(this.skirmishAIId, optionIndex);
	}
	private native String SkirmishAI_OptionValues_getKey(int _skirmishAIId, int optionIndex);

	@Override
	public String SkirmishAI_OptionValues_getValue(int optionIndex) {
		return this.SkirmishAI_OptionValues_getValue(this.skirmishAIId, optionIndex);
	}
	private native String SkirmishAI_OptionValues_getValue(int _skirmishAIId, int optionIndex);

	@Override
	public String SkirmishAI_OptionValues_getValueByKey(String key) {
		return this.SkirmishAI_OptionValues_getValueByKey(this.skirmishAIId, key);
	}
	private native String SkirmishAI_OptionValues_getValueByKey(int _skirmishAIId, String key);

	@Override
	public void Log_log(String msg) {
		this.Log_log(this.skirmishAIId, msg);
	}
	private native void Log_log(int _skirmishAIId, String msg);

	@Override
	public void Log_exception(String msg, int severety, boolean die) {
		this.Log_exception(this.skirmishAIId, msg, severety, die);
	}
	private native void Log_exception(int _skirmishAIId, String msg, int severety, boolean die);

	@Override
	public char DataDirs_getPathSeparator() {
		return this.DataDirs_getPathSeparator(this.skirmishAIId);
	}
	private native char DataDirs_getPathSeparator(int _skirmishAIId);

	@Override
	public String DataDirs_getConfigDir() {
		return this.DataDirs_getConfigDir(this.skirmishAIId);
	}
	private native String DataDirs_getConfigDir(int _skirmishAIId);

	@Override
	public String DataDirs_getWriteableDir() {
		return this.DataDirs_getWriteableDir(this.skirmishAIId);
	}
	private native String DataDirs_getWriteableDir(int _skirmishAIId);

	@Override
	public boolean DataDirs_locatePath(String path, int path_sizeMax, String relPath, boolean writeable, boolean create, boolean dir, boolean common) {
		return this.DataDirs_locatePath(this.skirmishAIId, path, path_sizeMax, relPath, writeable, create, dir, common);
	}
	private native boolean DataDirs_locatePath(int _skirmishAIId, String path, int path_sizeMax, String relPath, boolean writeable, boolean create, boolean dir, boolean common);

	@Override
	public String DataDirs_allocatePath(String relPath, boolean writeable, boolean create, boolean dir, boolean common) {
		return this.DataDirs_allocatePath(this.skirmishAIId, relPath, writeable, create, dir, common);
	}
	private native String DataDirs_allocatePath(int _skirmishAIId, String relPath, boolean writeable, boolean create, boolean dir, boolean common);

	@Override
	public int DataDirs_Roots_getSize() {
		return this.DataDirs_Roots_getSize(this.skirmishAIId);
	}
	private native int DataDirs_Roots_getSize(int _skirmishAIId);

	@Override
	public boolean DataDirs_Roots_getDir(String path, int path_sizeMax, int dirIndex) {
		return this.DataDirs_Roots_getDir(this.skirmishAIId, path, path_sizeMax, dirIndex);
	}
	private native boolean DataDirs_Roots_getDir(int _skirmishAIId, String path, int path_sizeMax, int dirIndex);

	@Override
	public boolean DataDirs_Roots_locatePath(String path, int path_sizeMax, String relPath, boolean writeable, boolean create, boolean dir) {
		return this.DataDirs_Roots_locatePath(this.skirmishAIId, path, path_sizeMax, relPath, writeable, create, dir);
	}
	private native boolean DataDirs_Roots_locatePath(int _skirmishAIId, String path, int path_sizeMax, String relPath, boolean writeable, boolean create, boolean dir);

	@Override
	public String DataDirs_Roots_allocatePath(String relPath, boolean writeable, boolean create, boolean dir) {
		return this.DataDirs_Roots_allocatePath(this.skirmishAIId, relPath, writeable, create, dir);
	}
	private native String DataDirs_Roots_allocatePath(int _skirmishAIId, String relPath, boolean writeable, boolean create, boolean dir);

	/** @deprecated */
	@Override
	public int Game_getCurrentFrame() {
		return this.Game_getCurrentFrame(this.skirmishAIId);
	}
	private native int Game_getCurrentFrame(int _skirmishAIId);

	@Override
	public int Game_getAiInterfaceVersion() {
		return this.Game_getAiInterfaceVersion(this.skirmishAIId);
	}
	private native int Game_getAiInterfaceVersion(int _skirmishAIId);

	@Override
	public int Game_getMyTeam() {
		return this.Game_getMyTeam(this.skirmishAIId);
	}
	private native int Game_getMyTeam(int _skirmishAIId);

	@Override
	public int Game_getMyAllyTeam() {
		return this.Game_getMyAllyTeam(this.skirmishAIId);
	}
	private native int Game_getMyAllyTeam(int _skirmishAIId);

	@Override
	public int Game_getPlayerTeam(int playerId) {
		return this.Game_getPlayerTeam(this.skirmishAIId, playerId);
	}
	private native int Game_getPlayerTeam(int _skirmishAIId, int playerId);

	@Override
	public int Game_getTeams() {
		return this.Game_getTeams(this.skirmishAIId);
	}
	private native int Game_getTeams(int _skirmishAIId);

	/** @deprecated */
	@Override
	public String Game_getTeamSide(int otherTeamId) {
		return this.Game_getTeamSide(this.skirmishAIId, otherTeamId);
	}
	private native String Game_getTeamSide(int _skirmishAIId, int otherTeamId);

	@Override
	public void Game_getTeamColor(int otherTeamId, short[] return_colorS3_out) {
		this.Game_getTeamColor(this.skirmishAIId, otherTeamId, return_colorS3_out);
	}
	private native void Game_getTeamColor(int _skirmishAIId, int otherTeamId, short[] return_colorS3_out);

	@Override
	public float Game_getTeamIncomeMultiplier(int otherTeamId) {
		return this.Game_getTeamIncomeMultiplier(this.skirmishAIId, otherTeamId);
	}
	private native float Game_getTeamIncomeMultiplier(int _skirmishAIId, int otherTeamId);

	@Override
	public int Game_getTeamAllyTeam(int otherTeamId) {
		return this.Game_getTeamAllyTeam(this.skirmishAIId, otherTeamId);
	}
	private native int Game_getTeamAllyTeam(int _skirmishAIId, int otherTeamId);

	@Override
	public float Game_getTeamResourceCurrent(int otherTeamId, int resourceId) {
		return this.Game_getTeamResourceCurrent(this.skirmishAIId, otherTeamId, resourceId);
	}
	private native float Game_getTeamResourceCurrent(int _skirmishAIId, int otherTeamId, int resourceId);

	@Override
	public float Game_getTeamResourceIncome(int otherTeamId, int resourceId) {
		return this.Game_getTeamResourceIncome(this.skirmishAIId, otherTeamId, resourceId);
	}
	private native float Game_getTeamResourceIncome(int _skirmishAIId, int otherTeamId, int resourceId);

	@Override
	public float Game_getTeamResourceUsage(int otherTeamId, int resourceId) {
		return this.Game_getTeamResourceUsage(this.skirmishAIId, otherTeamId, resourceId);
	}
	private native float Game_getTeamResourceUsage(int _skirmishAIId, int otherTeamId, int resourceId);

	@Override
	public float Game_getTeamResourceStorage(int otherTeamId, int resourceId) {
		return this.Game_getTeamResourceStorage(this.skirmishAIId, otherTeamId, resourceId);
	}
	private native float Game_getTeamResourceStorage(int _skirmishAIId, int otherTeamId, int resourceId);

	@Override
	public boolean Game_isAllied(int firstAllyTeamId, int secondAllyTeamId) {
		return this.Game_isAllied(this.skirmishAIId, firstAllyTeamId, secondAllyTeamId);
	}
	private native boolean Game_isAllied(int _skirmishAIId, int firstAllyTeamId, int secondAllyTeamId);

	@Override
	public boolean Game_isExceptionHandlingEnabled() {
		return this.Game_isExceptionHandlingEnabled(this.skirmishAIId);
	}
	private native boolean Game_isExceptionHandlingEnabled(int _skirmishAIId);

	@Override
	public boolean Game_isDebugModeEnabled() {
		return this.Game_isDebugModeEnabled(this.skirmishAIId);
	}
	private native boolean Game_isDebugModeEnabled(int _skirmishAIId);

	@Override
	public int Game_getMode() {
		return this.Game_getMode(this.skirmishAIId);
	}
	private native int Game_getMode(int _skirmishAIId);

	@Override
	public boolean Game_isPaused() {
		return this.Game_isPaused(this.skirmishAIId);
	}
	private native boolean Game_isPaused(int _skirmishAIId);

	@Override
	public float Game_getSpeedFactor() {
		return this.Game_getSpeedFactor(this.skirmishAIId);
	}
	private native float Game_getSpeedFactor(int _skirmishAIId);

	@Override
	public String Game_getSetupScript() {
		return this.Game_getSetupScript(this.skirmishAIId);
	}
	private native String Game_getSetupScript(int _skirmishAIId);

	@Override
	public int Game_getCategoryFlag(String categoryName) {
		return this.Game_getCategoryFlag(this.skirmishAIId, categoryName);
	}
	private native int Game_getCategoryFlag(int _skirmishAIId, String categoryName);

	@Override
	public int Game_getCategoriesFlag(String categoryNames) {
		return this.Game_getCategoriesFlag(this.skirmishAIId, categoryNames);
	}
	private native int Game_getCategoriesFlag(int _skirmishAIId, String categoryNames);

	@Override
	public void Game_getCategoryName(int categoryFlag, String name, int name_sizeMax) {
		this.Game_getCategoryName(this.skirmishAIId, categoryFlag, name, name_sizeMax);
	}
	private native void Game_getCategoryName(int _skirmishAIId, int categoryFlag, String name, int name_sizeMax);

	@Override
	public float Gui_getViewRange() {
		return this.Gui_getViewRange(this.skirmishAIId);
	}
	private native float Gui_getViewRange(int _skirmishAIId);

	@Override
	public float Gui_getScreenX() {
		return this.Gui_getScreenX(this.skirmishAIId);
	}
	private native float Gui_getScreenX(int _skirmishAIId);

	@Override
	public float Gui_getScreenY() {
		return this.Gui_getScreenY(this.skirmishAIId);
	}
	private native float Gui_getScreenY(int _skirmishAIId);

	@Override
	public void Gui_Camera_getDirection(float[] return_posF3_out) {
		this.Gui_Camera_getDirection(this.skirmishAIId, return_posF3_out);
	}
	private native void Gui_Camera_getDirection(int _skirmishAIId, float[] return_posF3_out);

	@Override
	public void Gui_Camera_getPosition(float[] return_posF3_out) {
		this.Gui_Camera_getPosition(this.skirmishAIId, return_posF3_out);
	}
	private native void Gui_Camera_getPosition(int _skirmishAIId, float[] return_posF3_out);

	@Override
	public boolean Cheats_isEnabled() {
		return this.Cheats_isEnabled(this.skirmishAIId);
	}
	private native boolean Cheats_isEnabled(int _skirmishAIId);

	@Override
	public boolean Cheats_setEnabled(boolean enable) {
		return this.Cheats_setEnabled(this.skirmishAIId, enable);
	}
	private native boolean Cheats_setEnabled(int _skirmishAIId, boolean enable);

	@Override
	public boolean Cheats_setEventsEnabled(boolean enabled) {
		return this.Cheats_setEventsEnabled(this.skirmishAIId, enabled);
	}
	private native boolean Cheats_setEventsEnabled(int _skirmishAIId, boolean enabled);

	@Override
	public boolean Cheats_isOnlyPassive() {
		return this.Cheats_isOnlyPassive(this.skirmishAIId);
	}
	private native boolean Cheats_isOnlyPassive(int _skirmishAIId);

	@Override
	public int getResources() {
		return this.getResources(this.skirmishAIId);
	}
	private native int getResources(int _skirmishAIId);

	@Override
	public int getResourceByName(String resourceName) {
		return this.getResourceByName(this.skirmishAIId, resourceName);
	}
	private native int getResourceByName(int _skirmishAIId, String resourceName);

	@Override
	public String Resource_getName(int resourceId) {
		return this.Resource_getName(this.skirmishAIId, resourceId);
	}
	private native String Resource_getName(int _skirmishAIId, int resourceId);

	@Override
	public float Resource_getOptimum(int resourceId) {
		return this.Resource_getOptimum(this.skirmishAIId, resourceId);
	}
	private native float Resource_getOptimum(int _skirmishAIId, int resourceId);

	@Override
	public float Economy_getCurrent(int resourceId) {
		return this.Economy_getCurrent(this.skirmishAIId, resourceId);
	}
	private native float Economy_getCurrent(int _skirmishAIId, int resourceId);

	@Override
	public float Economy_getIncome(int resourceId) {
		return this.Economy_getIncome(this.skirmishAIId, resourceId);
	}
	private native float Economy_getIncome(int _skirmishAIId, int resourceId);

	@Override
	public float Economy_getUsage(int resourceId) {
		return this.Economy_getUsage(this.skirmishAIId, resourceId);
	}
	private native float Economy_getUsage(int _skirmishAIId, int resourceId);

	@Override
	public float Economy_getStorage(int resourceId) {
		return this.Economy_getStorage(this.skirmishAIId, resourceId);
	}
	private native float Economy_getStorage(int _skirmishAIId, int resourceId);

	@Override
	public int getUnitDefs(int[] unitDefIds, int unitDefIds_sizeMax) {
		return this.getUnitDefs(this.skirmishAIId, unitDefIds, unitDefIds_sizeMax);
	}
	private native int getUnitDefs(int _skirmishAIId, int[] unitDefIds, int unitDefIds_sizeMax);

	@Override
	public int getUnitDefByName(String unitName) {
		return this.getUnitDefByName(this.skirmishAIId, unitName);
	}
	private native int getUnitDefByName(int _skirmishAIId, String unitName);

	@Override
	public float UnitDef_getHeight(int unitDefId) {
		return this.UnitDef_getHeight(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getHeight(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getRadius(int unitDefId) {
		return this.UnitDef_getRadius(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getRadius(int _skirmishAIId, int unitDefId);

	@Override
	public String UnitDef_getName(int unitDefId) {
		return this.UnitDef_getName(this.skirmishAIId, unitDefId);
	}
	private native String UnitDef_getName(int _skirmishAIId, int unitDefId);

	@Override
	public String UnitDef_getHumanName(int unitDefId) {
		return this.UnitDef_getHumanName(this.skirmishAIId, unitDefId);
	}
	private native String UnitDef_getHumanName(int _skirmishAIId, int unitDefId);

	@Override
	public String UnitDef_getFileName(int unitDefId) {
		return this.UnitDef_getFileName(this.skirmishAIId, unitDefId);
	}
	private native String UnitDef_getFileName(int _skirmishAIId, int unitDefId);

	/** @deprecated */
	@Override
	public int UnitDef_getAiHint(int unitDefId) {
		return this.UnitDef_getAiHint(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getAiHint(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getCobId(int unitDefId) {
		return this.UnitDef_getCobId(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getCobId(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getTechLevel(int unitDefId) {
		return this.UnitDef_getTechLevel(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getTechLevel(int _skirmishAIId, int unitDefId);

	/** @deprecated */
	@Override
	public String UnitDef_getGaia(int unitDefId) {
		return this.UnitDef_getGaia(this.skirmishAIId, unitDefId);
	}
	private native String UnitDef_getGaia(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getUpkeep(int unitDefId, int resourceId) {
		return this.UnitDef_getUpkeep(this.skirmishAIId, unitDefId, resourceId);
	}
	private native float UnitDef_getUpkeep(int _skirmishAIId, int unitDefId, int resourceId);

	@Override
	public float UnitDef_getResourceMake(int unitDefId, int resourceId) {
		return this.UnitDef_getResourceMake(this.skirmishAIId, unitDefId, resourceId);
	}
	private native float UnitDef_getResourceMake(int _skirmishAIId, int unitDefId, int resourceId);

	@Override
	public float UnitDef_getMakesResource(int unitDefId, int resourceId) {
		return this.UnitDef_getMakesResource(this.skirmishAIId, unitDefId, resourceId);
	}
	private native float UnitDef_getMakesResource(int _skirmishAIId, int unitDefId, int resourceId);

	@Override
	public float UnitDef_getCost(int unitDefId, int resourceId) {
		return this.UnitDef_getCost(this.skirmishAIId, unitDefId, resourceId);
	}
	private native float UnitDef_getCost(int _skirmishAIId, int unitDefId, int resourceId);

	@Override
	public float UnitDef_getExtractsResource(int unitDefId, int resourceId) {
		return this.UnitDef_getExtractsResource(this.skirmishAIId, unitDefId, resourceId);
	}
	private native float UnitDef_getExtractsResource(int _skirmishAIId, int unitDefId, int resourceId);

	@Override
	public float UnitDef_getResourceExtractorRange(int unitDefId, int resourceId) {
		return this.UnitDef_getResourceExtractorRange(this.skirmishAIId, unitDefId, resourceId);
	}
	private native float UnitDef_getResourceExtractorRange(int _skirmishAIId, int unitDefId, int resourceId);

	@Override
	public float UnitDef_getWindResourceGenerator(int unitDefId, int resourceId) {
		return this.UnitDef_getWindResourceGenerator(this.skirmishAIId, unitDefId, resourceId);
	}
	private native float UnitDef_getWindResourceGenerator(int _skirmishAIId, int unitDefId, int resourceId);

	@Override
	public float UnitDef_getTidalResourceGenerator(int unitDefId, int resourceId) {
		return this.UnitDef_getTidalResourceGenerator(this.skirmishAIId, unitDefId, resourceId);
	}
	private native float UnitDef_getTidalResourceGenerator(int _skirmishAIId, int unitDefId, int resourceId);

	@Override
	public float UnitDef_getStorage(int unitDefId, int resourceId) {
		return this.UnitDef_getStorage(this.skirmishAIId, unitDefId, resourceId);
	}
	private native float UnitDef_getStorage(int _skirmishAIId, int unitDefId, int resourceId);

	@Override
	public boolean UnitDef_isSquareResourceExtractor(int unitDefId, int resourceId) {
		return this.UnitDef_isSquareResourceExtractor(this.skirmishAIId, unitDefId, resourceId);
	}
	private native boolean UnitDef_isSquareResourceExtractor(int _skirmishAIId, int unitDefId, int resourceId);

	@Override
	public float UnitDef_getBuildTime(int unitDefId) {
		return this.UnitDef_getBuildTime(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getBuildTime(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getAutoHeal(int unitDefId) {
		return this.UnitDef_getAutoHeal(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getAutoHeal(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getIdleAutoHeal(int unitDefId) {
		return this.UnitDef_getIdleAutoHeal(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getIdleAutoHeal(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getIdleTime(int unitDefId) {
		return this.UnitDef_getIdleTime(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getIdleTime(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getPower(int unitDefId) {
		return this.UnitDef_getPower(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getPower(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getHealth(int unitDefId) {
		return this.UnitDef_getHealth(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getHealth(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getCategory(int unitDefId) {
		return this.UnitDef_getCategory(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getCategory(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getSpeed(int unitDefId) {
		return this.UnitDef_getSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getSpeed(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getTurnRate(int unitDefId) {
		return this.UnitDef_getTurnRate(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getTurnRate(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isTurnInPlace(int unitDefId) {
		return this.UnitDef_isTurnInPlace(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isTurnInPlace(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getTurnInPlaceDistance(int unitDefId) {
		return this.UnitDef_getTurnInPlaceDistance(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getTurnInPlaceDistance(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getTurnInPlaceSpeedLimit(int unitDefId) {
		return this.UnitDef_getTurnInPlaceSpeedLimit(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getTurnInPlaceSpeedLimit(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isUpright(int unitDefId) {
		return this.UnitDef_isUpright(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isUpright(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isCollide(int unitDefId) {
		return this.UnitDef_isCollide(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isCollide(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getLosRadius(int unitDefId) {
		return this.UnitDef_getLosRadius(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getLosRadius(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getAirLosRadius(int unitDefId) {
		return this.UnitDef_getAirLosRadius(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getAirLosRadius(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getLosHeight(int unitDefId) {
		return this.UnitDef_getLosHeight(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getLosHeight(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getRadarRadius(int unitDefId) {
		return this.UnitDef_getRadarRadius(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getRadarRadius(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getSonarRadius(int unitDefId) {
		return this.UnitDef_getSonarRadius(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getSonarRadius(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getJammerRadius(int unitDefId) {
		return this.UnitDef_getJammerRadius(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getJammerRadius(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getSonarJamRadius(int unitDefId) {
		return this.UnitDef_getSonarJamRadius(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getSonarJamRadius(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getSeismicRadius(int unitDefId) {
		return this.UnitDef_getSeismicRadius(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getSeismicRadius(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getSeismicSignature(int unitDefId) {
		return this.UnitDef_getSeismicSignature(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getSeismicSignature(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isStealth(int unitDefId) {
		return this.UnitDef_isStealth(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isStealth(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isSonarStealth(int unitDefId) {
		return this.UnitDef_isSonarStealth(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isSonarStealth(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isBuildRange3D(int unitDefId) {
		return this.UnitDef_isBuildRange3D(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isBuildRange3D(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getBuildDistance(int unitDefId) {
		return this.UnitDef_getBuildDistance(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getBuildDistance(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getBuildSpeed(int unitDefId) {
		return this.UnitDef_getBuildSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getBuildSpeed(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getReclaimSpeed(int unitDefId) {
		return this.UnitDef_getReclaimSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getReclaimSpeed(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getRepairSpeed(int unitDefId) {
		return this.UnitDef_getRepairSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getRepairSpeed(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMaxRepairSpeed(int unitDefId) {
		return this.UnitDef_getMaxRepairSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMaxRepairSpeed(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getResurrectSpeed(int unitDefId) {
		return this.UnitDef_getResurrectSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getResurrectSpeed(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getCaptureSpeed(int unitDefId) {
		return this.UnitDef_getCaptureSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getCaptureSpeed(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getTerraformSpeed(int unitDefId) {
		return this.UnitDef_getTerraformSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getTerraformSpeed(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMass(int unitDefId) {
		return this.UnitDef_getMass(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMass(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isPushResistant(int unitDefId) {
		return this.UnitDef_isPushResistant(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isPushResistant(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isStrafeToAttack(int unitDefId) {
		return this.UnitDef_isStrafeToAttack(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isStrafeToAttack(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMinCollisionSpeed(int unitDefId) {
		return this.UnitDef_getMinCollisionSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMinCollisionSpeed(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getSlideTolerance(int unitDefId) {
		return this.UnitDef_getSlideTolerance(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getSlideTolerance(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMaxSlope(int unitDefId) {
		return this.UnitDef_getMaxSlope(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMaxSlope(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMaxHeightDif(int unitDefId) {
		return this.UnitDef_getMaxHeightDif(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMaxHeightDif(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMinWaterDepth(int unitDefId) {
		return this.UnitDef_getMinWaterDepth(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMinWaterDepth(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getWaterline(int unitDefId) {
		return this.UnitDef_getWaterline(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getWaterline(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMaxWaterDepth(int unitDefId) {
		return this.UnitDef_getMaxWaterDepth(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMaxWaterDepth(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getArmoredMultiple(int unitDefId) {
		return this.UnitDef_getArmoredMultiple(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getArmoredMultiple(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getArmorType(int unitDefId) {
		return this.UnitDef_getArmorType(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getArmorType(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_FlankingBonus_getMode(int unitDefId) {
		return this.UnitDef_FlankingBonus_getMode(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_FlankingBonus_getMode(int _skirmishAIId, int unitDefId);

	@Override
	public void UnitDef_FlankingBonus_getDir(int unitDefId, float[] return_posF3_out) {
		this.UnitDef_FlankingBonus_getDir(this.skirmishAIId, unitDefId, return_posF3_out);
	}
	private native void UnitDef_FlankingBonus_getDir(int _skirmishAIId, int unitDefId, float[] return_posF3_out);

	@Override
	public float UnitDef_FlankingBonus_getMax(int unitDefId) {
		return this.UnitDef_FlankingBonus_getMax(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_FlankingBonus_getMax(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_FlankingBonus_getMin(int unitDefId) {
		return this.UnitDef_FlankingBonus_getMin(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_FlankingBonus_getMin(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_FlankingBonus_getMobilityAdd(int unitDefId) {
		return this.UnitDef_FlankingBonus_getMobilityAdd(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_FlankingBonus_getMobilityAdd(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMaxWeaponRange(int unitDefId) {
		return this.UnitDef_getMaxWeaponRange(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMaxWeaponRange(int _skirmishAIId, int unitDefId);

	/** @deprecated */
	@Override
	public String UnitDef_getType(int unitDefId) {
		return this.UnitDef_getType(this.skirmishAIId, unitDefId);
	}
	private native String UnitDef_getType(int _skirmishAIId, int unitDefId);

	@Override
	public String UnitDef_getTooltip(int unitDefId) {
		return this.UnitDef_getTooltip(this.skirmishAIId, unitDefId);
	}
	private native String UnitDef_getTooltip(int _skirmishAIId, int unitDefId);

	@Override
	public String UnitDef_getWreckName(int unitDefId) {
		return this.UnitDef_getWreckName(this.skirmishAIId, unitDefId);
	}
	private native String UnitDef_getWreckName(int _skirmishAIId, int unitDefId);

	@Override
	public String UnitDef_getDeathExplosion(int unitDefId) {
		return this.UnitDef_getDeathExplosion(this.skirmishAIId, unitDefId);
	}
	private native String UnitDef_getDeathExplosion(int _skirmishAIId, int unitDefId);

	@Override
	public String UnitDef_getSelfDExplosion(int unitDefId) {
		return this.UnitDef_getSelfDExplosion(this.skirmishAIId, unitDefId);
	}
	private native String UnitDef_getSelfDExplosion(int _skirmishAIId, int unitDefId);

	@Override
	public String UnitDef_getCategoryString(int unitDefId) {
		return this.UnitDef_getCategoryString(this.skirmishAIId, unitDefId);
	}
	private native String UnitDef_getCategoryString(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToSelfD(int unitDefId) {
		return this.UnitDef_isAbleToSelfD(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToSelfD(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getSelfDCountdown(int unitDefId) {
		return this.UnitDef_getSelfDCountdown(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getSelfDCountdown(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToSubmerge(int unitDefId) {
		return this.UnitDef_isAbleToSubmerge(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToSubmerge(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToFly(int unitDefId) {
		return this.UnitDef_isAbleToFly(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToFly(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToMove(int unitDefId) {
		return this.UnitDef_isAbleToMove(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToMove(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToHover(int unitDefId) {
		return this.UnitDef_isAbleToHover(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToHover(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isFloater(int unitDefId) {
		return this.UnitDef_isFloater(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isFloater(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isBuilder(int unitDefId) {
		return this.UnitDef_isBuilder(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isBuilder(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isActivateWhenBuilt(int unitDefId) {
		return this.UnitDef_isActivateWhenBuilt(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isActivateWhenBuilt(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isOnOffable(int unitDefId) {
		return this.UnitDef_isOnOffable(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isOnOffable(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isFullHealthFactory(int unitDefId) {
		return this.UnitDef_isFullHealthFactory(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isFullHealthFactory(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isFactoryHeadingTakeoff(int unitDefId) {
		return this.UnitDef_isFactoryHeadingTakeoff(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isFactoryHeadingTakeoff(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isReclaimable(int unitDefId) {
		return this.UnitDef_isReclaimable(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isReclaimable(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isCapturable(int unitDefId) {
		return this.UnitDef_isCapturable(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isCapturable(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToRestore(int unitDefId) {
		return this.UnitDef_isAbleToRestore(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToRestore(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToRepair(int unitDefId) {
		return this.UnitDef_isAbleToRepair(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToRepair(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToSelfRepair(int unitDefId) {
		return this.UnitDef_isAbleToSelfRepair(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToSelfRepair(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToReclaim(int unitDefId) {
		return this.UnitDef_isAbleToReclaim(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToReclaim(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToAttack(int unitDefId) {
		return this.UnitDef_isAbleToAttack(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToAttack(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToPatrol(int unitDefId) {
		return this.UnitDef_isAbleToPatrol(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToPatrol(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToFight(int unitDefId) {
		return this.UnitDef_isAbleToFight(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToFight(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToGuard(int unitDefId) {
		return this.UnitDef_isAbleToGuard(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToGuard(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToAssist(int unitDefId) {
		return this.UnitDef_isAbleToAssist(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToAssist(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAssistable(int unitDefId) {
		return this.UnitDef_isAssistable(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAssistable(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToRepeat(int unitDefId) {
		return this.UnitDef_isAbleToRepeat(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToRepeat(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToFireControl(int unitDefId) {
		return this.UnitDef_isAbleToFireControl(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToFireControl(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getFireState(int unitDefId) {
		return this.UnitDef_getFireState(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getFireState(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getMoveState(int unitDefId) {
		return this.UnitDef_getMoveState(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getMoveState(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getWingDrag(int unitDefId) {
		return this.UnitDef_getWingDrag(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getWingDrag(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getWingAngle(int unitDefId) {
		return this.UnitDef_getWingAngle(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getWingAngle(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getDrag(int unitDefId) {
		return this.UnitDef_getDrag(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getDrag(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getFrontToSpeed(int unitDefId) {
		return this.UnitDef_getFrontToSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getFrontToSpeed(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getSpeedToFront(int unitDefId) {
		return this.UnitDef_getSpeedToFront(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getSpeedToFront(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMyGravity(int unitDefId) {
		return this.UnitDef_getMyGravity(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMyGravity(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMaxBank(int unitDefId) {
		return this.UnitDef_getMaxBank(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMaxBank(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMaxPitch(int unitDefId) {
		return this.UnitDef_getMaxPitch(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMaxPitch(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getTurnRadius(int unitDefId) {
		return this.UnitDef_getTurnRadius(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getTurnRadius(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getWantedHeight(int unitDefId) {
		return this.UnitDef_getWantedHeight(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getWantedHeight(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getVerticalSpeed(int unitDefId) {
		return this.UnitDef_getVerticalSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getVerticalSpeed(int _skirmishAIId, int unitDefId);

	/** @deprecated */
	@Override
	public boolean UnitDef_isAbleToCrash(int unitDefId) {
		return this.UnitDef_isAbleToCrash(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToCrash(int _skirmishAIId, int unitDefId);

	/** @deprecated */
	@Override
	public boolean UnitDef_isHoverAttack(int unitDefId) {
		return this.UnitDef_isHoverAttack(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isHoverAttack(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAirStrafe(int unitDefId) {
		return this.UnitDef_isAirStrafe(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAirStrafe(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getDlHoverFactor(int unitDefId) {
		return this.UnitDef_getDlHoverFactor(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getDlHoverFactor(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMaxAcceleration(int unitDefId) {
		return this.UnitDef_getMaxAcceleration(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMaxAcceleration(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMaxDeceleration(int unitDefId) {
		return this.UnitDef_getMaxDeceleration(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMaxDeceleration(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMaxAileron(int unitDefId) {
		return this.UnitDef_getMaxAileron(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMaxAileron(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMaxElevator(int unitDefId) {
		return this.UnitDef_getMaxElevator(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMaxElevator(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMaxRudder(int unitDefId) {
		return this.UnitDef_getMaxRudder(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMaxRudder(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getYardMap(int unitDefId, int facing, short[] yardMap, int yardMap_sizeMax) {
		return this.UnitDef_getYardMap(this.skirmishAIId, unitDefId, facing, yardMap, yardMap_sizeMax);
	}
	private native int UnitDef_getYardMap(int _skirmishAIId, int unitDefId, int facing, short[] yardMap, int yardMap_sizeMax);

	@Override
	public int UnitDef_getXSize(int unitDefId) {
		return this.UnitDef_getXSize(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getXSize(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getZSize(int unitDefId) {
		return this.UnitDef_getZSize(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getZSize(int _skirmishAIId, int unitDefId);

	/** @deprecated */
	@Override
	public int UnitDef_getBuildAngle(int unitDefId) {
		return this.UnitDef_getBuildAngle(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getBuildAngle(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getLoadingRadius(int unitDefId) {
		return this.UnitDef_getLoadingRadius(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getLoadingRadius(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getUnloadSpread(int unitDefId) {
		return this.UnitDef_getUnloadSpread(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getUnloadSpread(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getTransportCapacity(int unitDefId) {
		return this.UnitDef_getTransportCapacity(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getTransportCapacity(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getTransportSize(int unitDefId) {
		return this.UnitDef_getTransportSize(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getTransportSize(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getMinTransportSize(int unitDefId) {
		return this.UnitDef_getMinTransportSize(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getMinTransportSize(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAirBase(int unitDefId) {
		return this.UnitDef_isAirBase(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAirBase(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isFirePlatform(int unitDefId) {
		return this.UnitDef_isFirePlatform(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isFirePlatform(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getTransportMass(int unitDefId) {
		return this.UnitDef_getTransportMass(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getTransportMass(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMinTransportMass(int unitDefId) {
		return this.UnitDef_getMinTransportMass(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMinTransportMass(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isHoldSteady(int unitDefId) {
		return this.UnitDef_isHoldSteady(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isHoldSteady(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isReleaseHeld(int unitDefId) {
		return this.UnitDef_isReleaseHeld(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isReleaseHeld(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isNotTransportable(int unitDefId) {
		return this.UnitDef_isNotTransportable(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isNotTransportable(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isTransportByEnemy(int unitDefId) {
		return this.UnitDef_isTransportByEnemy(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isTransportByEnemy(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getTransportUnloadMethod(int unitDefId) {
		return this.UnitDef_getTransportUnloadMethod(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getTransportUnloadMethod(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getFallSpeed(int unitDefId) {
		return this.UnitDef_getFallSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getFallSpeed(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getUnitFallSpeed(int unitDefId) {
		return this.UnitDef_getUnitFallSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getUnitFallSpeed(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToCloak(int unitDefId) {
		return this.UnitDef_isAbleToCloak(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToCloak(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isStartCloaked(int unitDefId) {
		return this.UnitDef_isStartCloaked(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isStartCloaked(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getCloakCost(int unitDefId) {
		return this.UnitDef_getCloakCost(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getCloakCost(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getCloakCostMoving(int unitDefId) {
		return this.UnitDef_getCloakCostMoving(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getCloakCostMoving(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getDecloakDistance(int unitDefId) {
		return this.UnitDef_getDecloakDistance(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getDecloakDistance(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isDecloakSpherical(int unitDefId) {
		return this.UnitDef_isDecloakSpherical(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isDecloakSpherical(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isDecloakOnFire(int unitDefId) {
		return this.UnitDef_isDecloakOnFire(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isDecloakOnFire(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToKamikaze(int unitDefId) {
		return this.UnitDef_isAbleToKamikaze(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToKamikaze(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getKamikazeDist(int unitDefId) {
		return this.UnitDef_getKamikazeDist(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getKamikazeDist(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isTargetingFacility(int unitDefId) {
		return this.UnitDef_isTargetingFacility(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isTargetingFacility(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_canManualFire(int unitDefId) {
		return this.UnitDef_canManualFire(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_canManualFire(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isNeedGeo(int unitDefId) {
		return this.UnitDef_isNeedGeo(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isNeedGeo(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isFeature(int unitDefId) {
		return this.UnitDef_isFeature(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isFeature(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isHideDamage(int unitDefId) {
		return this.UnitDef_isHideDamage(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isHideDamage(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isCommander(int unitDefId) {
		return this.UnitDef_isCommander(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isCommander(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isShowPlayerName(int unitDefId) {
		return this.UnitDef_isShowPlayerName(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isShowPlayerName(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToResurrect(int unitDefId) {
		return this.UnitDef_isAbleToResurrect(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToResurrect(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToCapture(int unitDefId) {
		return this.UnitDef_isAbleToCapture(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToCapture(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getHighTrajectoryType(int unitDefId) {
		return this.UnitDef_getHighTrajectoryType(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getHighTrajectoryType(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getNoChaseCategory(int unitDefId) {
		return this.UnitDef_getNoChaseCategory(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getNoChaseCategory(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isLeaveTracks(int unitDefId) {
		return this.UnitDef_isLeaveTracks(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isLeaveTracks(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getTrackWidth(int unitDefId) {
		return this.UnitDef_getTrackWidth(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getTrackWidth(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getTrackOffset(int unitDefId) {
		return this.UnitDef_getTrackOffset(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getTrackOffset(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getTrackStrength(int unitDefId) {
		return this.UnitDef_getTrackStrength(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getTrackStrength(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getTrackStretch(int unitDefId) {
		return this.UnitDef_getTrackStretch(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getTrackStretch(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getTrackType(int unitDefId) {
		return this.UnitDef_getTrackType(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getTrackType(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToDropFlare(int unitDefId) {
		return this.UnitDef_isAbleToDropFlare(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToDropFlare(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getFlareReloadTime(int unitDefId) {
		return this.UnitDef_getFlareReloadTime(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getFlareReloadTime(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getFlareEfficiency(int unitDefId) {
		return this.UnitDef_getFlareEfficiency(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getFlareEfficiency(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getFlareDelay(int unitDefId) {
		return this.UnitDef_getFlareDelay(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getFlareDelay(int _skirmishAIId, int unitDefId);

	@Override
	public void UnitDef_getFlareDropVector(int unitDefId, float[] return_posF3_out) {
		this.UnitDef_getFlareDropVector(this.skirmishAIId, unitDefId, return_posF3_out);
	}
	private native void UnitDef_getFlareDropVector(int _skirmishAIId, int unitDefId, float[] return_posF3_out);

	@Override
	public int UnitDef_getFlareTime(int unitDefId) {
		return this.UnitDef_getFlareTime(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getFlareTime(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getFlareSalvoSize(int unitDefId) {
		return this.UnitDef_getFlareSalvoSize(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getFlareSalvoSize(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getFlareSalvoDelay(int unitDefId) {
		return this.UnitDef_getFlareSalvoDelay(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getFlareSalvoDelay(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isAbleToLoopbackAttack(int unitDefId) {
		return this.UnitDef_isAbleToLoopbackAttack(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isAbleToLoopbackAttack(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isLevelGround(int unitDefId) {
		return this.UnitDef_isLevelGround(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isLevelGround(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isUseBuildingGroundDecal(int unitDefId) {
		return this.UnitDef_isUseBuildingGroundDecal(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isUseBuildingGroundDecal(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getBuildingDecalType(int unitDefId) {
		return this.UnitDef_getBuildingDecalType(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getBuildingDecalType(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getBuildingDecalSizeX(int unitDefId) {
		return this.UnitDef_getBuildingDecalSizeX(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getBuildingDecalSizeX(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getBuildingDecalSizeY(int unitDefId) {
		return this.UnitDef_getBuildingDecalSizeY(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getBuildingDecalSizeY(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getBuildingDecalDecaySpeed(int unitDefId) {
		return this.UnitDef_getBuildingDecalDecaySpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getBuildingDecalDecaySpeed(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMaxFuel(int unitDefId) {
		return this.UnitDef_getMaxFuel(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMaxFuel(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getRefuelTime(int unitDefId) {
		return this.UnitDef_getRefuelTime(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getRefuelTime(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_getMinAirBasePower(int unitDefId) {
		return this.UnitDef_getMinAirBasePower(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_getMinAirBasePower(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getMaxThisUnit(int unitDefId) {
		return this.UnitDef_getMaxThisUnit(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getMaxThisUnit(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getDecoyDef(int unitDefId) {
		return this.UnitDef_getDecoyDef(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getDecoyDef(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_isDontLand(int unitDefId) {
		return this.UnitDef_isDontLand(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isDontLand(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getShieldDef(int unitDefId) {
		return this.UnitDef_getShieldDef(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getShieldDef(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getStockpileDef(int unitDefId) {
		return this.UnitDef_getStockpileDef(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getStockpileDef(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getBuildOptions(int unitDefId, int[] unitDefIds, int unitDefIds_sizeMax) {
		return this.UnitDef_getBuildOptions(this.skirmishAIId, unitDefId, unitDefIds, unitDefIds_sizeMax);
	}
	private native int UnitDef_getBuildOptions(int _skirmishAIId, int unitDefId, int[] unitDefIds, int unitDefIds_sizeMax);

	@Override
	public int UnitDef_getCustomParams(int unitDefId, String[] keys, String[] values) {
		return this.UnitDef_getCustomParams(this.skirmishAIId, unitDefId, keys, values);
	}
	private native int UnitDef_getCustomParams(int _skirmishAIId, int unitDefId, String[] keys, String[] values);

	@Override
	public boolean UnitDef_isMoveDataAvailable(int unitDefId) {
		return this.UnitDef_isMoveDataAvailable(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_isMoveDataAvailable(int _skirmishAIId, int unitDefId);

	/** @deprecated */
	@Override
	public float UnitDef_MoveData_getMaxAcceleration(int unitDefId) {
		return this.UnitDef_MoveData_getMaxAcceleration(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_MoveData_getMaxAcceleration(int _skirmishAIId, int unitDefId);

	/** @deprecated */
	@Override
	public float UnitDef_MoveData_getMaxBreaking(int unitDefId) {
		return this.UnitDef_MoveData_getMaxBreaking(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_MoveData_getMaxBreaking(int _skirmishAIId, int unitDefId);

	/** @deprecated */
	@Override
	public float UnitDef_MoveData_getMaxSpeed(int unitDefId) {
		return this.UnitDef_MoveData_getMaxSpeed(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_MoveData_getMaxSpeed(int _skirmishAIId, int unitDefId);

	/** @deprecated */
	@Override
	public short UnitDef_MoveData_getMaxTurnRate(int unitDefId) {
		return this.UnitDef_MoveData_getMaxTurnRate(this.skirmishAIId, unitDefId);
	}
	private native short UnitDef_MoveData_getMaxTurnRate(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_MoveData_getXSize(int unitDefId) {
		return this.UnitDef_MoveData_getXSize(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_MoveData_getXSize(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_MoveData_getZSize(int unitDefId) {
		return this.UnitDef_MoveData_getZSize(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_MoveData_getZSize(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_MoveData_getDepth(int unitDefId) {
		return this.UnitDef_MoveData_getDepth(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_MoveData_getDepth(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_MoveData_getMaxSlope(int unitDefId) {
		return this.UnitDef_MoveData_getMaxSlope(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_MoveData_getMaxSlope(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_MoveData_getSlopeMod(int unitDefId) {
		return this.UnitDef_MoveData_getSlopeMod(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_MoveData_getSlopeMod(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_MoveData_getDepthMod(int unitDefId) {
		return this.UnitDef_MoveData_getDepthMod(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_MoveData_getDepthMod(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_MoveData_getPathType(int unitDefId) {
		return this.UnitDef_MoveData_getPathType(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_MoveData_getPathType(int _skirmishAIId, int unitDefId);

	@Override
	public float UnitDef_MoveData_getCrushStrength(int unitDefId) {
		return this.UnitDef_MoveData_getCrushStrength(this.skirmishAIId, unitDefId);
	}
	private native float UnitDef_MoveData_getCrushStrength(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_MoveData_getMoveType(int unitDefId) {
		return this.UnitDef_MoveData_getMoveType(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_MoveData_getMoveType(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_MoveData_getMoveFamily(int unitDefId) {
		return this.UnitDef_MoveData_getMoveFamily(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_MoveData_getMoveFamily(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_MoveData_getTerrainClass(int unitDefId) {
		return this.UnitDef_MoveData_getTerrainClass(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_MoveData_getTerrainClass(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_MoveData_getFollowGround(int unitDefId) {
		return this.UnitDef_MoveData_getFollowGround(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_MoveData_getFollowGround(int _skirmishAIId, int unitDefId);

	@Override
	public boolean UnitDef_MoveData_isSubMarine(int unitDefId) {
		return this.UnitDef_MoveData_isSubMarine(this.skirmishAIId, unitDefId);
	}
	private native boolean UnitDef_MoveData_isSubMarine(int _skirmishAIId, int unitDefId);

	@Override
	public String UnitDef_MoveData_getName(int unitDefId) {
		return this.UnitDef_MoveData_getName(this.skirmishAIId, unitDefId);
	}
	private native String UnitDef_MoveData_getName(int _skirmishAIId, int unitDefId);

	@Override
	public int UnitDef_getWeaponMounts(int unitDefId) {
		return this.UnitDef_getWeaponMounts(this.skirmishAIId, unitDefId);
	}
	private native int UnitDef_getWeaponMounts(int _skirmishAIId, int unitDefId);

	@Override
	public String UnitDef_WeaponMount_getName(int unitDefId, int weaponMountId) {
		return this.UnitDef_WeaponMount_getName(this.skirmishAIId, unitDefId, weaponMountId);
	}
	private native String UnitDef_WeaponMount_getName(int _skirmishAIId, int unitDefId, int weaponMountId);

	@Override
	public int UnitDef_WeaponMount_getWeaponDef(int unitDefId, int weaponMountId) {
		return this.UnitDef_WeaponMount_getWeaponDef(this.skirmishAIId, unitDefId, weaponMountId);
	}
	private native int UnitDef_WeaponMount_getWeaponDef(int _skirmishAIId, int unitDefId, int weaponMountId);

	@Override
	public int UnitDef_WeaponMount_getSlavedTo(int unitDefId, int weaponMountId) {
		return this.UnitDef_WeaponMount_getSlavedTo(this.skirmishAIId, unitDefId, weaponMountId);
	}
	private native int UnitDef_WeaponMount_getSlavedTo(int _skirmishAIId, int unitDefId, int weaponMountId);

	@Override
	public void UnitDef_WeaponMount_getMainDir(int unitDefId, int weaponMountId, float[] return_posF3_out) {
		this.UnitDef_WeaponMount_getMainDir(this.skirmishAIId, unitDefId, weaponMountId, return_posF3_out);
	}
	private native void UnitDef_WeaponMount_getMainDir(int _skirmishAIId, int unitDefId, int weaponMountId, float[] return_posF3_out);

	@Override
	public float UnitDef_WeaponMount_getMaxAngleDif(int unitDefId, int weaponMountId) {
		return this.UnitDef_WeaponMount_getMaxAngleDif(this.skirmishAIId, unitDefId, weaponMountId);
	}
	private native float UnitDef_WeaponMount_getMaxAngleDif(int _skirmishAIId, int unitDefId, int weaponMountId);

	@Override
	public float UnitDef_WeaponMount_getFuelUsage(int unitDefId, int weaponMountId) {
		return this.UnitDef_WeaponMount_getFuelUsage(this.skirmishAIId, unitDefId, weaponMountId);
	}
	private native float UnitDef_WeaponMount_getFuelUsage(int _skirmishAIId, int unitDefId, int weaponMountId);

	@Override
	public int UnitDef_WeaponMount_getBadTargetCategory(int unitDefId, int weaponMountId) {
		return this.UnitDef_WeaponMount_getBadTargetCategory(this.skirmishAIId, unitDefId, weaponMountId);
	}
	private native int UnitDef_WeaponMount_getBadTargetCategory(int _skirmishAIId, int unitDefId, int weaponMountId);

	@Override
	public int UnitDef_WeaponMount_getOnlyTargetCategory(int unitDefId, int weaponMountId) {
		return this.UnitDef_WeaponMount_getOnlyTargetCategory(this.skirmishAIId, unitDefId, weaponMountId);
	}
	private native int UnitDef_WeaponMount_getOnlyTargetCategory(int _skirmishAIId, int unitDefId, int weaponMountId);

	@Override
	public int Unit_getLimit() {
		return this.Unit_getLimit(this.skirmishAIId);
	}
	private native int Unit_getLimit(int _skirmishAIId);

	@Override
	public int Unit_getMax() {
		return this.Unit_getMax(this.skirmishAIId);
	}
	private native int Unit_getMax(int _skirmishAIId);

	@Override
	public int getEnemyUnits(int[] unitIds, int unitIds_sizeMax) {
		return this.getEnemyUnits(this.skirmishAIId, unitIds, unitIds_sizeMax);
	}
	private native int getEnemyUnits(int _skirmishAIId, int[] unitIds, int unitIds_sizeMax);

	@Override
	public int getEnemyUnitsIn(float[] pos_posF3, float radius, int[] unitIds, int unitIds_sizeMax) {
		return this.getEnemyUnitsIn(this.skirmishAIId, pos_posF3, radius, unitIds, unitIds_sizeMax);
	}
	private native int getEnemyUnitsIn(int _skirmishAIId, float[] pos_posF3, float radius, int[] unitIds, int unitIds_sizeMax);

	@Override
	public int getEnemyUnitsInRadarAndLos(int[] unitIds, int unitIds_sizeMax) {
		return this.getEnemyUnitsInRadarAndLos(this.skirmishAIId, unitIds, unitIds_sizeMax);
	}
	private native int getEnemyUnitsInRadarAndLos(int _skirmishAIId, int[] unitIds, int unitIds_sizeMax);

	@Override
	public int getFriendlyUnits(int[] unitIds, int unitIds_sizeMax) {
		return this.getFriendlyUnits(this.skirmishAIId, unitIds, unitIds_sizeMax);
	}
	private native int getFriendlyUnits(int _skirmishAIId, int[] unitIds, int unitIds_sizeMax);

	@Override
	public int getFriendlyUnitsIn(float[] pos_posF3, float radius, int[] unitIds, int unitIds_sizeMax) {
		return this.getFriendlyUnitsIn(this.skirmishAIId, pos_posF3, radius, unitIds, unitIds_sizeMax);
	}
	private native int getFriendlyUnitsIn(int _skirmishAIId, float[] pos_posF3, float radius, int[] unitIds, int unitIds_sizeMax);

	@Override
	public int getNeutralUnits(int[] unitIds, int unitIds_sizeMax) {
		return this.getNeutralUnits(this.skirmishAIId, unitIds, unitIds_sizeMax);
	}
	private native int getNeutralUnits(int _skirmishAIId, int[] unitIds, int unitIds_sizeMax);

	@Override
	public int getNeutralUnitsIn(float[] pos_posF3, float radius, int[] unitIds, int unitIds_sizeMax) {
		return this.getNeutralUnitsIn(this.skirmishAIId, pos_posF3, radius, unitIds, unitIds_sizeMax);
	}
	private native int getNeutralUnitsIn(int _skirmishAIId, float[] pos_posF3, float radius, int[] unitIds, int unitIds_sizeMax);

	@Override
	public int getTeamUnits(int[] unitIds, int unitIds_sizeMax) {
		return this.getTeamUnits(this.skirmishAIId, unitIds, unitIds_sizeMax);
	}
	private native int getTeamUnits(int _skirmishAIId, int[] unitIds, int unitIds_sizeMax);

	@Override
	public int getSelectedUnits(int[] unitIds, int unitIds_sizeMax) {
		return this.getSelectedUnits(this.skirmishAIId, unitIds, unitIds_sizeMax);
	}
	private native int getSelectedUnits(int _skirmishAIId, int[] unitIds, int unitIds_sizeMax);

	@Override
	public int Unit_getDef(int unitId) {
		return this.Unit_getDef(this.skirmishAIId, unitId);
	}
	private native int Unit_getDef(int _skirmishAIId, int unitId);

	@Override
	public int Unit_getModParams(int unitId) {
		return this.Unit_getModParams(this.skirmishAIId, unitId);
	}
	private native int Unit_getModParams(int _skirmishAIId, int unitId);

	@Override
	public String Unit_ModParam_getName(int unitId, int modParamId) {
		return this.Unit_ModParam_getName(this.skirmishAIId, unitId, modParamId);
	}
	private native String Unit_ModParam_getName(int _skirmishAIId, int unitId, int modParamId);

	@Override
	public float Unit_ModParam_getValue(int unitId, int modParamId) {
		return this.Unit_ModParam_getValue(this.skirmishAIId, unitId, modParamId);
	}
	private native float Unit_ModParam_getValue(int _skirmishAIId, int unitId, int modParamId);

	@Override
	public int Unit_getTeam(int unitId) {
		return this.Unit_getTeam(this.skirmishAIId, unitId);
	}
	private native int Unit_getTeam(int _skirmishAIId, int unitId);

	@Override
	public int Unit_getAllyTeam(int unitId) {
		return this.Unit_getAllyTeam(this.skirmishAIId, unitId);
	}
	private native int Unit_getAllyTeam(int _skirmishAIId, int unitId);

	/** @deprecated */
	@Override
	public int Unit_getAiHint(int unitId) {
		return this.Unit_getAiHint(this.skirmishAIId, unitId);
	}
	private native int Unit_getAiHint(int _skirmishAIId, int unitId);

	@Override
	public int Unit_getStockpile(int unitId) {
		return this.Unit_getStockpile(this.skirmishAIId, unitId);
	}
	private native int Unit_getStockpile(int _skirmishAIId, int unitId);

	@Override
	public int Unit_getStockpileQueued(int unitId) {
		return this.Unit_getStockpileQueued(this.skirmishAIId, unitId);
	}
	private native int Unit_getStockpileQueued(int _skirmishAIId, int unitId);

	@Override
	public float Unit_getCurrentFuel(int unitId) {
		return this.Unit_getCurrentFuel(this.skirmishAIId, unitId);
	}
	private native float Unit_getCurrentFuel(int _skirmishAIId, int unitId);

	@Override
	public float Unit_getMaxSpeed(int unitId) {
		return this.Unit_getMaxSpeed(this.skirmishAIId, unitId);
	}
	private native float Unit_getMaxSpeed(int _skirmishAIId, int unitId);

	@Override
	public float Unit_getMaxRange(int unitId) {
		return this.Unit_getMaxRange(this.skirmishAIId, unitId);
	}
	private native float Unit_getMaxRange(int _skirmishAIId, int unitId);

	@Override
	public float Unit_getMaxHealth(int unitId) {
		return this.Unit_getMaxHealth(this.skirmishAIId, unitId);
	}
	private native float Unit_getMaxHealth(int _skirmishAIId, int unitId);

	@Override
	public float Unit_getExperience(int unitId) {
		return this.Unit_getExperience(this.skirmishAIId, unitId);
	}
	private native float Unit_getExperience(int _skirmishAIId, int unitId);

	@Override
	public int Unit_getGroup(int unitId) {
		return this.Unit_getGroup(this.skirmishAIId, unitId);
	}
	private native int Unit_getGroup(int _skirmishAIId, int unitId);

	@Override
	public int Unit_getCurrentCommands(int unitId) {
		return this.Unit_getCurrentCommands(this.skirmishAIId, unitId);
	}
	private native int Unit_getCurrentCommands(int _skirmishAIId, int unitId);

	@Override
	public int Unit_CurrentCommand_getType(int unitId) {
		return this.Unit_CurrentCommand_getType(this.skirmishAIId, unitId);
	}
	private native int Unit_CurrentCommand_getType(int _skirmishAIId, int unitId);

	@Override
	public int Unit_CurrentCommand_getId(int unitId, int commandId) {
		return this.Unit_CurrentCommand_getId(this.skirmishAIId, unitId, commandId);
	}
	private native int Unit_CurrentCommand_getId(int _skirmishAIId, int unitId, int commandId);

	@Override
	public short Unit_CurrentCommand_getOptions(int unitId, int commandId) {
		return this.Unit_CurrentCommand_getOptions(this.skirmishAIId, unitId, commandId);
	}
	private native short Unit_CurrentCommand_getOptions(int _skirmishAIId, int unitId, int commandId);

	@Override
	public int Unit_CurrentCommand_getTag(int unitId, int commandId) {
		return this.Unit_CurrentCommand_getTag(this.skirmishAIId, unitId, commandId);
	}
	private native int Unit_CurrentCommand_getTag(int _skirmishAIId, int unitId, int commandId);

	@Override
	public int Unit_CurrentCommand_getTimeOut(int unitId, int commandId) {
		return this.Unit_CurrentCommand_getTimeOut(this.skirmishAIId, unitId, commandId);
	}
	private native int Unit_CurrentCommand_getTimeOut(int _skirmishAIId, int unitId, int commandId);

	@Override
	public int Unit_CurrentCommand_getParams(int unitId, int commandId, float[] params, int params_sizeMax) {
		return this.Unit_CurrentCommand_getParams(this.skirmishAIId, unitId, commandId, params, params_sizeMax);
	}
	private native int Unit_CurrentCommand_getParams(int _skirmishAIId, int unitId, int commandId, float[] params, int params_sizeMax);

	@Override
	public int Unit_getSupportedCommands(int unitId) {
		return this.Unit_getSupportedCommands(this.skirmishAIId, unitId);
	}
	private native int Unit_getSupportedCommands(int _skirmishAIId, int unitId);

	@Override
	public int Unit_SupportedCommand_getId(int unitId, int supportedCommandId) {
		return this.Unit_SupportedCommand_getId(this.skirmishAIId, unitId, supportedCommandId);
	}
	private native int Unit_SupportedCommand_getId(int _skirmishAIId, int unitId, int supportedCommandId);

	@Override
	public String Unit_SupportedCommand_getName(int unitId, int supportedCommandId) {
		return this.Unit_SupportedCommand_getName(this.skirmishAIId, unitId, supportedCommandId);
	}
	private native String Unit_SupportedCommand_getName(int _skirmishAIId, int unitId, int supportedCommandId);

	@Override
	public String Unit_SupportedCommand_getToolTip(int unitId, int supportedCommandId) {
		return this.Unit_SupportedCommand_getToolTip(this.skirmishAIId, unitId, supportedCommandId);
	}
	private native String Unit_SupportedCommand_getToolTip(int _skirmishAIId, int unitId, int supportedCommandId);

	@Override
	public boolean Unit_SupportedCommand_isShowUnique(int unitId, int supportedCommandId) {
		return this.Unit_SupportedCommand_isShowUnique(this.skirmishAIId, unitId, supportedCommandId);
	}
	private native boolean Unit_SupportedCommand_isShowUnique(int _skirmishAIId, int unitId, int supportedCommandId);

	@Override
	public boolean Unit_SupportedCommand_isDisabled(int unitId, int supportedCommandId) {
		return this.Unit_SupportedCommand_isDisabled(this.skirmishAIId, unitId, supportedCommandId);
	}
	private native boolean Unit_SupportedCommand_isDisabled(int _skirmishAIId, int unitId, int supportedCommandId);

	@Override
	public int Unit_SupportedCommand_getParams(int unitId, int supportedCommandId, String[] params, int params_sizeMax) {
		return this.Unit_SupportedCommand_getParams(this.skirmishAIId, unitId, supportedCommandId, params, params_sizeMax);
	}
	private native int Unit_SupportedCommand_getParams(int _skirmishAIId, int unitId, int supportedCommandId, String[] params, int params_sizeMax);

	@Override
	public float Unit_getHealth(int unitId) {
		return this.Unit_getHealth(this.skirmishAIId, unitId);
	}
	private native float Unit_getHealth(int _skirmishAIId, int unitId);

	@Override
	public float Unit_getSpeed(int unitId) {
		return this.Unit_getSpeed(this.skirmishAIId, unitId);
	}
	private native float Unit_getSpeed(int _skirmishAIId, int unitId);

	@Override
	public float Unit_getPower(int unitId) {
		return this.Unit_getPower(this.skirmishAIId, unitId);
	}
	private native float Unit_getPower(int _skirmishAIId, int unitId);

	@Override
	public float Unit_getResourceUse(int unitId, int resourceId) {
		return this.Unit_getResourceUse(this.skirmishAIId, unitId, resourceId);
	}
	private native float Unit_getResourceUse(int _skirmishAIId, int unitId, int resourceId);

	@Override
	public float Unit_getResourceMake(int unitId, int resourceId) {
		return this.Unit_getResourceMake(this.skirmishAIId, unitId, resourceId);
	}
	private native float Unit_getResourceMake(int _skirmishAIId, int unitId, int resourceId);

	@Override
	public void Unit_getPos(int unitId, float[] return_posF3_out) {
		this.Unit_getPos(this.skirmishAIId, unitId, return_posF3_out);
	}
	private native void Unit_getPos(int _skirmishAIId, int unitId, float[] return_posF3_out);

	@Override
	public void Unit_getVel(int unitId, float[] return_posF3_out) {
		this.Unit_getVel(this.skirmishAIId, unitId, return_posF3_out);
	}
	private native void Unit_getVel(int _skirmishAIId, int unitId, float[] return_posF3_out);

	@Override
	public boolean Unit_isActivated(int unitId) {
		return this.Unit_isActivated(this.skirmishAIId, unitId);
	}
	private native boolean Unit_isActivated(int _skirmishAIId, int unitId);

	@Override
	public boolean Unit_isBeingBuilt(int unitId) {
		return this.Unit_isBeingBuilt(this.skirmishAIId, unitId);
	}
	private native boolean Unit_isBeingBuilt(int _skirmishAIId, int unitId);

	@Override
	public boolean Unit_isCloaked(int unitId) {
		return this.Unit_isCloaked(this.skirmishAIId, unitId);
	}
	private native boolean Unit_isCloaked(int _skirmishAIId, int unitId);

	@Override
	public boolean Unit_isParalyzed(int unitId) {
		return this.Unit_isParalyzed(this.skirmishAIId, unitId);
	}
	private native boolean Unit_isParalyzed(int _skirmishAIId, int unitId);

	@Override
	public boolean Unit_isNeutral(int unitId) {
		return this.Unit_isNeutral(this.skirmishAIId, unitId);
	}
	private native boolean Unit_isNeutral(int _skirmishAIId, int unitId);

	@Override
	public int Unit_getBuildingFacing(int unitId) {
		return this.Unit_getBuildingFacing(this.skirmishAIId, unitId);
	}
	private native int Unit_getBuildingFacing(int _skirmishAIId, int unitId);

	@Override
	public int Unit_getLastUserOrderFrame(int unitId) {
		return this.Unit_getLastUserOrderFrame(this.skirmishAIId, unitId);
	}
	private native int Unit_getLastUserOrderFrame(int _skirmishAIId, int unitId);

	@Override
	public int getGroups(int[] groupIds, int groupIds_sizeMax) {
		return this.getGroups(this.skirmishAIId, groupIds, groupIds_sizeMax);
	}
	private native int getGroups(int _skirmishAIId, int[] groupIds, int groupIds_sizeMax);

	@Override
	public int Group_getSupportedCommands(int groupId) {
		return this.Group_getSupportedCommands(this.skirmishAIId, groupId);
	}
	private native int Group_getSupportedCommands(int _skirmishAIId, int groupId);

	@Override
	public int Group_SupportedCommand_getId(int groupId, int supportedCommandId) {
		return this.Group_SupportedCommand_getId(this.skirmishAIId, groupId, supportedCommandId);
	}
	private native int Group_SupportedCommand_getId(int _skirmishAIId, int groupId, int supportedCommandId);

	@Override
	public String Group_SupportedCommand_getName(int groupId, int supportedCommandId) {
		return this.Group_SupportedCommand_getName(this.skirmishAIId, groupId, supportedCommandId);
	}
	private native String Group_SupportedCommand_getName(int _skirmishAIId, int groupId, int supportedCommandId);

	@Override
	public String Group_SupportedCommand_getToolTip(int groupId, int supportedCommandId) {
		return this.Group_SupportedCommand_getToolTip(this.skirmishAIId, groupId, supportedCommandId);
	}
	private native String Group_SupportedCommand_getToolTip(int _skirmishAIId, int groupId, int supportedCommandId);

	@Override
	public boolean Group_SupportedCommand_isShowUnique(int groupId, int supportedCommandId) {
		return this.Group_SupportedCommand_isShowUnique(this.skirmishAIId, groupId, supportedCommandId);
	}
	private native boolean Group_SupportedCommand_isShowUnique(int _skirmishAIId, int groupId, int supportedCommandId);

	@Override
	public boolean Group_SupportedCommand_isDisabled(int groupId, int supportedCommandId) {
		return this.Group_SupportedCommand_isDisabled(this.skirmishAIId, groupId, supportedCommandId);
	}
	private native boolean Group_SupportedCommand_isDisabled(int _skirmishAIId, int groupId, int supportedCommandId);

	@Override
	public int Group_SupportedCommand_getParams(int groupId, int supportedCommandId, String[] params, int params_sizeMax) {
		return this.Group_SupportedCommand_getParams(this.skirmishAIId, groupId, supportedCommandId, params, params_sizeMax);
	}
	private native int Group_SupportedCommand_getParams(int _skirmishAIId, int groupId, int supportedCommandId, String[] params, int params_sizeMax);

	@Override
	public int Group_OrderPreview_getId(int groupId) {
		return this.Group_OrderPreview_getId(this.skirmishAIId, groupId);
	}
	private native int Group_OrderPreview_getId(int _skirmishAIId, int groupId);

	@Override
	public short Group_OrderPreview_getOptions(int groupId) {
		return this.Group_OrderPreview_getOptions(this.skirmishAIId, groupId);
	}
	private native short Group_OrderPreview_getOptions(int _skirmishAIId, int groupId);

	@Override
	public int Group_OrderPreview_getTag(int groupId) {
		return this.Group_OrderPreview_getTag(this.skirmishAIId, groupId);
	}
	private native int Group_OrderPreview_getTag(int _skirmishAIId, int groupId);

	@Override
	public int Group_OrderPreview_getTimeOut(int groupId) {
		return this.Group_OrderPreview_getTimeOut(this.skirmishAIId, groupId);
	}
	private native int Group_OrderPreview_getTimeOut(int _skirmishAIId, int groupId);

	@Override
	public int Group_OrderPreview_getParams(int groupId, float[] params, int params_sizeMax) {
		return this.Group_OrderPreview_getParams(this.skirmishAIId, groupId, params, params_sizeMax);
	}
	private native int Group_OrderPreview_getParams(int _skirmishAIId, int groupId, float[] params, int params_sizeMax);

	@Override
	public boolean Group_isSelected(int groupId) {
		return this.Group_isSelected(this.skirmishAIId, groupId);
	}
	private native boolean Group_isSelected(int _skirmishAIId, int groupId);

	/** @deprecated */
	@Override
	public String Mod_getFileName() {
		return this.Mod_getFileName(this.skirmishAIId);
	}
	private native String Mod_getFileName(int _skirmishAIId);

	@Override
	public int Mod_getHash() {
		return this.Mod_getHash(this.skirmishAIId);
	}
	private native int Mod_getHash(int _skirmishAIId);

	@Override
	public String Mod_getHumanName() {
		return this.Mod_getHumanName(this.skirmishAIId);
	}
	private native String Mod_getHumanName(int _skirmishAIId);

	@Override
	public String Mod_getShortName() {
		return this.Mod_getShortName(this.skirmishAIId);
	}
	private native String Mod_getShortName(int _skirmishAIId);

	@Override
	public String Mod_getVersion() {
		return this.Mod_getVersion(this.skirmishAIId);
	}
	private native String Mod_getVersion(int _skirmishAIId);

	@Override
	public String Mod_getMutator() {
		return this.Mod_getMutator(this.skirmishAIId);
	}
	private native String Mod_getMutator(int _skirmishAIId);

	@Override
	public String Mod_getDescription() {
		return this.Mod_getDescription(this.skirmishAIId);
	}
	private native String Mod_getDescription(int _skirmishAIId);

	@Override
	public boolean Mod_getAllowTeamColors() {
		return this.Mod_getAllowTeamColors(this.skirmishAIId);
	}
	private native boolean Mod_getAllowTeamColors(int _skirmishAIId);

	@Override
	public boolean Mod_getConstructionDecay() {
		return this.Mod_getConstructionDecay(this.skirmishAIId);
	}
	private native boolean Mod_getConstructionDecay(int _skirmishAIId);

	@Override
	public int Mod_getConstructionDecayTime() {
		return this.Mod_getConstructionDecayTime(this.skirmishAIId);
	}
	private native int Mod_getConstructionDecayTime(int _skirmishAIId);

	@Override
	public float Mod_getConstructionDecaySpeed() {
		return this.Mod_getConstructionDecaySpeed(this.skirmishAIId);
	}
	private native float Mod_getConstructionDecaySpeed(int _skirmishAIId);

	@Override
	public int Mod_getMultiReclaim() {
		return this.Mod_getMultiReclaim(this.skirmishAIId);
	}
	private native int Mod_getMultiReclaim(int _skirmishAIId);

	@Override
	public int Mod_getReclaimMethod() {
		return this.Mod_getReclaimMethod(this.skirmishAIId);
	}
	private native int Mod_getReclaimMethod(int _skirmishAIId);

	@Override
	public int Mod_getReclaimUnitMethod() {
		return this.Mod_getReclaimUnitMethod(this.skirmishAIId);
	}
	private native int Mod_getReclaimUnitMethod(int _skirmishAIId);

	@Override
	public float Mod_getReclaimUnitEnergyCostFactor() {
		return this.Mod_getReclaimUnitEnergyCostFactor(this.skirmishAIId);
	}
	private native float Mod_getReclaimUnitEnergyCostFactor(int _skirmishAIId);

	@Override
	public float Mod_getReclaimUnitEfficiency() {
		return this.Mod_getReclaimUnitEfficiency(this.skirmishAIId);
	}
	private native float Mod_getReclaimUnitEfficiency(int _skirmishAIId);

	@Override
	public float Mod_getReclaimFeatureEnergyCostFactor() {
		return this.Mod_getReclaimFeatureEnergyCostFactor(this.skirmishAIId);
	}
	private native float Mod_getReclaimFeatureEnergyCostFactor(int _skirmishAIId);

	@Override
	public boolean Mod_getReclaimAllowEnemies() {
		return this.Mod_getReclaimAllowEnemies(this.skirmishAIId);
	}
	private native boolean Mod_getReclaimAllowEnemies(int _skirmishAIId);

	@Override
	public boolean Mod_getReclaimAllowAllies() {
		return this.Mod_getReclaimAllowAllies(this.skirmishAIId);
	}
	private native boolean Mod_getReclaimAllowAllies(int _skirmishAIId);

	@Override
	public float Mod_getRepairEnergyCostFactor() {
		return this.Mod_getRepairEnergyCostFactor(this.skirmishAIId);
	}
	private native float Mod_getRepairEnergyCostFactor(int _skirmishAIId);

	@Override
	public float Mod_getResurrectEnergyCostFactor() {
		return this.Mod_getResurrectEnergyCostFactor(this.skirmishAIId);
	}
	private native float Mod_getResurrectEnergyCostFactor(int _skirmishAIId);

	@Override
	public float Mod_getCaptureEnergyCostFactor() {
		return this.Mod_getCaptureEnergyCostFactor(this.skirmishAIId);
	}
	private native float Mod_getCaptureEnergyCostFactor(int _skirmishAIId);

	@Override
	public int Mod_getTransportGround() {
		return this.Mod_getTransportGround(this.skirmishAIId);
	}
	private native int Mod_getTransportGround(int _skirmishAIId);

	@Override
	public int Mod_getTransportHover() {
		return this.Mod_getTransportHover(this.skirmishAIId);
	}
	private native int Mod_getTransportHover(int _skirmishAIId);

	@Override
	public int Mod_getTransportShip() {
		return this.Mod_getTransportShip(this.skirmishAIId);
	}
	private native int Mod_getTransportShip(int _skirmishAIId);

	@Override
	public int Mod_getTransportAir() {
		return this.Mod_getTransportAir(this.skirmishAIId);
	}
	private native int Mod_getTransportAir(int _skirmishAIId);

	@Override
	public int Mod_getFireAtKilled() {
		return this.Mod_getFireAtKilled(this.skirmishAIId);
	}
	private native int Mod_getFireAtKilled(int _skirmishAIId);

	@Override
	public int Mod_getFireAtCrashing() {
		return this.Mod_getFireAtCrashing(this.skirmishAIId);
	}
	private native int Mod_getFireAtCrashing(int _skirmishAIId);

	@Override
	public int Mod_getFlankingBonusModeDefault() {
		return this.Mod_getFlankingBonusModeDefault(this.skirmishAIId);
	}
	private native int Mod_getFlankingBonusModeDefault(int _skirmishAIId);

	@Override
	public int Mod_getLosMipLevel() {
		return this.Mod_getLosMipLevel(this.skirmishAIId);
	}
	private native int Mod_getLosMipLevel(int _skirmishAIId);

	@Override
	public int Mod_getAirMipLevel() {
		return this.Mod_getAirMipLevel(this.skirmishAIId);
	}
	private native int Mod_getAirMipLevel(int _skirmishAIId);

	@Override
	public float Mod_getLosMul() {
		return this.Mod_getLosMul(this.skirmishAIId);
	}
	private native float Mod_getLosMul(int _skirmishAIId);

	@Override
	public float Mod_getAirLosMul() {
		return this.Mod_getAirLosMul(this.skirmishAIId);
	}
	private native float Mod_getAirLosMul(int _skirmishAIId);

	@Override
	public boolean Mod_getRequireSonarUnderWater() {
		return this.Mod_getRequireSonarUnderWater(this.skirmishAIId);
	}
	private native boolean Mod_getRequireSonarUnderWater(int _skirmishAIId);

	@Override
	public int Map_getChecksum() {
		return this.Map_getChecksum(this.skirmishAIId);
	}
	private native int Map_getChecksum(int _skirmishAIId);

	@Override
	public void Map_getStartPos(float[] return_posF3_out) {
		this.Map_getStartPos(this.skirmishAIId, return_posF3_out);
	}
	private native void Map_getStartPos(int _skirmishAIId, float[] return_posF3_out);

	@Override
	public void Map_getMousePos(float[] return_posF3_out) {
		this.Map_getMousePos(this.skirmishAIId, return_posF3_out);
	}
	private native void Map_getMousePos(int _skirmishAIId, float[] return_posF3_out);

	@Override
	public boolean Map_isPosInCamera(float[] pos_posF3, float radius) {
		return this.Map_isPosInCamera(this.skirmishAIId, pos_posF3, radius);
	}
	private native boolean Map_isPosInCamera(int _skirmishAIId, float[] pos_posF3, float radius);

	@Override
	public int Map_getWidth() {
		return this.Map_getWidth(this.skirmishAIId);
	}
	private native int Map_getWidth(int _skirmishAIId);

	@Override
	public int Map_getHeight() {
		return this.Map_getHeight(this.skirmishAIId);
	}
	private native int Map_getHeight(int _skirmishAIId);

	@Override
	public int Map_getHeightMap(float[] heights, int heights_sizeMax) {
		return this.Map_getHeightMap(this.skirmishAIId, heights, heights_sizeMax);
	}
	private native int Map_getHeightMap(int _skirmishAIId, float[] heights, int heights_sizeMax);

	@Override
	public int Map_getCornersHeightMap(float[] cornerHeights, int cornerHeights_sizeMax) {
		return this.Map_getCornersHeightMap(this.skirmishAIId, cornerHeights, cornerHeights_sizeMax);
	}
	private native int Map_getCornersHeightMap(int _skirmishAIId, float[] cornerHeights, int cornerHeights_sizeMax);

	@Override
	public float Map_getMinHeight() {
		return this.Map_getMinHeight(this.skirmishAIId);
	}
	private native float Map_getMinHeight(int _skirmishAIId);

	@Override
	public float Map_getMaxHeight() {
		return this.Map_getMaxHeight(this.skirmishAIId);
	}
	private native float Map_getMaxHeight(int _skirmishAIId);

	@Override
	public int Map_getSlopeMap(float[] slopes, int slopes_sizeMax) {
		return this.Map_getSlopeMap(this.skirmishAIId, slopes, slopes_sizeMax);
	}
	private native int Map_getSlopeMap(int _skirmishAIId, float[] slopes, int slopes_sizeMax);

	@Override
	public int Map_getLosMap(int[] losValues, int losValues_sizeMax) {
		return this.Map_getLosMap(this.skirmishAIId, losValues, losValues_sizeMax);
	}
	private native int Map_getLosMap(int _skirmishAIId, int[] losValues, int losValues_sizeMax);

	@Override
	public int Map_getRadarMap(int[] radarValues, int radarValues_sizeMax) {
		return this.Map_getRadarMap(this.skirmishAIId, radarValues, radarValues_sizeMax);
	}
	private native int Map_getRadarMap(int _skirmishAIId, int[] radarValues, int radarValues_sizeMax);

	@Override
	public int Map_getJammerMap(int[] jammerValues, int jammerValues_sizeMax) {
		return this.Map_getJammerMap(this.skirmishAIId, jammerValues, jammerValues_sizeMax);
	}
	private native int Map_getJammerMap(int _skirmishAIId, int[] jammerValues, int jammerValues_sizeMax);

	@Override
	public int Map_getResourceMapRaw(int resourceId, short[] resources, int resources_sizeMax) {
		return this.Map_getResourceMapRaw(this.skirmishAIId, resourceId, resources, resources_sizeMax);
	}
	private native int Map_getResourceMapRaw(int _skirmishAIId, int resourceId, short[] resources, int resources_sizeMax);

	@Override
	public int Map_getResourceMapSpotsPositions(int resourceId, float[] spots_AposF3, int spots_AposF3_sizeMax) {
		return this.Map_getResourceMapSpotsPositions(this.skirmishAIId, resourceId, spots_AposF3, spots_AposF3_sizeMax);
	}
	private native int Map_getResourceMapSpotsPositions(int _skirmishAIId, int resourceId, float[] spots_AposF3, int spots_AposF3_sizeMax);

	@Override
	public float Map_getResourceMapSpotsAverageIncome(int resourceId) {
		return this.Map_getResourceMapSpotsAverageIncome(this.skirmishAIId, resourceId);
	}
	private native float Map_getResourceMapSpotsAverageIncome(int _skirmishAIId, int resourceId);

	@Override
	public void Map_getResourceMapSpotsNearest(int resourceId, float[] pos_posF3, float[] return_posF3_out) {
		this.Map_getResourceMapSpotsNearest(this.skirmishAIId, resourceId, pos_posF3, return_posF3_out);
	}
	private native void Map_getResourceMapSpotsNearest(int _skirmishAIId, int resourceId, float[] pos_posF3, float[] return_posF3_out);

	@Override
	public int Map_getHash() {
		return this.Map_getHash(this.skirmishAIId);
	}
	private native int Map_getHash(int _skirmishAIId);

	@Override
	public String Map_getName() {
		return this.Map_getName(this.skirmishAIId);
	}
	private native String Map_getName(int _skirmishAIId);

	@Override
	public String Map_getHumanName() {
		return this.Map_getHumanName(this.skirmishAIId);
	}
	private native String Map_getHumanName(int _skirmishAIId);

	@Override
	public float Map_getElevationAt(float x, float z) {
		return this.Map_getElevationAt(this.skirmishAIId, x, z);
	}
	private native float Map_getElevationAt(int _skirmishAIId, float x, float z);

	@Override
	public float Map_getMaxResource(int resourceId) {
		return this.Map_getMaxResource(this.skirmishAIId, resourceId);
	}
	private native float Map_getMaxResource(int _skirmishAIId, int resourceId);

	@Override
	public float Map_getExtractorRadius(int resourceId) {
		return this.Map_getExtractorRadius(this.skirmishAIId, resourceId);
	}
	private native float Map_getExtractorRadius(int _skirmishAIId, int resourceId);

	@Override
	public float Map_getMinWind() {
		return this.Map_getMinWind(this.skirmishAIId);
	}
	private native float Map_getMinWind(int _skirmishAIId);

	@Override
	public float Map_getMaxWind() {
		return this.Map_getMaxWind(this.skirmishAIId);
	}
	private native float Map_getMaxWind(int _skirmishAIId);

	@Override
	public float Map_getCurWind() {
		return this.Map_getCurWind(this.skirmishAIId);
	}
	private native float Map_getCurWind(int _skirmishAIId);

	@Override
	public float Map_getTidalStrength() {
		return this.Map_getTidalStrength(this.skirmishAIId);
	}
	private native float Map_getTidalStrength(int _skirmishAIId);

	@Override
	public float Map_getGravity() {
		return this.Map_getGravity(this.skirmishAIId);
	}
	private native float Map_getGravity(int _skirmishAIId);

	@Override
	public int Map_getPoints(boolean includeAllies) {
		return this.Map_getPoints(this.skirmishAIId, includeAllies);
	}
	private native int Map_getPoints(int _skirmishAIId, boolean includeAllies);

	@Override
	public void Map_Point_getPosition(int pointId, float[] return_posF3_out) {
		this.Map_Point_getPosition(this.skirmishAIId, pointId, return_posF3_out);
	}
	private native void Map_Point_getPosition(int _skirmishAIId, int pointId, float[] return_posF3_out);

	@Override
	public void Map_Point_getColor(int pointId, short[] return_colorS3_out) {
		this.Map_Point_getColor(this.skirmishAIId, pointId, return_colorS3_out);
	}
	private native void Map_Point_getColor(int _skirmishAIId, int pointId, short[] return_colorS3_out);

	@Override
	public String Map_Point_getLabel(int pointId) {
		return this.Map_Point_getLabel(this.skirmishAIId, pointId);
	}
	private native String Map_Point_getLabel(int _skirmishAIId, int pointId);

	@Override
	public int Map_getLines(boolean includeAllies) {
		return this.Map_getLines(this.skirmishAIId, includeAllies);
	}
	private native int Map_getLines(int _skirmishAIId, boolean includeAllies);

	@Override
	public void Map_Line_getFirstPosition(int lineId, float[] return_posF3_out) {
		this.Map_Line_getFirstPosition(this.skirmishAIId, lineId, return_posF3_out);
	}
	private native void Map_Line_getFirstPosition(int _skirmishAIId, int lineId, float[] return_posF3_out);

	@Override
	public void Map_Line_getSecondPosition(int lineId, float[] return_posF3_out) {
		this.Map_Line_getSecondPosition(this.skirmishAIId, lineId, return_posF3_out);
	}
	private native void Map_Line_getSecondPosition(int _skirmishAIId, int lineId, float[] return_posF3_out);

	@Override
	public void Map_Line_getColor(int lineId, short[] return_colorS3_out) {
		this.Map_Line_getColor(this.skirmishAIId, lineId, return_colorS3_out);
	}
	private native void Map_Line_getColor(int _skirmishAIId, int lineId, short[] return_colorS3_out);

	@Override
	public boolean Map_isPossibleToBuildAt(int unitDefId, float[] pos_posF3, int facing) {
		return this.Map_isPossibleToBuildAt(this.skirmishAIId, unitDefId, pos_posF3, facing);
	}
	private native boolean Map_isPossibleToBuildAt(int _skirmishAIId, int unitDefId, float[] pos_posF3, int facing);

	@Override
	public void Map_findClosestBuildSite(int unitDefId, float[] pos_posF3, float searchRadius, int minDist, int facing, float[] return_posF3_out) {
		this.Map_findClosestBuildSite(this.skirmishAIId, unitDefId, pos_posF3, searchRadius, minDist, facing, return_posF3_out);
	}
	private native void Map_findClosestBuildSite(int _skirmishAIId, int unitDefId, float[] pos_posF3, float searchRadius, int minDist, int facing, float[] return_posF3_out);

	@Override
	public int getFeatureDefs(int[] featureDefIds, int featureDefIds_sizeMax) {
		return this.getFeatureDefs(this.skirmishAIId, featureDefIds, featureDefIds_sizeMax);
	}
	private native int getFeatureDefs(int _skirmishAIId, int[] featureDefIds, int featureDefIds_sizeMax);

	@Override
	public String FeatureDef_getName(int featureDefId) {
		return this.FeatureDef_getName(this.skirmishAIId, featureDefId);
	}
	private native String FeatureDef_getName(int _skirmishAIId, int featureDefId);

	@Override
	public String FeatureDef_getDescription(int featureDefId) {
		return this.FeatureDef_getDescription(this.skirmishAIId, featureDefId);
	}
	private native String FeatureDef_getDescription(int _skirmishAIId, int featureDefId);

	@Override
	public String FeatureDef_getFileName(int featureDefId) {
		return this.FeatureDef_getFileName(this.skirmishAIId, featureDefId);
	}
	private native String FeatureDef_getFileName(int _skirmishAIId, int featureDefId);

	@Override
	public float FeatureDef_getContainedResource(int featureDefId, int resourceId) {
		return this.FeatureDef_getContainedResource(this.skirmishAIId, featureDefId, resourceId);
	}
	private native float FeatureDef_getContainedResource(int _skirmishAIId, int featureDefId, int resourceId);

	@Override
	public float FeatureDef_getMaxHealth(int featureDefId) {
		return this.FeatureDef_getMaxHealth(this.skirmishAIId, featureDefId);
	}
	private native float FeatureDef_getMaxHealth(int _skirmishAIId, int featureDefId);

	@Override
	public float FeatureDef_getReclaimTime(int featureDefId) {
		return this.FeatureDef_getReclaimTime(this.skirmishAIId, featureDefId);
	}
	private native float FeatureDef_getReclaimTime(int _skirmishAIId, int featureDefId);

	@Override
	public float FeatureDef_getMass(int featureDefId) {
		return this.FeatureDef_getMass(this.skirmishAIId, featureDefId);
	}
	private native float FeatureDef_getMass(int _skirmishAIId, int featureDefId);

	@Override
	public boolean FeatureDef_isUpright(int featureDefId) {
		return this.FeatureDef_isUpright(this.skirmishAIId, featureDefId);
	}
	private native boolean FeatureDef_isUpright(int _skirmishAIId, int featureDefId);

	@Override
	public int FeatureDef_getDrawType(int featureDefId) {
		return this.FeatureDef_getDrawType(this.skirmishAIId, featureDefId);
	}
	private native int FeatureDef_getDrawType(int _skirmishAIId, int featureDefId);

	@Override
	public String FeatureDef_getModelName(int featureDefId) {
		return this.FeatureDef_getModelName(this.skirmishAIId, featureDefId);
	}
	private native String FeatureDef_getModelName(int _skirmishAIId, int featureDefId);

	@Override
	public int FeatureDef_getResurrectable(int featureDefId) {
		return this.FeatureDef_getResurrectable(this.skirmishAIId, featureDefId);
	}
	private native int FeatureDef_getResurrectable(int _skirmishAIId, int featureDefId);

	@Override
	public int FeatureDef_getSmokeTime(int featureDefId) {
		return this.FeatureDef_getSmokeTime(this.skirmishAIId, featureDefId);
	}
	private native int FeatureDef_getSmokeTime(int _skirmishAIId, int featureDefId);

	@Override
	public boolean FeatureDef_isDestructable(int featureDefId) {
		return this.FeatureDef_isDestructable(this.skirmishAIId, featureDefId);
	}
	private native boolean FeatureDef_isDestructable(int _skirmishAIId, int featureDefId);

	@Override
	public boolean FeatureDef_isReclaimable(int featureDefId) {
		return this.FeatureDef_isReclaimable(this.skirmishAIId, featureDefId);
	}
	private native boolean FeatureDef_isReclaimable(int _skirmishAIId, int featureDefId);

	@Override
	public boolean FeatureDef_isBlocking(int featureDefId) {
		return this.FeatureDef_isBlocking(this.skirmishAIId, featureDefId);
	}
	private native boolean FeatureDef_isBlocking(int _skirmishAIId, int featureDefId);

	@Override
	public boolean FeatureDef_isBurnable(int featureDefId) {
		return this.FeatureDef_isBurnable(this.skirmishAIId, featureDefId);
	}
	private native boolean FeatureDef_isBurnable(int _skirmishAIId, int featureDefId);

	@Override
	public boolean FeatureDef_isFloating(int featureDefId) {
		return this.FeatureDef_isFloating(this.skirmishAIId, featureDefId);
	}
	private native boolean FeatureDef_isFloating(int _skirmishAIId, int featureDefId);

	@Override
	public boolean FeatureDef_isNoSelect(int featureDefId) {
		return this.FeatureDef_isNoSelect(this.skirmishAIId, featureDefId);
	}
	private native boolean FeatureDef_isNoSelect(int _skirmishAIId, int featureDefId);

	@Override
	public boolean FeatureDef_isGeoThermal(int featureDefId) {
		return this.FeatureDef_isGeoThermal(this.skirmishAIId, featureDefId);
	}
	private native boolean FeatureDef_isGeoThermal(int _skirmishAIId, int featureDefId);

	@Override
	public String FeatureDef_getDeathFeature(int featureDefId) {
		return this.FeatureDef_getDeathFeature(this.skirmishAIId, featureDefId);
	}
	private native String FeatureDef_getDeathFeature(int _skirmishAIId, int featureDefId);

	@Override
	public int FeatureDef_getXSize(int featureDefId) {
		return this.FeatureDef_getXSize(this.skirmishAIId, featureDefId);
	}
	private native int FeatureDef_getXSize(int _skirmishAIId, int featureDefId);

	@Override
	public int FeatureDef_getZSize(int featureDefId) {
		return this.FeatureDef_getZSize(this.skirmishAIId, featureDefId);
	}
	private native int FeatureDef_getZSize(int _skirmishAIId, int featureDefId);

	@Override
	public int FeatureDef_getCustomParams(int featureDefId, String[] keys, String[] values) {
		return this.FeatureDef_getCustomParams(this.skirmishAIId, featureDefId, keys, values);
	}
	private native int FeatureDef_getCustomParams(int _skirmishAIId, int featureDefId, String[] keys, String[] values);

	@Override
	public int getFeatures(int[] featureIds, int featureIds_sizeMax) {
		return this.getFeatures(this.skirmishAIId, featureIds, featureIds_sizeMax);
	}
	private native int getFeatures(int _skirmishAIId, int[] featureIds, int featureIds_sizeMax);

	@Override
	public int getFeaturesIn(float[] pos_posF3, float radius, int[] featureIds, int featureIds_sizeMax) {
		return this.getFeaturesIn(this.skirmishAIId, pos_posF3, radius, featureIds, featureIds_sizeMax);
	}
	private native int getFeaturesIn(int _skirmishAIId, float[] pos_posF3, float radius, int[] featureIds, int featureIds_sizeMax);

	@Override
	public int Feature_getDef(int featureId) {
		return this.Feature_getDef(this.skirmishAIId, featureId);
	}
	private native int Feature_getDef(int _skirmishAIId, int featureId);

	@Override
	public float Feature_getHealth(int featureId) {
		return this.Feature_getHealth(this.skirmishAIId, featureId);
	}
	private native float Feature_getHealth(int _skirmishAIId, int featureId);

	@Override
	public float Feature_getReclaimLeft(int featureId) {
		return this.Feature_getReclaimLeft(this.skirmishAIId, featureId);
	}
	private native float Feature_getReclaimLeft(int _skirmishAIId, int featureId);

	@Override
	public void Feature_getPosition(int featureId, float[] return_posF3_out) {
		this.Feature_getPosition(this.skirmishAIId, featureId, return_posF3_out);
	}
	private native void Feature_getPosition(int _skirmishAIId, int featureId, float[] return_posF3_out);

	@Override
	public int getWeaponDefs() {
		return this.getWeaponDefs(this.skirmishAIId);
	}
	private native int getWeaponDefs(int _skirmishAIId);

	@Override
	public int getWeaponDefByName(String weaponDefName) {
		return this.getWeaponDefByName(this.skirmishAIId, weaponDefName);
	}
	private native int getWeaponDefByName(int _skirmishAIId, String weaponDefName);

	@Override
	public String WeaponDef_getName(int weaponDefId) {
		return this.WeaponDef_getName(this.skirmishAIId, weaponDefId);
	}
	private native String WeaponDef_getName(int _skirmishAIId, int weaponDefId);

	@Override
	public String WeaponDef_getType(int weaponDefId) {
		return this.WeaponDef_getType(this.skirmishAIId, weaponDefId);
	}
	private native String WeaponDef_getType(int _skirmishAIId, int weaponDefId);

	@Override
	public String WeaponDef_getDescription(int weaponDefId) {
		return this.WeaponDef_getDescription(this.skirmishAIId, weaponDefId);
	}
	private native String WeaponDef_getDescription(int _skirmishAIId, int weaponDefId);

	@Override
	public String WeaponDef_getFileName(int weaponDefId) {
		return this.WeaponDef_getFileName(this.skirmishAIId, weaponDefId);
	}
	private native String WeaponDef_getFileName(int _skirmishAIId, int weaponDefId);

	@Override
	public String WeaponDef_getCegTag(int weaponDefId) {
		return this.WeaponDef_getCegTag(this.skirmishAIId, weaponDefId);
	}
	private native String WeaponDef_getCegTag(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getRange(int weaponDefId) {
		return this.WeaponDef_getRange(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getRange(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getHeightMod(int weaponDefId) {
		return this.WeaponDef_getHeightMod(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getHeightMod(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getAccuracy(int weaponDefId) {
		return this.WeaponDef_getAccuracy(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getAccuracy(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getSprayAngle(int weaponDefId) {
		return this.WeaponDef_getSprayAngle(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getSprayAngle(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getMovingAccuracy(int weaponDefId) {
		return this.WeaponDef_getMovingAccuracy(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getMovingAccuracy(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getTargetMoveError(int weaponDefId) {
		return this.WeaponDef_getTargetMoveError(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getTargetMoveError(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getLeadLimit(int weaponDefId) {
		return this.WeaponDef_getLeadLimit(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getLeadLimit(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getLeadBonus(int weaponDefId) {
		return this.WeaponDef_getLeadBonus(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getLeadBonus(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getPredictBoost(int weaponDefId) {
		return this.WeaponDef_getPredictBoost(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getPredictBoost(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_getNumDamageTypes() {
		return this.WeaponDef_getNumDamageTypes(this.skirmishAIId);
	}
	private native int WeaponDef_getNumDamageTypes(int _skirmishAIId);

	@Override
	public int WeaponDef_Damage_getParalyzeDamageTime(int weaponDefId) {
		return this.WeaponDef_Damage_getParalyzeDamageTime(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_Damage_getParalyzeDamageTime(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_Damage_getImpulseFactor(int weaponDefId) {
		return this.WeaponDef_Damage_getImpulseFactor(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_Damage_getImpulseFactor(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_Damage_getImpulseBoost(int weaponDefId) {
		return this.WeaponDef_Damage_getImpulseBoost(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_Damage_getImpulseBoost(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_Damage_getCraterMult(int weaponDefId) {
		return this.WeaponDef_Damage_getCraterMult(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_Damage_getCraterMult(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_Damage_getCraterBoost(int weaponDefId) {
		return this.WeaponDef_Damage_getCraterBoost(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_Damage_getCraterBoost(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_Damage_getTypes(int weaponDefId, float[] types, int types_sizeMax) {
		return this.WeaponDef_Damage_getTypes(this.skirmishAIId, weaponDefId, types, types_sizeMax);
	}
	private native int WeaponDef_Damage_getTypes(int _skirmishAIId, int weaponDefId, float[] types, int types_sizeMax);

	@Override
	public float WeaponDef_getAreaOfEffect(int weaponDefId) {
		return this.WeaponDef_getAreaOfEffect(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getAreaOfEffect(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isNoSelfDamage(int weaponDefId) {
		return this.WeaponDef_isNoSelfDamage(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isNoSelfDamage(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getFireStarter(int weaponDefId) {
		return this.WeaponDef_getFireStarter(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getFireStarter(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getEdgeEffectiveness(int weaponDefId) {
		return this.WeaponDef_getEdgeEffectiveness(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getEdgeEffectiveness(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getSize(int weaponDefId) {
		return this.WeaponDef_getSize(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getSize(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getSizeGrowth(int weaponDefId) {
		return this.WeaponDef_getSizeGrowth(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getSizeGrowth(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getCollisionSize(int weaponDefId) {
		return this.WeaponDef_getCollisionSize(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getCollisionSize(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_getSalvoSize(int weaponDefId) {
		return this.WeaponDef_getSalvoSize(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_getSalvoSize(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getSalvoDelay(int weaponDefId) {
		return this.WeaponDef_getSalvoDelay(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getSalvoDelay(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getReload(int weaponDefId) {
		return this.WeaponDef_getReload(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getReload(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getBeamTime(int weaponDefId) {
		return this.WeaponDef_getBeamTime(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getBeamTime(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isBeamBurst(int weaponDefId) {
		return this.WeaponDef_isBeamBurst(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isBeamBurst(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isWaterBounce(int weaponDefId) {
		return this.WeaponDef_isWaterBounce(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isWaterBounce(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isGroundBounce(int weaponDefId) {
		return this.WeaponDef_isGroundBounce(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isGroundBounce(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getBounceRebound(int weaponDefId) {
		return this.WeaponDef_getBounceRebound(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getBounceRebound(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getBounceSlip(int weaponDefId) {
		return this.WeaponDef_getBounceSlip(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getBounceSlip(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_getNumBounce(int weaponDefId) {
		return this.WeaponDef_getNumBounce(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_getNumBounce(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getMaxAngle(int weaponDefId) {
		return this.WeaponDef_getMaxAngle(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getMaxAngle(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getUpTime(int weaponDefId) {
		return this.WeaponDef_getUpTime(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getUpTime(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_getFlightTime(int weaponDefId) {
		return this.WeaponDef_getFlightTime(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_getFlightTime(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getCost(int weaponDefId, int resourceId) {
		return this.WeaponDef_getCost(this.skirmishAIId, weaponDefId, resourceId);
	}
	private native float WeaponDef_getCost(int _skirmishAIId, int weaponDefId, int resourceId);

	@Override
	public int WeaponDef_getProjectilesPerShot(int weaponDefId) {
		return this.WeaponDef_getProjectilesPerShot(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_getProjectilesPerShot(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isTurret(int weaponDefId) {
		return this.WeaponDef_isTurret(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isTurret(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isOnlyForward(int weaponDefId) {
		return this.WeaponDef_isOnlyForward(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isOnlyForward(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isFixedLauncher(int weaponDefId) {
		return this.WeaponDef_isFixedLauncher(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isFixedLauncher(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isWaterWeapon(int weaponDefId) {
		return this.WeaponDef_isWaterWeapon(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isWaterWeapon(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isFireSubmersed(int weaponDefId) {
		return this.WeaponDef_isFireSubmersed(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isFireSubmersed(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isSubMissile(int weaponDefId) {
		return this.WeaponDef_isSubMissile(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isSubMissile(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isTracks(int weaponDefId) {
		return this.WeaponDef_isTracks(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isTracks(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isDropped(int weaponDefId) {
		return this.WeaponDef_isDropped(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isDropped(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isParalyzer(int weaponDefId) {
		return this.WeaponDef_isParalyzer(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isParalyzer(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isImpactOnly(int weaponDefId) {
		return this.WeaponDef_isImpactOnly(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isImpactOnly(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isNoAutoTarget(int weaponDefId) {
		return this.WeaponDef_isNoAutoTarget(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isNoAutoTarget(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isManualFire(int weaponDefId) {
		return this.WeaponDef_isManualFire(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isManualFire(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_getInterceptor(int weaponDefId) {
		return this.WeaponDef_getInterceptor(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_getInterceptor(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_getTargetable(int weaponDefId) {
		return this.WeaponDef_getTargetable(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_getTargetable(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isStockpileable(int weaponDefId) {
		return this.WeaponDef_isStockpileable(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isStockpileable(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getCoverageRange(int weaponDefId) {
		return this.WeaponDef_getCoverageRange(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getCoverageRange(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getStockpileTime(int weaponDefId) {
		return this.WeaponDef_getStockpileTime(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getStockpileTime(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getIntensity(int weaponDefId) {
		return this.WeaponDef_getIntensity(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getIntensity(int _skirmishAIId, int weaponDefId);

	/** @deprecated */
	@Override
	public float WeaponDef_getThickness(int weaponDefId) {
		return this.WeaponDef_getThickness(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getThickness(int _skirmishAIId, int weaponDefId);

	/** @deprecated */
	@Override
	public float WeaponDef_getLaserFlareSize(int weaponDefId) {
		return this.WeaponDef_getLaserFlareSize(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getLaserFlareSize(int _skirmishAIId, int weaponDefId);

	/** @deprecated */
	@Override
	public float WeaponDef_getCoreThickness(int weaponDefId) {
		return this.WeaponDef_getCoreThickness(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getCoreThickness(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getDuration(int weaponDefId) {
		return this.WeaponDef_getDuration(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getDuration(int _skirmishAIId, int weaponDefId);

	/** @deprecated */
	@Override
	public int WeaponDef_getLodDistance(int weaponDefId) {
		return this.WeaponDef_getLodDistance(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_getLodDistance(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getFalloffRate(int weaponDefId) {
		return this.WeaponDef_getFalloffRate(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getFalloffRate(int _skirmishAIId, int weaponDefId);

	/** @deprecated */
	@Override
	public int WeaponDef_getGraphicsType(int weaponDefId) {
		return this.WeaponDef_getGraphicsType(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_getGraphicsType(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isSoundTrigger(int weaponDefId) {
		return this.WeaponDef_isSoundTrigger(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isSoundTrigger(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isSelfExplode(int weaponDefId) {
		return this.WeaponDef_isSelfExplode(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isSelfExplode(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isGravityAffected(int weaponDefId) {
		return this.WeaponDef_isGravityAffected(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isGravityAffected(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_getHighTrajectory(int weaponDefId) {
		return this.WeaponDef_getHighTrajectory(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_getHighTrajectory(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getMyGravity(int weaponDefId) {
		return this.WeaponDef_getMyGravity(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getMyGravity(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isNoExplode(int weaponDefId) {
		return this.WeaponDef_isNoExplode(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isNoExplode(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getStartVelocity(int weaponDefId) {
		return this.WeaponDef_getStartVelocity(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getStartVelocity(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getWeaponAcceleration(int weaponDefId) {
		return this.WeaponDef_getWeaponAcceleration(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getWeaponAcceleration(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getTurnRate(int weaponDefId) {
		return this.WeaponDef_getTurnRate(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getTurnRate(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getMaxVelocity(int weaponDefId) {
		return this.WeaponDef_getMaxVelocity(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getMaxVelocity(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getProjectileSpeed(int weaponDefId) {
		return this.WeaponDef_getProjectileSpeed(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getProjectileSpeed(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getExplosionSpeed(int weaponDefId) {
		return this.WeaponDef_getExplosionSpeed(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getExplosionSpeed(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_getOnlyTargetCategory(int weaponDefId) {
		return this.WeaponDef_getOnlyTargetCategory(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_getOnlyTargetCategory(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getWobble(int weaponDefId) {
		return this.WeaponDef_getWobble(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getWobble(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getDance(int weaponDefId) {
		return this.WeaponDef_getDance(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getDance(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getTrajectoryHeight(int weaponDefId) {
		return this.WeaponDef_getTrajectoryHeight(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getTrajectoryHeight(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isLargeBeamLaser(int weaponDefId) {
		return this.WeaponDef_isLargeBeamLaser(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isLargeBeamLaser(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isShield(int weaponDefId) {
		return this.WeaponDef_isShield(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isShield(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isShieldRepulser(int weaponDefId) {
		return this.WeaponDef_isShieldRepulser(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isShieldRepulser(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isSmartShield(int weaponDefId) {
		return this.WeaponDef_isSmartShield(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isSmartShield(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isExteriorShield(int weaponDefId) {
		return this.WeaponDef_isExteriorShield(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isExteriorShield(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isVisibleShield(int weaponDefId) {
		return this.WeaponDef_isVisibleShield(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isVisibleShield(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isVisibleShieldRepulse(int weaponDefId) {
		return this.WeaponDef_isVisibleShieldRepulse(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isVisibleShieldRepulse(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_getVisibleShieldHitFrames(int weaponDefId) {
		return this.WeaponDef_getVisibleShieldHitFrames(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_getVisibleShieldHitFrames(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_Shield_getResourceUse(int weaponDefId, int resourceId) {
		return this.WeaponDef_Shield_getResourceUse(this.skirmishAIId, weaponDefId, resourceId);
	}
	private native float WeaponDef_Shield_getResourceUse(int _skirmishAIId, int weaponDefId, int resourceId);

	@Override
	public float WeaponDef_Shield_getRadius(int weaponDefId) {
		return this.WeaponDef_Shield_getRadius(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_Shield_getRadius(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_Shield_getForce(int weaponDefId) {
		return this.WeaponDef_Shield_getForce(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_Shield_getForce(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_Shield_getMaxSpeed(int weaponDefId) {
		return this.WeaponDef_Shield_getMaxSpeed(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_Shield_getMaxSpeed(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_Shield_getPower(int weaponDefId) {
		return this.WeaponDef_Shield_getPower(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_Shield_getPower(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_Shield_getPowerRegen(int weaponDefId) {
		return this.WeaponDef_Shield_getPowerRegen(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_Shield_getPowerRegen(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_Shield_getPowerRegenResource(int weaponDefId, int resourceId) {
		return this.WeaponDef_Shield_getPowerRegenResource(this.skirmishAIId, weaponDefId, resourceId);
	}
	private native float WeaponDef_Shield_getPowerRegenResource(int _skirmishAIId, int weaponDefId, int resourceId);

	@Override
	public float WeaponDef_Shield_getStartingPower(int weaponDefId) {
		return this.WeaponDef_Shield_getStartingPower(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_Shield_getStartingPower(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_Shield_getRechargeDelay(int weaponDefId) {
		return this.WeaponDef_Shield_getRechargeDelay(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_Shield_getRechargeDelay(int _skirmishAIId, int weaponDefId);

	@Override
	public void WeaponDef_Shield_getGoodColor(int weaponDefId, short[] return_colorS3_out) {
		this.WeaponDef_Shield_getGoodColor(this.skirmishAIId, weaponDefId, return_colorS3_out);
	}
	private native void WeaponDef_Shield_getGoodColor(int _skirmishAIId, int weaponDefId, short[] return_colorS3_out);

	@Override
	public void WeaponDef_Shield_getBadColor(int weaponDefId, short[] return_colorS3_out) {
		this.WeaponDef_Shield_getBadColor(this.skirmishAIId, weaponDefId, return_colorS3_out);
	}
	private native void WeaponDef_Shield_getBadColor(int _skirmishAIId, int weaponDefId, short[] return_colorS3_out);

	@Override
	public short WeaponDef_Shield_getAlpha(int weaponDefId) {
		return this.WeaponDef_Shield_getAlpha(this.skirmishAIId, weaponDefId);
	}
	private native short WeaponDef_Shield_getAlpha(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_Shield_getInterceptType(int weaponDefId) {
		return this.WeaponDef_Shield_getInterceptType(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_Shield_getInterceptType(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_getInterceptedByShieldType(int weaponDefId) {
		return this.WeaponDef_getInterceptedByShieldType(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_getInterceptedByShieldType(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isAvoidFriendly(int weaponDefId) {
		return this.WeaponDef_isAvoidFriendly(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isAvoidFriendly(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isAvoidFeature(int weaponDefId) {
		return this.WeaponDef_isAvoidFeature(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isAvoidFeature(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isAvoidNeutral(int weaponDefId) {
		return this.WeaponDef_isAvoidNeutral(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isAvoidNeutral(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getTargetBorder(int weaponDefId) {
		return this.WeaponDef_getTargetBorder(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getTargetBorder(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getCylinderTargetting(int weaponDefId) {
		return this.WeaponDef_getCylinderTargetting(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getCylinderTargetting(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getMinIntensity(int weaponDefId) {
		return this.WeaponDef_getMinIntensity(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getMinIntensity(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getHeightBoostFactor(int weaponDefId) {
		return this.WeaponDef_getHeightBoostFactor(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getHeightBoostFactor(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getProximityPriority(int weaponDefId) {
		return this.WeaponDef_getProximityPriority(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getProximityPriority(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_getCollisionFlags(int weaponDefId) {
		return this.WeaponDef_getCollisionFlags(this.skirmishAIId, weaponDefId);
	}
	private native int WeaponDef_getCollisionFlags(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isSweepFire(int weaponDefId) {
		return this.WeaponDef_isSweepFire(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isSweepFire(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isAbleToAttackGround(int weaponDefId) {
		return this.WeaponDef_isAbleToAttackGround(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isAbleToAttackGround(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getCameraShake(int weaponDefId) {
		return this.WeaponDef_getCameraShake(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getCameraShake(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getDynDamageExp(int weaponDefId) {
		return this.WeaponDef_getDynDamageExp(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getDynDamageExp(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getDynDamageMin(int weaponDefId) {
		return this.WeaponDef_getDynDamageMin(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getDynDamageMin(int _skirmishAIId, int weaponDefId);

	@Override
	public float WeaponDef_getDynDamageRange(int weaponDefId) {
		return this.WeaponDef_getDynDamageRange(this.skirmishAIId, weaponDefId);
	}
	private native float WeaponDef_getDynDamageRange(int _skirmishAIId, int weaponDefId);

	@Override
	public boolean WeaponDef_isDynDamageInverted(int weaponDefId) {
		return this.WeaponDef_isDynDamageInverted(this.skirmishAIId, weaponDefId);
	}
	private native boolean WeaponDef_isDynDamageInverted(int _skirmishAIId, int weaponDefId);

	@Override
	public int WeaponDef_getCustomParams(int weaponDefId, String[] keys, String[] values) {
		return this.WeaponDef_getCustomParams(this.skirmishAIId, weaponDefId, keys, values);
	}
	private native int WeaponDef_getCustomParams(int _skirmishAIId, int weaponDefId, String[] keys, String[] values);

	@Override
	public boolean Debug_GraphDrawer_isEnabled() {
		return this.Debug_GraphDrawer_isEnabled(this.skirmishAIId);
	}
	private native boolean Debug_GraphDrawer_isEnabled(int _skirmishAIId);

	@Override
	public int Cheats_setMyIncomeMultiplier(float factor) {
		return this.Cheats_setMyIncomeMultiplier(this.skirmishAIId, factor);
	}
	private native int Cheats_setMyIncomeMultiplier(int _skirmishAIId, float factor);

	@Override
	public int Cheats_giveMeResource(int resourceId, float amount) {
		return this.Cheats_giveMeResource(this.skirmishAIId, resourceId, amount);
	}
	private native int Cheats_giveMeResource(int _skirmishAIId, int resourceId, float amount);

	@Override
	public int Cheats_giveMeUnit(int unitDefId, float[] pos_posF3) {
		return this.Cheats_giveMeUnit(this.skirmishAIId, unitDefId, pos_posF3);
	}
	private native int Cheats_giveMeUnit(int _skirmishAIId, int unitDefId, float[] pos_posF3);

	@Override
	public int Game_sendTextMessage(String text, int zone) {
		return this.Game_sendTextMessage(this.skirmishAIId, text, zone);
	}
	private native int Game_sendTextMessage(int _skirmishAIId, String text, int zone);

	@Override
	public int Game_setLastMessagePosition(float[] pos_posF3) {
		return this.Game_setLastMessagePosition(this.skirmishAIId, pos_posF3);
	}
	private native int Game_setLastMessagePosition(int _skirmishAIId, float[] pos_posF3);

	@Override
	public boolean Economy_sendResource(int resourceId, float amount, int receivingTeamId) {
		return this.Economy_sendResource(this.skirmishAIId, resourceId, amount, receivingTeamId);
	}
	private native boolean Economy_sendResource(int _skirmishAIId, int resourceId, float amount, int receivingTeamId);

	@Override
	public int Economy_sendUnits(int[] unitIds, int unitIds_size, int receivingTeamId) {
		return this.Economy_sendUnits(this.skirmishAIId, unitIds, unitIds_size, receivingTeamId);
	}
	private native int Economy_sendUnits(int _skirmishAIId, int[] unitIds, int unitIds_size, int receivingTeamId);

	@Override
	public int Group_create() {
		return this.Group_create(this.skirmishAIId);
	}
	private native int Group_create(int _skirmishAIId);

	@Override
	public int Group_erase(int groupId) {
		return this.Group_erase(this.skirmishAIId, groupId);
	}
	private native int Group_erase(int _skirmishAIId, int groupId);

	@Override
	public int Pathing_initPath(float[] start_posF3, float[] end_posF3, int pathType, float goalRadius) {
		return this.Pathing_initPath(this.skirmishAIId, start_posF3, end_posF3, pathType, goalRadius);
	}
	private native int Pathing_initPath(int _skirmishAIId, float[] start_posF3, float[] end_posF3, int pathType, float goalRadius);

	@Override
	public int Pathing_getApproximateLength(float[] start_posF3, float[] end_posF3, int pathType, float goalRadius) {
		return this.Pathing_getApproximateLength(this.skirmishAIId, start_posF3, end_posF3, pathType, goalRadius);
	}
	private native int Pathing_getApproximateLength(int _skirmishAIId, float[] start_posF3, float[] end_posF3, int pathType, float goalRadius);

	@Override
	public int Pathing_getNextWaypoint(int pathId, float[] ret_nextWaypoint_posF3_out) {
		return this.Pathing_getNextWaypoint(this.skirmishAIId, pathId, ret_nextWaypoint_posF3_out);
	}
	private native int Pathing_getNextWaypoint(int _skirmishAIId, int pathId, float[] ret_nextWaypoint_posF3_out);

	@Override
	public int Pathing_freePath(int pathId) {
		return this.Pathing_freePath(this.skirmishAIId, pathId);
	}
	private native int Pathing_freePath(int _skirmishAIId, int pathId);

	@Override
	public int Lua_callRules(String inData, int inSize, String ret_outData) {
		return this.Lua_callRules(this.skirmishAIId, inData, inSize, ret_outData);
	}
	private native int Lua_callRules(int _skirmishAIId, String inData, int inSize, String ret_outData);

	@Override
	public int Lua_callUI(String inData, int inSize, String ret_outData) {
		return this.Lua_callUI(this.skirmishAIId, inData, inSize, ret_outData);
	}
	private native int Lua_callUI(int _skirmishAIId, String inData, int inSize, String ret_outData);

	@Override
	public int Game_sendStartPosition(boolean ready, float[] pos_posF3) {
		return this.Game_sendStartPosition(this.skirmishAIId, ready, pos_posF3);
	}
	private native int Game_sendStartPosition(int _skirmishAIId, boolean ready, float[] pos_posF3);

	@Override
	public int Map_Drawer_addNotification(float[] pos_posF3, short[] color_colorS3, short alpha) {
		return this.Map_Drawer_addNotification(this.skirmishAIId, pos_posF3, color_colorS3, alpha);
	}
	private native int Map_Drawer_addNotification(int _skirmishAIId, float[] pos_posF3, short[] color_colorS3, short alpha);

	@Override
	public int Map_Drawer_addPoint(float[] pos_posF3, String label) {
		return this.Map_Drawer_addPoint(this.skirmishAIId, pos_posF3, label);
	}
	private native int Map_Drawer_addPoint(int _skirmishAIId, float[] pos_posF3, String label);

	@Override
	public int Map_Drawer_deletePointsAndLines(float[] pos_posF3) {
		return this.Map_Drawer_deletePointsAndLines(this.skirmishAIId, pos_posF3);
	}
	private native int Map_Drawer_deletePointsAndLines(int _skirmishAIId, float[] pos_posF3);

	@Override
	public int Map_Drawer_addLine(float[] posFrom_posF3, float[] posTo_posF3) {
		return this.Map_Drawer_addLine(this.skirmishAIId, posFrom_posF3, posTo_posF3);
	}
	private native int Map_Drawer_addLine(int _skirmishAIId, float[] posFrom_posF3, float[] posTo_posF3);

	@Override
	public int Map_Drawer_PathDrawer_start(float[] pos_posF3, short[] color_colorS3, short alpha) {
		return this.Map_Drawer_PathDrawer_start(this.skirmishAIId, pos_posF3, color_colorS3, alpha);
	}
	private native int Map_Drawer_PathDrawer_start(int _skirmishAIId, float[] pos_posF3, short[] color_colorS3, short alpha);

	@Override
	public int Map_Drawer_PathDrawer_finish(boolean iAmUseless) {
		return this.Map_Drawer_PathDrawer_finish(this.skirmishAIId, iAmUseless);
	}
	private native int Map_Drawer_PathDrawer_finish(int _skirmishAIId, boolean iAmUseless);

	@Override
	public int Map_Drawer_PathDrawer_drawLine(float[] endPos_posF3, short[] color_colorS3, short alpha) {
		return this.Map_Drawer_PathDrawer_drawLine(this.skirmishAIId, endPos_posF3, color_colorS3, alpha);
	}
	private native int Map_Drawer_PathDrawer_drawLine(int _skirmishAIId, float[] endPos_posF3, short[] color_colorS3, short alpha);

	@Override
	public int Map_Drawer_PathDrawer_drawLineAndCommandIcon(int cmdId, float[] endPos_posF3, short[] color_colorS3, short alpha) {
		return this.Map_Drawer_PathDrawer_drawLineAndCommandIcon(this.skirmishAIId, cmdId, endPos_posF3, color_colorS3, alpha);
	}
	private native int Map_Drawer_PathDrawer_drawLineAndCommandIcon(int _skirmishAIId, int cmdId, float[] endPos_posF3, short[] color_colorS3, short alpha);

	@Override
	public int Map_Drawer_PathDrawer_drawIcon(int cmdId) {
		return this.Map_Drawer_PathDrawer_drawIcon(this.skirmishAIId, cmdId);
	}
	private native int Map_Drawer_PathDrawer_drawIcon(int _skirmishAIId, int cmdId);

	@Override
	public int Map_Drawer_PathDrawer_suspend(float[] endPos_posF3, short[] color_colorS3, short alpha) {
		return this.Map_Drawer_PathDrawer_suspend(this.skirmishAIId, endPos_posF3, color_colorS3, alpha);
	}
	private native int Map_Drawer_PathDrawer_suspend(int _skirmishAIId, float[] endPos_posF3, short[] color_colorS3, short alpha);

	@Override
	public int Map_Drawer_PathDrawer_restart(boolean sameColor) {
		return this.Map_Drawer_PathDrawer_restart(this.skirmishAIId, sameColor);
	}
	private native int Map_Drawer_PathDrawer_restart(int _skirmishAIId, boolean sameColor);

	@Override
	public int Map_Drawer_Figure_drawSpline(float[] pos1_posF3, float[] pos2_posF3, float[] pos3_posF3, float[] pos4_posF3, float width, boolean arrow, int lifeTime, int figureGroupId) {
		return this.Map_Drawer_Figure_drawSpline(this.skirmishAIId, pos1_posF3, pos2_posF3, pos3_posF3, pos4_posF3, width, arrow, lifeTime, figureGroupId);
	}
	private native int Map_Drawer_Figure_drawSpline(int _skirmishAIId, float[] pos1_posF3, float[] pos2_posF3, float[] pos3_posF3, float[] pos4_posF3, float width, boolean arrow, int lifeTime, int figureGroupId);

	@Override
	public int Map_Drawer_Figure_drawLine(float[] pos1_posF3, float[] pos2_posF3, float width, boolean arrow, int lifeTime, int figureGroupId) {
		return this.Map_Drawer_Figure_drawLine(this.skirmishAIId, pos1_posF3, pos2_posF3, width, arrow, lifeTime, figureGroupId);
	}
	private native int Map_Drawer_Figure_drawLine(int _skirmishAIId, float[] pos1_posF3, float[] pos2_posF3, float width, boolean arrow, int lifeTime, int figureGroupId);

	@Override
	public int Map_Drawer_Figure_setColor(int figureGroupId, short[] color_colorS3, short alpha) {
		return this.Map_Drawer_Figure_setColor(this.skirmishAIId, figureGroupId, color_colorS3, alpha);
	}
	private native int Map_Drawer_Figure_setColor(int _skirmishAIId, int figureGroupId, short[] color_colorS3, short alpha);

	@Override
	public int Map_Drawer_Figure_remove(int figureGroupId) {
		return this.Map_Drawer_Figure_remove(this.skirmishAIId, figureGroupId);
	}
	private native int Map_Drawer_Figure_remove(int _skirmishAIId, int figureGroupId);

	@Override
	public int Map_Drawer_drawUnit(int toDrawUnitDefId, float[] pos_posF3, float rotation, int lifeTime, int teamId, boolean transparent, boolean drawBorder, int facing) {
		return this.Map_Drawer_drawUnit(this.skirmishAIId, toDrawUnitDefId, pos_posF3, rotation, lifeTime, teamId, transparent, drawBorder, facing);
	}
	private native int Map_Drawer_drawUnit(int _skirmishAIId, int toDrawUnitDefId, float[] pos_posF3, float rotation, int lifeTime, int teamId, boolean transparent, boolean drawBorder, int facing);

	@Override
	public int Unit_build(int unitId, int toBuildUnitDefId, float[] buildPos_posF3, int facing, short options, int timeOut) {
		return this.Unit_build(this.skirmishAIId, unitId, toBuildUnitDefId, buildPos_posF3, facing, options, timeOut);
	}
	private native int Unit_build(int _skirmishAIId, int unitId, int toBuildUnitDefId, float[] buildPos_posF3, int facing, short options, int timeOut);

	@Override
	public int Group_build(int groupId, int toBuildUnitDefId, float[] buildPos_posF3, int facing, short options, int timeOut) {
		return this.Group_build(this.skirmishAIId, groupId, toBuildUnitDefId, buildPos_posF3, facing, options, timeOut);
	}
	private native int Group_build(int _skirmishAIId, int groupId, int toBuildUnitDefId, float[] buildPos_posF3, int facing, short options, int timeOut);

	@Override
	public int Unit_stop(int unitId, short options, int timeOut) {
		return this.Unit_stop(this.skirmishAIId, unitId, options, timeOut);
	}
	private native int Unit_stop(int _skirmishAIId, int unitId, short options, int timeOut);

	@Override
	public int Group_stop(int groupId, short options, int timeOut) {
		return this.Group_stop(this.skirmishAIId, groupId, options, timeOut);
	}
	private native int Group_stop(int _skirmishAIId, int groupId, short options, int timeOut);

	@Override
	public int Unit_wait(int unitId, short options, int timeOut) {
		return this.Unit_wait(this.skirmishAIId, unitId, options, timeOut);
	}
	private native int Unit_wait(int _skirmishAIId, int unitId, short options, int timeOut);

	@Override
	public int Group_wait(int groupId, short options, int timeOut) {
		return this.Group_wait(this.skirmishAIId, groupId, options, timeOut);
	}
	private native int Group_wait(int _skirmishAIId, int groupId, short options, int timeOut);

	@Override
	public int Unit_waitFor(int unitId, int time, short options, int timeOut) {
		return this.Unit_waitFor(this.skirmishAIId, unitId, time, options, timeOut);
	}
	private native int Unit_waitFor(int _skirmishAIId, int unitId, int time, short options, int timeOut);

	@Override
	public int Group_waitFor(int groupId, int time, short options, int timeOut) {
		return this.Group_waitFor(this.skirmishAIId, groupId, time, options, timeOut);
	}
	private native int Group_waitFor(int _skirmishAIId, int groupId, int time, short options, int timeOut);

	@Override
	public int Unit_waitForDeathOf(int unitId, int toDieUnitId, short options, int timeOut) {
		return this.Unit_waitForDeathOf(this.skirmishAIId, unitId, toDieUnitId, options, timeOut);
	}
	private native int Unit_waitForDeathOf(int _skirmishAIId, int unitId, int toDieUnitId, short options, int timeOut);

	@Override
	public int Group_waitForDeathOf(int groupId, int toDieUnitId, short options, int timeOut) {
		return this.Group_waitForDeathOf(this.skirmishAIId, groupId, toDieUnitId, options, timeOut);
	}
	private native int Group_waitForDeathOf(int _skirmishAIId, int groupId, int toDieUnitId, short options, int timeOut);

	@Override
	public int Unit_waitForSquadSize(int unitId, int numUnits, short options, int timeOut) {
		return this.Unit_waitForSquadSize(this.skirmishAIId, unitId, numUnits, options, timeOut);
	}
	private native int Unit_waitForSquadSize(int _skirmishAIId, int unitId, int numUnits, short options, int timeOut);

	@Override
	public int Group_waitForSquadSize(int groupId, int numUnits, short options, int timeOut) {
		return this.Group_waitForSquadSize(this.skirmishAIId, groupId, numUnits, options, timeOut);
	}
	private native int Group_waitForSquadSize(int _skirmishAIId, int groupId, int numUnits, short options, int timeOut);

	@Override
	public int Unit_waitForAll(int unitId, short options, int timeOut) {
		return this.Unit_waitForAll(this.skirmishAIId, unitId, options, timeOut);
	}
	private native int Unit_waitForAll(int _skirmishAIId, int unitId, short options, int timeOut);

	@Override
	public int Group_waitForAll(int groupId, short options, int timeOut) {
		return this.Group_waitForAll(this.skirmishAIId, groupId, options, timeOut);
	}
	private native int Group_waitForAll(int _skirmishAIId, int groupId, short options, int timeOut);

	@Override
	public int Unit_moveTo(int unitId, float[] toPos_posF3, short options, int timeOut) {
		return this.Unit_moveTo(this.skirmishAIId, unitId, toPos_posF3, options, timeOut);
	}
	private native int Unit_moveTo(int _skirmishAIId, int unitId, float[] toPos_posF3, short options, int timeOut);

	@Override
	public int Group_moveTo(int groupId, float[] toPos_posF3, short options, int timeOut) {
		return this.Group_moveTo(this.skirmishAIId, groupId, toPos_posF3, options, timeOut);
	}
	private native int Group_moveTo(int _skirmishAIId, int groupId, float[] toPos_posF3, short options, int timeOut);

	@Override
	public int Unit_patrolTo(int unitId, float[] toPos_posF3, short options, int timeOut) {
		return this.Unit_patrolTo(this.skirmishAIId, unitId, toPos_posF3, options, timeOut);
	}
	private native int Unit_patrolTo(int _skirmishAIId, int unitId, float[] toPos_posF3, short options, int timeOut);

	@Override
	public int Group_patrolTo(int groupId, float[] toPos_posF3, short options, int timeOut) {
		return this.Group_patrolTo(this.skirmishAIId, groupId, toPos_posF3, options, timeOut);
	}
	private native int Group_patrolTo(int _skirmishAIId, int groupId, float[] toPos_posF3, short options, int timeOut);

	@Override
	public int Unit_fight(int unitId, float[] toPos_posF3, short options, int timeOut) {
		return this.Unit_fight(this.skirmishAIId, unitId, toPos_posF3, options, timeOut);
	}
	private native int Unit_fight(int _skirmishAIId, int unitId, float[] toPos_posF3, short options, int timeOut);

	@Override
	public int Group_fight(int groupId, float[] toPos_posF3, short options, int timeOut) {
		return this.Group_fight(this.skirmishAIId, groupId, toPos_posF3, options, timeOut);
	}
	private native int Group_fight(int _skirmishAIId, int groupId, float[] toPos_posF3, short options, int timeOut);

	@Override
	public int Unit_attack(int unitId, int toAttackUnitId, short options, int timeOut) {
		return this.Unit_attack(this.skirmishAIId, unitId, toAttackUnitId, options, timeOut);
	}
	private native int Unit_attack(int _skirmishAIId, int unitId, int toAttackUnitId, short options, int timeOut);

	@Override
	public int Group_attack(int groupId, int toAttackUnitId, short options, int timeOut) {
		return this.Group_attack(this.skirmishAIId, groupId, toAttackUnitId, options, timeOut);
	}
	private native int Group_attack(int _skirmishAIId, int groupId, int toAttackUnitId, short options, int timeOut);

	@Override
	public int Unit_attackArea(int unitId, float[] toAttackPos_posF3, float radius, short options, int timeOut) {
		return this.Unit_attackArea(this.skirmishAIId, unitId, toAttackPos_posF3, radius, options, timeOut);
	}
	private native int Unit_attackArea(int _skirmishAIId, int unitId, float[] toAttackPos_posF3, float radius, short options, int timeOut);

	@Override
	public int Group_attackArea(int groupId, float[] toAttackPos_posF3, float radius, short options, int timeOut) {
		return this.Group_attackArea(this.skirmishAIId, groupId, toAttackPos_posF3, radius, options, timeOut);
	}
	private native int Group_attackArea(int _skirmishAIId, int groupId, float[] toAttackPos_posF3, float radius, short options, int timeOut);

	@Override
	public int Unit_guard(int unitId, int toGuardUnitId, short options, int timeOut) {
		return this.Unit_guard(this.skirmishAIId, unitId, toGuardUnitId, options, timeOut);
	}
	private native int Unit_guard(int _skirmishAIId, int unitId, int toGuardUnitId, short options, int timeOut);

	@Override
	public int Group_guard(int groupId, int toGuardUnitId, short options, int timeOut) {
		return this.Group_guard(this.skirmishAIId, groupId, toGuardUnitId, options, timeOut);
	}
	private native int Group_guard(int _skirmishAIId, int groupId, int toGuardUnitId, short options, int timeOut);

	@Override
	public int Unit_aiSelect(int unitId, short options, int timeOut) {
		return this.Unit_aiSelect(this.skirmishAIId, unitId, options, timeOut);
	}
	private native int Unit_aiSelect(int _skirmishAIId, int unitId, short options, int timeOut);

	@Override
	public int Group_aiSelect(int groupId, short options, int timeOut) {
		return this.Group_aiSelect(this.skirmishAIId, groupId, options, timeOut);
	}
	private native int Group_aiSelect(int _skirmishAIId, int groupId, short options, int timeOut);

	@Override
	public int Unit_addToGroup(int unitId, int toGroupId, short options, int timeOut) {
		return this.Unit_addToGroup(this.skirmishAIId, unitId, toGroupId, options, timeOut);
	}
	private native int Unit_addToGroup(int _skirmishAIId, int unitId, int toGroupId, short options, int timeOut);

	@Override
	public int Group_addToGroup(int groupId, int toGroupId, short options, int timeOut) {
		return this.Group_addToGroup(this.skirmishAIId, groupId, toGroupId, options, timeOut);
	}
	private native int Group_addToGroup(int _skirmishAIId, int groupId, int toGroupId, short options, int timeOut);

	@Override
	public int Unit_removeFromGroup(int unitId, short options, int timeOut) {
		return this.Unit_removeFromGroup(this.skirmishAIId, unitId, options, timeOut);
	}
	private native int Unit_removeFromGroup(int _skirmishAIId, int unitId, short options, int timeOut);

	@Override
	public int Group_removeFromGroup(int groupId, short options, int timeOut) {
		return this.Group_removeFromGroup(this.skirmishAIId, groupId, options, timeOut);
	}
	private native int Group_removeFromGroup(int _skirmishAIId, int groupId, short options, int timeOut);

	@Override
	public int Unit_repair(int unitId, int toRepairUnitId, short options, int timeOut) {
		return this.Unit_repair(this.skirmishAIId, unitId, toRepairUnitId, options, timeOut);
	}
	private native int Unit_repair(int _skirmishAIId, int unitId, int toRepairUnitId, short options, int timeOut);

	@Override
	public int Group_repair(int groupId, int toRepairUnitId, short options, int timeOut) {
		return this.Group_repair(this.skirmishAIId, groupId, toRepairUnitId, options, timeOut);
	}
	private native int Group_repair(int _skirmishAIId, int groupId, int toRepairUnitId, short options, int timeOut);

	@Override
	public int Unit_setFireState(int unitId, int fireState, short options, int timeOut) {
		return this.Unit_setFireState(this.skirmishAIId, unitId, fireState, options, timeOut);
	}
	private native int Unit_setFireState(int _skirmishAIId, int unitId, int fireState, short options, int timeOut);

	@Override
	public int Group_setFireState(int groupId, int fireState, short options, int timeOut) {
		return this.Group_setFireState(this.skirmishAIId, groupId, fireState, options, timeOut);
	}
	private native int Group_setFireState(int _skirmishAIId, int groupId, int fireState, short options, int timeOut);

	@Override
	public int Unit_setMoveState(int unitId, int moveState, short options, int timeOut) {
		return this.Unit_setMoveState(this.skirmishAIId, unitId, moveState, options, timeOut);
	}
	private native int Unit_setMoveState(int _skirmishAIId, int unitId, int moveState, short options, int timeOut);

	@Override
	public int Group_setMoveState(int groupId, int moveState, short options, int timeOut) {
		return this.Group_setMoveState(this.skirmishAIId, groupId, moveState, options, timeOut);
	}
	private native int Group_setMoveState(int _skirmishAIId, int groupId, int moveState, short options, int timeOut);

	@Override
	public int Unit_setBase(int unitId, float[] basePos_posF3, short options, int timeOut) {
		return this.Unit_setBase(this.skirmishAIId, unitId, basePos_posF3, options, timeOut);
	}
	private native int Unit_setBase(int _skirmishAIId, int unitId, float[] basePos_posF3, short options, int timeOut);

	@Override
	public int Group_setBase(int groupId, float[] basePos_posF3, short options, int timeOut) {
		return this.Group_setBase(this.skirmishAIId, groupId, basePos_posF3, options, timeOut);
	}
	private native int Group_setBase(int _skirmishAIId, int groupId, float[] basePos_posF3, short options, int timeOut);

	@Override
	public int Unit_selfDestruct(int unitId, short options, int timeOut) {
		return this.Unit_selfDestruct(this.skirmishAIId, unitId, options, timeOut);
	}
	private native int Unit_selfDestruct(int _skirmishAIId, int unitId, short options, int timeOut);

	@Override
	public int Group_selfDestruct(int groupId, short options, int timeOut) {
		return this.Group_selfDestruct(this.skirmishAIId, groupId, options, timeOut);
	}
	private native int Group_selfDestruct(int _skirmishAIId, int groupId, short options, int timeOut);

	@Override
	public int Unit_setWantedMaxSpeed(int unitId, float wantedMaxSpeed, short options, int timeOut) {
		return this.Unit_setWantedMaxSpeed(this.skirmishAIId, unitId, wantedMaxSpeed, options, timeOut);
	}
	private native int Unit_setWantedMaxSpeed(int _skirmishAIId, int unitId, float wantedMaxSpeed, short options, int timeOut);

	@Override
	public int Group_setWantedMaxSpeed(int groupId, float wantedMaxSpeed, short options, int timeOut) {
		return this.Group_setWantedMaxSpeed(this.skirmishAIId, groupId, wantedMaxSpeed, options, timeOut);
	}
	private native int Group_setWantedMaxSpeed(int _skirmishAIId, int groupId, float wantedMaxSpeed, short options, int timeOut);

	@Override
	public int Unit_loadUnits(int unitId, int[] toLoadUnitIds, int toLoadUnitIds_size, short options, int timeOut) {
		return this.Unit_loadUnits(this.skirmishAIId, unitId, toLoadUnitIds, toLoadUnitIds_size, options, timeOut);
	}
	private native int Unit_loadUnits(int _skirmishAIId, int unitId, int[] toLoadUnitIds, int toLoadUnitIds_size, short options, int timeOut);

	@Override
	public int Group_loadUnits(int groupId, int[] toLoadUnitIds, int toLoadUnitIds_size, short options, int timeOut) {
		return this.Group_loadUnits(this.skirmishAIId, groupId, toLoadUnitIds, toLoadUnitIds_size, options, timeOut);
	}
	private native int Group_loadUnits(int _skirmishAIId, int groupId, int[] toLoadUnitIds, int toLoadUnitIds_size, short options, int timeOut);

	@Override
	public int Unit_loadUnitsInArea(int unitId, float[] pos_posF3, float radius, short options, int timeOut) {
		return this.Unit_loadUnitsInArea(this.skirmishAIId, unitId, pos_posF3, radius, options, timeOut);
	}
	private native int Unit_loadUnitsInArea(int _skirmishAIId, int unitId, float[] pos_posF3, float radius, short options, int timeOut);

	@Override
	public int Group_loadUnitsInArea(int groupId, float[] pos_posF3, float radius, short options, int timeOut) {
		return this.Group_loadUnitsInArea(this.skirmishAIId, groupId, pos_posF3, radius, options, timeOut);
	}
	private native int Group_loadUnitsInArea(int _skirmishAIId, int groupId, float[] pos_posF3, float radius, short options, int timeOut);

	@Override
	public int Unit_loadOnto(int unitId, int transporterUnitId, short options, int timeOut) {
		return this.Unit_loadOnto(this.skirmishAIId, unitId, transporterUnitId, options, timeOut);
	}
	private native int Unit_loadOnto(int _skirmishAIId, int unitId, int transporterUnitId, short options, int timeOut);

	@Override
	public int Group_loadOnto(int groupId, int transporterUnitId, short options, int timeOut) {
		return this.Group_loadOnto(this.skirmishAIId, groupId, transporterUnitId, options, timeOut);
	}
	private native int Group_loadOnto(int _skirmishAIId, int groupId, int transporterUnitId, short options, int timeOut);

	@Override
	public int Unit_unload(int unitId, float[] toPos_posF3, int toUnloadUnitId, short options, int timeOut) {
		return this.Unit_unload(this.skirmishAIId, unitId, toPos_posF3, toUnloadUnitId, options, timeOut);
	}
	private native int Unit_unload(int _skirmishAIId, int unitId, float[] toPos_posF3, int toUnloadUnitId, short options, int timeOut);

	@Override
	public int Group_unload(int groupId, float[] toPos_posF3, int toUnloadUnitId, short options, int timeOut) {
		return this.Group_unload(this.skirmishAIId, groupId, toPos_posF3, toUnloadUnitId, options, timeOut);
	}
	private native int Group_unload(int _skirmishAIId, int groupId, float[] toPos_posF3, int toUnloadUnitId, short options, int timeOut);

	@Override
	public int Unit_unloadUnitsInArea(int unitId, float[] toPos_posF3, float radius, short options, int timeOut) {
		return this.Unit_unloadUnitsInArea(this.skirmishAIId, unitId, toPos_posF3, radius, options, timeOut);
	}
	private native int Unit_unloadUnitsInArea(int _skirmishAIId, int unitId, float[] toPos_posF3, float radius, short options, int timeOut);

	@Override
	public int Group_unloadUnitsInArea(int groupId, float[] toPos_posF3, float radius, short options, int timeOut) {
		return this.Group_unloadUnitsInArea(this.skirmishAIId, groupId, toPos_posF3, radius, options, timeOut);
	}
	private native int Group_unloadUnitsInArea(int _skirmishAIId, int groupId, float[] toPos_posF3, float radius, short options, int timeOut);

	@Override
	public int Unit_setOn(int unitId, boolean on, short options, int timeOut) {
		return this.Unit_setOn(this.skirmishAIId, unitId, on, options, timeOut);
	}
	private native int Unit_setOn(int _skirmishAIId, int unitId, boolean on, short options, int timeOut);

	@Override
	public int Group_setOn(int groupId, boolean on, short options, int timeOut) {
		return this.Group_setOn(this.skirmishAIId, groupId, on, options, timeOut);
	}
	private native int Group_setOn(int _skirmishAIId, int groupId, boolean on, short options, int timeOut);

	@Override
	public int Unit_reclaimUnit(int unitId, int toReclaimUnitId, short options, int timeOut) {
		return this.Unit_reclaimUnit(this.skirmishAIId, unitId, toReclaimUnitId, options, timeOut);
	}
	private native int Unit_reclaimUnit(int _skirmishAIId, int unitId, int toReclaimUnitId, short options, int timeOut);

	@Override
	public int Group_reclaimUnit(int groupId, int toReclaimUnitId, short options, int timeOut) {
		return this.Group_reclaimUnit(this.skirmishAIId, groupId, toReclaimUnitId, options, timeOut);
	}
	private native int Group_reclaimUnit(int _skirmishAIId, int groupId, int toReclaimUnitId, short options, int timeOut);

	@Override
	public int Unit_reclaimFeature(int unitId, int toReclaimFeatureId, short options, int timeOut) {
		return this.Unit_reclaimFeature(this.skirmishAIId, unitId, toReclaimFeatureId, options, timeOut);
	}
	private native int Unit_reclaimFeature(int _skirmishAIId, int unitId, int toReclaimFeatureId, short options, int timeOut);

	@Override
	public int Group_reclaimFeature(int groupId, int toReclaimFeatureId, short options, int timeOut) {
		return this.Group_reclaimFeature(this.skirmishAIId, groupId, toReclaimFeatureId, options, timeOut);
	}
	private native int Group_reclaimFeature(int _skirmishAIId, int groupId, int toReclaimFeatureId, short options, int timeOut);

	@Override
	public int Unit_reclaimInArea(int unitId, float[] pos_posF3, float radius, short options, int timeOut) {
		return this.Unit_reclaimInArea(this.skirmishAIId, unitId, pos_posF3, radius, options, timeOut);
	}
	private native int Unit_reclaimInArea(int _skirmishAIId, int unitId, float[] pos_posF3, float radius, short options, int timeOut);

	@Override
	public int Group_reclaimInArea(int groupId, float[] pos_posF3, float radius, short options, int timeOut) {
		return this.Group_reclaimInArea(this.skirmishAIId, groupId, pos_posF3, radius, options, timeOut);
	}
	private native int Group_reclaimInArea(int _skirmishAIId, int groupId, float[] pos_posF3, float radius, short options, int timeOut);

	@Override
	public int Unit_cloak(int unitId, boolean cloak, short options, int timeOut) {
		return this.Unit_cloak(this.skirmishAIId, unitId, cloak, options, timeOut);
	}
	private native int Unit_cloak(int _skirmishAIId, int unitId, boolean cloak, short options, int timeOut);

	@Override
	public int Group_cloak(int groupId, boolean cloak, short options, int timeOut) {
		return this.Group_cloak(this.skirmishAIId, groupId, cloak, options, timeOut);
	}
	private native int Group_cloak(int _skirmishAIId, int groupId, boolean cloak, short options, int timeOut);

	@Override
	public int Unit_stockpile(int unitId, short options, int timeOut) {
		return this.Unit_stockpile(this.skirmishAIId, unitId, options, timeOut);
	}
	private native int Unit_stockpile(int _skirmishAIId, int unitId, short options, int timeOut);

	@Override
	public int Group_stockpile(int groupId, short options, int timeOut) {
		return this.Group_stockpile(this.skirmishAIId, groupId, options, timeOut);
	}
	private native int Group_stockpile(int _skirmishAIId, int groupId, short options, int timeOut);

	@Override
	public int Unit_dGun(int unitId, int toAttackUnitId, short options, int timeOut) {
		return this.Unit_dGun(this.skirmishAIId, unitId, toAttackUnitId, options, timeOut);
	}
	private native int Unit_dGun(int _skirmishAIId, int unitId, int toAttackUnitId, short options, int timeOut);

	@Override
	public int Group_dGun(int groupId, int toAttackUnitId, short options, int timeOut) {
		return this.Group_dGun(this.skirmishAIId, groupId, toAttackUnitId, options, timeOut);
	}
	private native int Group_dGun(int _skirmishAIId, int groupId, int toAttackUnitId, short options, int timeOut);

	@Override
	public int Unit_dGunPosition(int unitId, float[] pos_posF3, short options, int timeOut) {
		return this.Unit_dGunPosition(this.skirmishAIId, unitId, pos_posF3, options, timeOut);
	}
	private native int Unit_dGunPosition(int _skirmishAIId, int unitId, float[] pos_posF3, short options, int timeOut);

	@Override
	public int Group_dGunPosition(int groupId, float[] pos_posF3, short options, int timeOut) {
		return this.Group_dGunPosition(this.skirmishAIId, groupId, pos_posF3, options, timeOut);
	}
	private native int Group_dGunPosition(int _skirmishAIId, int groupId, float[] pos_posF3, short options, int timeOut);

	@Override
	public int Unit_restoreArea(int unitId, float[] pos_posF3, float radius, short options, int timeOut) {
		return this.Unit_restoreArea(this.skirmishAIId, unitId, pos_posF3, radius, options, timeOut);
	}
	private native int Unit_restoreArea(int _skirmishAIId, int unitId, float[] pos_posF3, float radius, short options, int timeOut);

	@Override
	public int Group_restoreArea(int groupId, float[] pos_posF3, float radius, short options, int timeOut) {
		return this.Group_restoreArea(this.skirmishAIId, groupId, pos_posF3, radius, options, timeOut);
	}
	private native int Group_restoreArea(int _skirmishAIId, int groupId, float[] pos_posF3, float radius, short options, int timeOut);

	@Override
	public int Unit_setRepeat(int unitId, boolean repeat, short options, int timeOut) {
		return this.Unit_setRepeat(this.skirmishAIId, unitId, repeat, options, timeOut);
	}
	private native int Unit_setRepeat(int _skirmishAIId, int unitId, boolean repeat, short options, int timeOut);

	@Override
	public int Group_setRepeat(int groupId, boolean repeat, short options, int timeOut) {
		return this.Group_setRepeat(this.skirmishAIId, groupId, repeat, options, timeOut);
	}
	private native int Group_setRepeat(int _skirmishAIId, int groupId, boolean repeat, short options, int timeOut);

	@Override
	public int Unit_setTrajectory(int unitId, int trajectory, short options, int timeOut) {
		return this.Unit_setTrajectory(this.skirmishAIId, unitId, trajectory, options, timeOut);
	}
	private native int Unit_setTrajectory(int _skirmishAIId, int unitId, int trajectory, short options, int timeOut);

	@Override
	public int Group_setTrajectory(int groupId, int trajectory, short options, int timeOut) {
		return this.Group_setTrajectory(this.skirmishAIId, groupId, trajectory, options, timeOut);
	}
	private native int Group_setTrajectory(int _skirmishAIId, int groupId, int trajectory, short options, int timeOut);

	@Override
	public int Unit_resurrect(int unitId, int toResurrectFeatureId, short options, int timeOut) {
		return this.Unit_resurrect(this.skirmishAIId, unitId, toResurrectFeatureId, options, timeOut);
	}
	private native int Unit_resurrect(int _skirmishAIId, int unitId, int toResurrectFeatureId, short options, int timeOut);

	@Override
	public int Group_resurrect(int groupId, int toResurrectFeatureId, short options, int timeOut) {
		return this.Group_resurrect(this.skirmishAIId, groupId, toResurrectFeatureId, options, timeOut);
	}
	private native int Group_resurrect(int _skirmishAIId, int groupId, int toResurrectFeatureId, short options, int timeOut);

	@Override
	public int Unit_resurrectInArea(int unitId, float[] pos_posF3, float radius, short options, int timeOut) {
		return this.Unit_resurrectInArea(this.skirmishAIId, unitId, pos_posF3, radius, options, timeOut);
	}
	private native int Unit_resurrectInArea(int _skirmishAIId, int unitId, float[] pos_posF3, float radius, short options, int timeOut);

	@Override
	public int Group_resurrectInArea(int groupId, float[] pos_posF3, float radius, short options, int timeOut) {
		return this.Group_resurrectInArea(this.skirmishAIId, groupId, pos_posF3, radius, options, timeOut);
	}
	private native int Group_resurrectInArea(int _skirmishAIId, int groupId, float[] pos_posF3, float radius, short options, int timeOut);

	@Override
	public int Unit_capture(int unitId, int toCaptureUnitId, short options, int timeOut) {
		return this.Unit_capture(this.skirmishAIId, unitId, toCaptureUnitId, options, timeOut);
	}
	private native int Unit_capture(int _skirmishAIId, int unitId, int toCaptureUnitId, short options, int timeOut);

	@Override
	public int Group_capture(int groupId, int toCaptureUnitId, short options, int timeOut) {
		return this.Group_capture(this.skirmishAIId, groupId, toCaptureUnitId, options, timeOut);
	}
	private native int Group_capture(int _skirmishAIId, int groupId, int toCaptureUnitId, short options, int timeOut);

	@Override
	public int Unit_captureInArea(int unitId, float[] pos_posF3, float radius, short options, int timeOut) {
		return this.Unit_captureInArea(this.skirmishAIId, unitId, pos_posF3, radius, options, timeOut);
	}
	private native int Unit_captureInArea(int _skirmishAIId, int unitId, float[] pos_posF3, float radius, short options, int timeOut);

	@Override
	public int Group_captureInArea(int groupId, float[] pos_posF3, float radius, short options, int timeOut) {
		return this.Group_captureInArea(this.skirmishAIId, groupId, pos_posF3, radius, options, timeOut);
	}
	private native int Group_captureInArea(int _skirmishAIId, int groupId, float[] pos_posF3, float radius, short options, int timeOut);

	@Override
	public int Unit_setAutoRepairLevel(int unitId, int autoRepairLevel, short options, int timeOut) {
		return this.Unit_setAutoRepairLevel(this.skirmishAIId, unitId, autoRepairLevel, options, timeOut);
	}
	private native int Unit_setAutoRepairLevel(int _skirmishAIId, int unitId, int autoRepairLevel, short options, int timeOut);

	@Override
	public int Group_setAutoRepairLevel(int groupId, int autoRepairLevel, short options, int timeOut) {
		return this.Group_setAutoRepairLevel(this.skirmishAIId, groupId, autoRepairLevel, options, timeOut);
	}
	private native int Group_setAutoRepairLevel(int _skirmishAIId, int groupId, int autoRepairLevel, short options, int timeOut);

	@Override
	public int Unit_setIdleMode(int unitId, int idleMode, short options, int timeOut) {
		return this.Unit_setIdleMode(this.skirmishAIId, unitId, idleMode, options, timeOut);
	}
	private native int Unit_setIdleMode(int _skirmishAIId, int unitId, int idleMode, short options, int timeOut);

	@Override
	public int Group_setIdleMode(int groupId, int idleMode, short options, int timeOut) {
		return this.Group_setIdleMode(this.skirmishAIId, groupId, idleMode, options, timeOut);
	}
	private native int Group_setIdleMode(int _skirmishAIId, int groupId, int idleMode, short options, int timeOut);

	@Override
	public int Unit_executeCustomCommand(int unitId, int cmdId, float[] params, int params_size, short options, int timeOut) {
		return this.Unit_executeCustomCommand(this.skirmishAIId, unitId, cmdId, params, params_size, options, timeOut);
	}
	private native int Unit_executeCustomCommand(int _skirmishAIId, int unitId, int cmdId, float[] params, int params_size, short options, int timeOut);

	@Override
	public int Group_executeCustomCommand(int groupId, int cmdId, float[] params, int params_size, short options, int timeOut) {
		return this.Group_executeCustomCommand(this.skirmishAIId, groupId, cmdId, params, params_size, options, timeOut);
	}
	private native int Group_executeCustomCommand(int _skirmishAIId, int groupId, int cmdId, float[] params, int params_size, short options, int timeOut);

	@Override
	public int Map_Drawer_traceRay(float[] rayPos_posF3, float[] rayDir_posF3, float rayLen, int srcUnitId, int flags) {
		return this.Map_Drawer_traceRay(this.skirmishAIId, rayPos_posF3, rayDir_posF3, rayLen, srcUnitId, flags);
	}
	private native int Map_Drawer_traceRay(int _skirmishAIId, float[] rayPos_posF3, float[] rayDir_posF3, float rayLen, int srcUnitId, int flags);

	@Override
	public int Map_Drawer_traceRayFeature(float[] rayPos_posF3, float[] rayDir_posF3, float rayLen, int srcUnitId, int flags) {
		return this.Map_Drawer_traceRayFeature(this.skirmishAIId, rayPos_posF3, rayDir_posF3, rayLen, srcUnitId, flags);
	}
	private native int Map_Drawer_traceRayFeature(int _skirmishAIId, float[] rayPos_posF3, float[] rayDir_posF3, float rayLen, int srcUnitId, int flags);

	@Override
	public int Game_setPause(boolean enable, String reason) {
		return this.Game_setPause(this.skirmishAIId, enable, reason);
	}
	private native int Game_setPause(int _skirmishAIId, boolean enable, String reason);

	@Override
	public int Debug_GraphDrawer_setPosition(float x, float y) {
		return this.Debug_GraphDrawer_setPosition(this.skirmishAIId, x, y);
	}
	private native int Debug_GraphDrawer_setPosition(int _skirmishAIId, float x, float y);

	@Override
	public int Debug_GraphDrawer_setSize(float w, float h) {
		return this.Debug_GraphDrawer_setSize(this.skirmishAIId, w, h);
	}
	private native int Debug_GraphDrawer_setSize(int _skirmishAIId, float w, float h);

	@Override
	public int Debug_GraphDrawer_GraphLine_addPoint(int lineId, float x, float y) {
		return this.Debug_GraphDrawer_GraphLine_addPoint(this.skirmishAIId, lineId, x, y);
	}
	private native int Debug_GraphDrawer_GraphLine_addPoint(int _skirmishAIId, int lineId, float x, float y);

	@Override
	public int Debug_GraphDrawer_GraphLine_deletePoints(int lineId, int numPoints) {
		return this.Debug_GraphDrawer_GraphLine_deletePoints(this.skirmishAIId, lineId, numPoints);
	}
	private native int Debug_GraphDrawer_GraphLine_deletePoints(int _skirmishAIId, int lineId, int numPoints);

	@Override
	public int Debug_GraphDrawer_GraphLine_setColor(int lineId, short[] color_colorS3) {
		return this.Debug_GraphDrawer_GraphLine_setColor(this.skirmishAIId, lineId, color_colorS3);
	}
	private native int Debug_GraphDrawer_GraphLine_setColor(int _skirmishAIId, int lineId, short[] color_colorS3);

	@Override
	public int Debug_GraphDrawer_GraphLine_setLabel(int lineId, String label) {
		return this.Debug_GraphDrawer_GraphLine_setLabel(this.skirmishAIId, lineId, label);
	}
	private native int Debug_GraphDrawer_GraphLine_setLabel(int _skirmishAIId, int lineId, String label);

	@Override
	public int Debug_addOverlayTexture(float[] texData, int w, int h) {
		return this.Debug_addOverlayTexture(this.skirmishAIId, texData, w, h);
	}
	private native int Debug_addOverlayTexture(int _skirmishAIId, float[] texData, int w, int h);

	@Override
	public int Debug_OverlayTexture_update(int overlayTextureId, float[] texData, int x, int y, int w, int h) {
		return this.Debug_OverlayTexture_update(this.skirmishAIId, overlayTextureId, texData, x, y, w, h);
	}
	private native int Debug_OverlayTexture_update(int _skirmishAIId, int overlayTextureId, float[] texData, int x, int y, int w, int h);

	@Override
	public int Debug_OverlayTexture_remove(int overlayTextureId) {
		return this.Debug_OverlayTexture_remove(this.skirmishAIId, overlayTextureId);
	}
	private native int Debug_OverlayTexture_remove(int _skirmishAIId, int overlayTextureId);

	@Override
	public int Debug_OverlayTexture_setPosition(int overlayTextureId, float x, float y) {
		return this.Debug_OverlayTexture_setPosition(this.skirmishAIId, overlayTextureId, x, y);
	}
	private native int Debug_OverlayTexture_setPosition(int _skirmishAIId, int overlayTextureId, float x, float y);

	@Override
	public int Debug_OverlayTexture_setSize(int overlayTextureId, float w, float h) {
		return this.Debug_OverlayTexture_setSize(this.skirmishAIId, overlayTextureId, w, h);
	}
	private native int Debug_OverlayTexture_setSize(int _skirmishAIId, int overlayTextureId, float w, float h);

	@Override
	public int Debug_OverlayTexture_setLabel(int overlayTextureId, String label) {
		return this.Debug_OverlayTexture_setLabel(this.skirmishAIId, overlayTextureId, label);
	}
	private native int Debug_OverlayTexture_setLabel(int _skirmishAIId, int overlayTextureId, String label);

}

