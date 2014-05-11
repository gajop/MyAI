/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubInfo extends AbstractInfo implements Info {

	/**
	 * Returns the number of info key-value pairs in the info map
	 * for this Skirmish AI.
	 */
	public void setSize(int size) {
		this.size = size;
	}
	private int size = 0;
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * Returns the key at index infoIndex in the info map
	 * for this Skirmish AI, or NULL if the infoIndex is invalid.
	 */
	@Override
	public String getKey(int infoIndex) {
		return "";
	}

	/**
	 * Returns the value at index infoIndex in the info map
	 * for this Skirmish AI, or NULL if the infoIndex is invalid.
	 */
	@Override
	public String getValue(int infoIndex) {
		return "";
	}

	/**
	 * Returns the description of the key at index infoIndex in the info map
	 * for this Skirmish AI, or NULL if the infoIndex is invalid.
	 */
	@Override
	public String getDescription(int infoIndex) {
		return "";
	}

	/**
	 * Returns the value associated with the given key in the info map
	 * for this Skirmish AI, or NULL if not found.
	 */
	@Override
	public String getValueByKey(String key) {
		return "";
	}

}

