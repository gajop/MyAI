/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface Game extends Comparable<Game> {

	/**
	 * Returns the current game time measured in frames (the
	 * simulation runs at 30 frames per second at normal speed)
	 * 
	 * This should not be used, as we get the frame from the SUpdateEvent.
	 * @deprecated
	 */
	public int getCurrentFrame();

	public int getAiInterfaceVersion();

	public int getMyTeam();

	public int getMyAllyTeam();

	public int getPlayerTeam(int playerId);

	/**
	 * Returns the number of active teams participating
	 * in the currently running game.
	 * A return value of 6 for example, would mean that teams 0 till 5
	 * take part in the game.
	 */
	public int getTeams();

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
	public String getTeamSide(int otherTeamId);

	/**
	 * Returns the color of a team in the game.
	 * 
	 * This should only be used when drawing stuff,
	 * and not for team-identification.
	 * @return the RGB color of a team, with values in [0, 255]
	 */
	public java.awt.Color getTeamColor(int otherTeamId);

	/**
	 * Returns the income multiplier of a team in the game.
	 * All the teams resource income is multiplied by this factor.
	 * The default value is 1.0f, the valid range is [0.0, FLOAT_MAX].
	 */
	public float getTeamIncomeMultiplier(int otherTeamId);

	/**
	 * Returns the ally-team of a team
	 */
	public int getTeamAllyTeam(int otherTeamId);

	/**
	 * Returns the current level of a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return current level of the requested resource of the other team, or -1.0 on an invalid request
	 */
	public float getTeamResourceCurrent(int otherTeamId, int resourceId);

	/**
	 * Returns the current income of a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return current income of the requested resource of the other team, or -1.0 on an invalid request
	 */
	public float getTeamResourceIncome(int otherTeamId, int resourceId);

	/**
	 * Returns the current usage of a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return current usage of the requested resource of the other team, or -1.0 on an invalid request
	 */
	public float getTeamResourceUsage(int otherTeamId, int resourceId);

	/**
	 * Returns the storage capacity for a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return storage capacity for the requested resource of the other team, or -1.0 on an invalid request
	 */
	public float getTeamResourceStorage(int otherTeamId, int resourceId);

	/**
	 * Returns true, if the two supplied ally-teams are currently allied
	 */
	public boolean isAllied(int firstAllyTeamId, int secondAllyTeamId);

	public boolean isExceptionHandlingEnabled();

	public boolean isDebugModeEnabled();

	public int getMode();

	public boolean isPaused();

	public float getSpeedFactor();

	public String getSetupScript();

	/**
	 * Returns the categories bit field value.
	 * @return the categories bit field value or 0,
	 *         in case of empty name or too many categories
	 * @see getCategoryName
	 */
	public int getCategoryFlag(String categoryName);

	/**
	 * Returns the bitfield values of a list of category names.
	 * @param categoryNames space delimited list of names
	 * @see Game#getCategoryFlag
	 */
	public int getCategoriesFlag(String categoryNames);

	/**
	 * Return the name of the category described by a category flag.
	 * @see Game#getCategoryFlag
	 */
	public void getCategoryName(int categoryFlag, String name, int name_sizeMax);

	/**
	 * Sends a chat/text message to other players.
	 * This text will also end up in infolog.txt.
	 */
	public void sendTextMessage(String text, int zone) throws CallbackAIException;

	/**
	 * Assigns a map location to the last text message sent by the AI.
	 */
	public void setLastMessagePosition(AIFloat3 pos) throws CallbackAIException;

	/**
	 * @param pos_posF3  on this position, only x and z matter
	 */
	public void sendStartPosition(boolean ready, AIFloat3 pos) throws CallbackAIException;

	/**
	 * Pause or unpauses the game.
	 * This is meant for debugging purposes.
	 * Keep in mind that pause does not happen immediately.
	 * It can take 1-2 frames in single- and up to 10 frames in multiplayer matches.
	 * @param reason  reason for the (un-)pause, or NULL
	 */
	public void setPause(boolean enable, String reason) throws CallbackAIException;

}

