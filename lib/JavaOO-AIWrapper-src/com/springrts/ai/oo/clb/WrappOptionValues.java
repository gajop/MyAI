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
public class WrappOptionValues extends AbstractOptionValues implements OptionValues {

	private AICallback innerCallback = null;

	public WrappOptionValues(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static OptionValues getInstance(AICallback innerCallback) {

		OptionValues _ret = null;
		_ret = new WrappOptionValues(innerCallback);
		return _ret;
	}


	/**
	 * Returns the number of option key-value pairs in the options map
	 * for this Skirmish AI.
	 */
	@Override
	public int getSize() {

		int _ret_int;

		_ret_int = innerCallback.SkirmishAI_OptionValues_getSize();
		return _ret_int;
	}

	/**
	 * Returns the key at index optionIndex in the options map
	 * for this Skirmish AI, or NULL if the optionIndex is invalid.
	 */
	@Override
	public String getKey(int optionIndex) {

		String _ret_int;

		_ret_int = innerCallback.SkirmishAI_OptionValues_getKey(optionIndex);
		return _ret_int;
	}

	/**
	 * Returns the value at index optionIndex in the options map
	 * for this Skirmish AI, or NULL if the optionIndex is invalid.
	 */
	@Override
	public String getValue(int optionIndex) {

		String _ret_int;

		_ret_int = innerCallback.SkirmishAI_OptionValues_getValue(optionIndex);
		return _ret_int;
	}

	/**
	 * Returns the value associated with the given key in the options map
	 * for this Skirmish AI, or NULL if not found.
	 */
	@Override
	public String getValueByKey(String key) {

		String _ret_int;

		_ret_int = innerCallback.SkirmishAI_OptionValues_getValueByKey(key);
		return _ret_int;
	}
}

