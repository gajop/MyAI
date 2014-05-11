/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubGame extends AbstractGame implements Game {

	/**
	 * Returns the current game time measured in frames (the
	 * simulation runs at 30 frames per second at normal speed)
	 * 
	 * This should not be used, as we get the frame from the SUpdateEvent.
	 * @deprecated
	 */
	public void setCurrentFrame(int currentFrame) {
		this.currentFrame = currentFrame;
	}
	private int currentFrame = 0;
	/** @deprecated */
	@Override
	public int getCurrentFrame() {
		return currentFrame;
	}

	public void setAiInterfaceVersion(int aiInterfaceVersion) {
		this.aiInterfaceVersion = aiInterfaceVersion;
	}
	private int aiInterfaceVersion = 0;
	@Override
	public int getAiInterfaceVersion() {
		return aiInterfaceVersion;
	}

	public void setMyTeam(int myTeam) {
		this.myTeam = myTeam;
	}
	private int myTeam = 0;
	@Override
	public int getMyTeam() {
		return myTeam;
	}

	public void setMyAllyTeam(int myAllyTeam) {
		this.myAllyTeam = myAllyTeam;
	}
	private int myAllyTeam = 0;
	@Override
	public int getMyAllyTeam() {
		return myAllyTeam;
	}

	@Override
	public int getPlayerTeam(int playerId) {
		return 0;
	}

	/**
	 * Returns the number of active teams participating
	 * in the currently running game.
	 * A return value of 6 for example, would mean that teams 0 till 5
	 * take part in the game.
	 */
	public void setTeams(int teams) {
		this.teams = teams;
	}
	private int teams = 0;
	@Override
	public int getTeams() {
		return teams;
	}

	/**
	 * Returns the name of the side of a team in the game.
	 * 
	 * This should not be used, as it may be "",
	 * and as the AI should rather rely on the units it has,
	 * which will lead to a more stable and versatile AI.
	 * @deprecated
	 * 
	 * @return eg. "ARM" or "CORE"; may be "", depending on how the game was setup
	 */
	@Override
	public String getTeamSide(int otherTeamId) {
		return "";
	}

	/**
	 * Returns the color of a team in the game.
	 * 
	 * This should only be used when drawing stuff,
	 * and not for team-identification.
	 * @return the RGB color of a team, with values in [0, 255]
	 */
	@Override
	public java.awt.Color getTeamColor(int otherTeamId) {
		return null;
	}

	/**
	 * Returns the income multiplier of a team in the game.
	 * All the teams resource income is multiplied by this factor.
	 * The default value is 1.0f, the valid range is [0.0, FLOAT_MAX].
	 */
	@Override
	public float getTeamIncomeMultiplier(int otherTeamId) {
		return 0;
	}

	/**
	 * Returns the ally-team of a team
	 */
	@Override
	public int getTeamAllyTeam(int otherTeamId) {
		return 0;
	}

	/**
	 * Returns the current level of a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return current level of the requested resource of the other team, or -1.0 on an invalid request
	 */
	@Override
	public float getTeamResourceCurrent(int otherTeamId, int resourceId) {
		return 0;
	}

	/**
	 * Returns the current income of a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return current income of the requested resource of the other team, or -1.0 on an invalid request
	 */
	@Override
	public float getTeamResourceIncome(int otherTeamId, int resourceId) {
		return 0;
	}

	/**
	 * Returns the current usage of a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return current usage of the requested resource of the other team, or -1.0 on an invalid request
	 */
	@Override
	public float getTeamResourceUsage(int otherTeamId, int resourceId) {
		return 0;
	}

	/**
	 * Returns the storage capacity for a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return storage capacity for the requested resource of the other team, or -1.0 on an invalid request
	 */
	@Override
	public float getTeamResourceStorage(int otherTeamId, int resourceId) {
		return 0;
	}

	/**
	 * Returns true, if the two supplied ally-teams are currently allied
	 */
	@Override
	public boolean isAllied(int firstAllyTeamId, int secondAllyTeamId) {
		return false;
	}

	public void setExceptionHandlingEnabled(boolean isExceptionHandlingEnabled) {
		this.isExceptionHandlingEnabled = isExceptionHandlingEnabled;
	}
	private boolean isExceptionHandlingEnabled = false;
	@Override
	public boolean isExceptionHandlingEnabled() {
		return isExceptionHandlingEnabled;
	}

	public void setDebugModeEnabled(boolean isDebugModeEnabled) {
		this.isDebugModeEnabled = isDebugModeEnabled;
	}
	private boolean isDebugModeEnabled = false;
	@Override
	public boolean isDebugModeEnabled() {
		return isDebugModeEnabled;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}
	private int mode = 0;
	@Override
	public int getMode() {
		return mode;
	}

	public void setPaused(boolean isPaused) {
		this.isPaused = isPaused;
	}
	private boolean isPaused = false;
	@Override
	public boolean isPaused() {
		return isPaused;
	}

	public void setSpeedFactor(float speedFactor) {
		this.speedFactor = speedFactor;
	}
	private float speedFactor = 0;
	@Override
	public float getSpeedFactor() {
		return speedFactor;
	}

	public void setSetupScript(String setupScript) {
		this.setupScript = setupScript;
	}
	private String setupScript = "";
	@Override
	public String getSetupScript() {
		return setupScript;
	}

	/**
	 * Returns the categories bit field value.
	 * @return the categories bit field value or 0,
	 *         in case of empty name or too many categories
	 * @see getCategoryName
	 */
	@Override
	public int getCategoryFlag(String categoryName) {
		return 0;
	}

	/**
	 * Returns the bitfield values of a list of category names.
	 * @param categoryNames space delimited list of names
	 * @see Game#getCategoryFlag
	 */
	@Override
	public int getCategoriesFlag(String categoryNames) {
		return 0;
	}

	/**
	 * Return the name of the category described by a category flag.
	 * @see Game#getCategoryFlag
	 */
	@Override
	public void getCategoryName(int categoryFlag, String name, int name_sizeMax) {
	}

	/**
	 * Sends a chat/text message to other players.
	 * This text will also end up in infolog.txt.
	 */
	@Override
	public void sendTextMessage(String text, int zone) throws CallbackAIException {
	}

	/**
	 * Assigns a map location to the last text message sent by the AI.
	 */
	@Override
	public void setLastMessagePosition(AIFloat3 pos) throws CallbackAIException {
	}

	/**
	 * @param pos_posF3  on this position, only x and z matter
	 */
	@Override
	public void sendStartPosition(boolean ready, AIFloat3 pos) throws CallbackAIException {
	}

	/**
	 * Pause or unpauses the game.
	 * This is meant for debugging purposes.
	 * Keep in mind that pause does not happen immediately.
	 * It can take 1-2 frames in single- and up to 10 frames in multiplayer matches.
	 * @param reason  reason for the (un-)pause, or NULL
	 */
	@Override
	public void setPause(boolean enable, String reason) throws CallbackAIException {
	}

}

