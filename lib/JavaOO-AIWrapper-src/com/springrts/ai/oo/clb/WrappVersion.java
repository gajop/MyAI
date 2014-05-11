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
public class WrappVersion extends AbstractVersion implements Version {

	private AICallback innerCallback = null;

	public WrappVersion(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Version getInstance(AICallback innerCallback) {

		Version _ret = null;
		_ret = new WrappVersion(innerCallback);
		return _ret;
	}


	/**
	 * Returns the major engine revision number (e.g. 83)
	 */
	@Override
	public String getMajor() {

		String _ret_int;

		_ret_int = innerCallback.Engine_Version_getMajor();
		return _ret_int;
	}

	/**
	 * Minor version number (e.g. "5")
	 * @deprecated since 4. October 2011 (pre release 83), will always return "0"
	 */
	@Override
	public String getMinor() {

		String _ret_int;

		_ret_int = innerCallback.Engine_Version_getMinor();
		return _ret_int;
	}

	/**
	 * Clients that only differ in patchset can still play together.
	 * Also demos should be compatible between patchsets.
	 */
	@Override
	public String getPatchset() {

		String _ret_int;

		_ret_int = innerCallback.Engine_Version_getPatchset();
		return _ret_int;
	}

	/**
	 * SCM Commits version part (e.g. "" or "13")
	 * Number of commits since the last version tag.
	 * This matches the regex "[0-9]*".
	 */
	@Override
	public String getCommits() {

		String _ret_int;

		_ret_int = innerCallback.Engine_Version_getCommits();
		return _ret_int;
	}

	/**
	 * SCM unique identifier for the current commit.
	 * This matches the regex "([0-9a-f]{6})?".
	 */
	@Override
	public String getHash() {

		String _ret_int;

		_ret_int = innerCallback.Engine_Version_getHash();
		return _ret_int;
	}

	/**
	 * SCM branch name (e.g. "master" or "develop")
	 */
	@Override
	public String getBranch() {

		String _ret_int;

		_ret_int = innerCallback.Engine_Version_getBranch();
		return _ret_int;
	}

	/**
	 * Additional information (compiler flags, svn revision etc.)
	 */
	@Override
	public String getAdditional() {

		String _ret_int;

		_ret_int = innerCallback.Engine_Version_getAdditional();
		return _ret_int;
	}

	/**
	 * time of build
	 */
	@Override
	public String getBuildTime() {

		String _ret_int;

		_ret_int = innerCallback.Engine_Version_getBuildTime();
		return _ret_int;
	}

	/**
	 * Returns whether this is a release build of the engine
	 */
	@Override
	public boolean isRelease() {

		boolean _ret_int;

		_ret_int = innerCallback.Engine_Version_isRelease();
		return _ret_int;
	}

	/**
	 * The basic part of a spring version.
	 * This may only be used for sync-checking if IsRelease() returns true.
	 * @return "Major.PatchSet" or "Major.PatchSet.1"
	 */
	@Override
	public String getNormal() {

		String _ret_int;

		_ret_int = innerCallback.Engine_Version_getNormal();
		return _ret_int;
	}

	/**
	 * The sync relevant part of a spring version.
	 * This may be used for sync-checking through a simple string-equality test.
	 * @return "Major" or "Major.PatchSet.1-Commits-gHash Branch"
	 */
	@Override
	public String getSync() {

		String _ret_int;

		_ret_int = innerCallback.Engine_Version_getSync();
		return _ret_int;
	}

	/**
	 * The verbose, human readable version.
	 * @return "Major.Patchset[.1-Commits-gHash Branch] (Additional)"
	 */
	@Override
	public String getFull() {

		String _ret_int;

		_ret_int = innerCallback.Engine_Version_getFull();
		return _ret_int;
	}
}

