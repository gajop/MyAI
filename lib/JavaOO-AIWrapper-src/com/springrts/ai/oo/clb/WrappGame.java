/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;
import com.springrts.ai.AICallback;
import com.springrts.ai.Util;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class WrappGame extends AbstractGame implements Game {

	private AICallback innerCallback = null;

	public WrappGame(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Game getInstance(AICallback innerCallback) {

		Game _ret = null;
		_ret = new WrappGame(innerCallback);
		return _ret;
	}


	/**
	 * Returns the current game time measured in frames (the
	 * simulation runs at 30 frames per second at normal speed)
	 * 
	 * This should not be used, as we get the frame from the SUpdateEvent.
	 * @deprecated
	 */
	@Override
	public int getCurrentFrame() {

		int _ret_int;

		_ret_int = innerCallback.Game_getCurrentFrame();
		return _ret_int;
	}

	@Override
	public int getAiInterfaceVersion() {

		int _ret_int;

		_ret_int = innerCallback.Game_getAiInterfaceVersion();
		return _ret_int;
	}

	@Override
	public int getMyTeam() {

		int _ret_int;

		_ret_int = innerCallback.Game_getMyTeam();
		return _ret_int;
	}

	@Override
	public int getMyAllyTeam() {

		int _ret_int;

		_ret_int = innerCallback.Game_getMyAllyTeam();
		return _ret_int;
	}

	@Override
	public int getPlayerTeam(int playerId) {

		int _ret_int;

		_ret_int = innerCallback.Game_getPlayerTeam(playerId);
		return _ret_int;
	}

	/**
	 * Returns the number of active teams participating
	 * in the currently running game.
	 * A return value of 6 for example, would mean that teams 0 till 5
	 * take part in the game.
	 */
	@Override
	public int getTeams() {

		int _ret_int;

		_ret_int = innerCallback.Game_getTeams();
		return _ret_int;
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

		String _ret_int;

		_ret_int = innerCallback.Game_getTeamSide(otherTeamId);
		return _ret_int;
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

		java.awt.Color _ret;

		short[] return_colorS3_out = new short[3];

		innerCallback.Game_getTeamColor(otherTeamId, return_colorS3_out);
		_ret = Util.toColor(return_colorS3_out);

		return _ret;
	}

	/**
	 * Returns the income multiplier of a team in the game.
	 * All the teams resource income is multiplied by this factor.
	 * The default value is 1.0f, the valid range is [0.0, FLOAT_MAX].
	 */
	@Override
	public float getTeamIncomeMultiplier(int otherTeamId) {

		float _ret_int;

		_ret_int = innerCallback.Game_getTeamIncomeMultiplier(otherTeamId);
		return _ret_int;
	}

	/**
	 * Returns the ally-team of a team
	 */
	@Override
	public int getTeamAllyTeam(int otherTeamId) {

		int _ret_int;

		_ret_int = innerCallback.Game_getTeamAllyTeam(otherTeamId);
		return _ret_int;
	}

	/**
	 * Returns the current level of a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return current level of the requested resource of the other team, or -1.0 on an invalid request
	 */
	@Override
	public float getTeamResourceCurrent(int otherTeamId, int resourceId) {

		float _ret_int;

		_ret_int = innerCallback.Game_getTeamResourceCurrent(otherTeamId, resourceId);
		return _ret_int;
	}

	/**
	 * Returns the current income of a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return current income of the requested resource of the other team, or -1.0 on an invalid request
	 */
	@Override
	public float getTeamResourceIncome(int otherTeamId, int resourceId) {

		float _ret_int;

		_ret_int = innerCallback.Game_getTeamResourceIncome(otherTeamId, resourceId);
		return _ret_int;
	}

	/**
	 * Returns the current usage of a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return current usage of the requested resource of the other team, or -1.0 on an invalid request
	 */
	@Override
	public float getTeamResourceUsage(int otherTeamId, int resourceId) {

		float _ret_int;

		_ret_int = innerCallback.Game_getTeamResourceUsage(otherTeamId, resourceId);
		return _ret_int;
	}

	/**
	 * Returns the storage capacity for a resource of another team.
	 * Allways works for allied teams.
	 * Works for all teams when cheating is enabled.
	 * @return storage capacity for the requested resource of the other team, or -1.0 on an invalid request
	 */
	@Override
	public float getTeamResourceStorage(int otherTeamId, int resourceId) {

		float _ret_int;

		_ret_int = innerCallback.Game_getTeamResourceStorage(otherTeamId, resourceId);
		return _ret_int;
	}

	/**
	 * Returns true, if the two supplied ally-teams are currently allied
	 */
	@Override
	public boolean isAllied(int firstAllyTeamId, int secondAllyTeamId) {

		boolean _ret_int;

		_ret_int = innerCallback.Game_isAllied(firstAllyTeamId, secondAllyTeamId);
		return _ret_int;
	}

	@Override
	public boolean isExceptionHandlingEnabled() {

		boolean _ret_int;

		_ret_int = innerCallback.Game_isExceptionHandlingEnabled();
		return _ret_int;
	}

	@Override
	public boolean isDebugModeEnabled() {

		boolean _ret_int;

		_ret_int = innerCallback.Game_isDebugModeEnabled();
		return _ret_int;
	}

	@Override
	public int getMode() {

		int _ret_int;

		_ret_int = innerCallback.Game_getMode();
		return _ret_int;
	}

	@Override
	public boolean isPaused() {

		boolean _ret_int;

		_ret_int = innerCallback.Game_isPaused();
		return _ret_int;
	}

	@Override
	public float getSpeedFactor() {

		float _ret_int;

		_ret_int = innerCallback.Game_getSpeedFactor();
		return _ret_int;
	}

	@Override
	public String getSetupScript() {

		String _ret_int;

		_ret_int = innerCallback.Game_getSetupScript();
		return _ret_int;
	}

	/**
	 * Returns the categories bit field value.
	 * @return the categories bit field value or 0,
	 *         in case of empty name or too many categories
	 * @see getCategoryName
	 */
	@Override
	public int getCategoryFlag(String categoryName) {

		int _ret_int;

		_ret_int = innerCallback.Game_getCategoryFlag(categoryName);
		return _ret_int;
	}

	/**
	 * Returns the bitfield values of a list of category names.
	 * @param categoryNames space delimited list of names
	 * @see Game#getCategoryFlag
	 */
	@Override
	public int getCategoriesFlag(String categoryNames) {

		int _ret_int;

		_ret_int = innerCallback.Game_getCategoriesFlag(categoryNames);
		return _ret_int;
	}

	/**
	 * Return the name of the category described by a category flag.
	 * @see Game#getCategoryFlag
	 */
	@Override
	public void getCategoryName(int categoryFlag, String name, int name_sizeMax) {

		innerCallback.Game_getCategoryName(categoryFlag, name, name_sizeMax);
	}

	/**
	 * Sends a chat/text message to other players.
	 * This text will also end up in infolog.txt.
	 */
	@Override
	public void sendTextMessage(String text, int zone) throws CallbackAIException {

		int _ret_int;

		_ret_int = innerCallback.Game_sendTextMessage(text, zone);
		if (_ret_int != 0) {
			throw new CallbackAIException("sendTextMessage", _ret_int);
		}

	}

	/**
	 * Assigns a map location to the last text message sent by the AI.
	 */
	@Override
	public void setLastMessagePosition(AIFloat3 pos) throws CallbackAIException {

		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();

		_ret_int = innerCallback.Game_setLastMessagePosition(pos_posF3);
		if (_ret_int != 0) {
			throw new CallbackAIException("setLastMessagePosition", _ret_int);
		}

	}

	/**
	 * @param pos_posF3  on this position, only x and z matter
	 */
	@Override
	public void sendStartPosition(boolean ready, AIFloat3 pos) throws CallbackAIException {

		int _ret_int;

		float[] pos_posF3 = pos.toFloatArray();

		_ret_int = innerCallback.Game_sendStartPosition(ready, pos_posF3);
		if (_ret_int != 0) {
			throw new CallbackAIException("sendStartPosition", _ret_int);
		}

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

		int _ret_int;

		_ret_int = innerCallback.Game_setPause(enable, reason);
		if (_ret_int != 0) {
			throw new CallbackAIException("setPause", _ret_int);
		}

	}
}

