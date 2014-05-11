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
public class WrappInfo extends AbstractInfo implements Info {

	private AICallback innerCallback = null;

	public WrappInfo(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Info getInstance(AICallback innerCallback) {

		Info _ret = null;
		_ret = new WrappInfo(innerCallback);
		return _ret;
	}


	/**
	 * Returns the number of info key-value pairs in the info map
	 * for this Skirmish AI.
	 */
	@Override
	public int getSize() {

		int _ret_int;

		_ret_int = innerCallback.SkirmishAI_Info_getSize();
		return _ret_int;
	}

	/**
	 * Returns the key at index infoIndex in the info map
	 * for this Skirmish AI, or NULL if the infoIndex is invalid.
	 */
	@Override
	public String getKey(int infoIndex) {

		String _ret_int;

		_ret_int = innerCallback.SkirmishAI_Info_getKey(infoIndex);
		return _ret_int;
	}

	/**
	 * Returns the value at index infoIndex in the info map
	 * for this Skirmish AI, or NULL if the infoIndex is invalid.
	 */
	@Override
	public String getValue(int infoIndex) {

		String _ret_int;

		_ret_int = innerCallback.SkirmishAI_Info_getValue(infoIndex);
		return _ret_int;
	}

	/**
	 * Returns the description of the key at index infoIndex in the info map
	 * for this Skirmish AI, or NULL if the infoIndex is invalid.
	 */
	@Override
	public String getDescription(int infoIndex) {

		String _ret_int;

		_ret_int = innerCallback.SkirmishAI_Info_getDescription(infoIndex);
		return _ret_int;
	}

	/**
	 * Returns the value associated with the given key in the info map
	 * for this Skirmish AI, or NULL if not found.
	 */
	@Override
	public String getValueByKey(String key) {

		String _ret_int;

		_ret_int = innerCallback.SkirmishAI_Info_getValueByKey(key);
		return _ret_int;
	}
}

