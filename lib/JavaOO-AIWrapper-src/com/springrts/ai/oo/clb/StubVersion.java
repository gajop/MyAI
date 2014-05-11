/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubVersion extends AbstractVersion implements Version {

	/**
	 * Returns the major engine revision number (e.g. 83)
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	private String major = "";
	@Override
	public String getMajor() {
		return major;
	}

	/**
	 * Minor version number (e.g. "5")
	 * @deprecated since 4. October 2011 (pre release 83), will always return "0"
	 */
	public void setMinor(String minor) {
		this.minor = minor;
	}
	private String minor = "";
	/** @deprecated */
	@Override
	public String getMinor() {
		return minor;
	}

	/**
	 * Clients that only differ in patchset can still play together.
	 * Also demos should be compatible between patchsets.
	 */
	public void setPatchset(String patchset) {
		this.patchset = patchset;
	}
	private String patchset = "";
	@Override
	public String getPatchset() {
		return patchset;
	}

	/**
	 * SCM Commits version part (e.g. "" or "13")
	 * Number of commits since the last version tag.
	 * This matches the regex "[0-9]*".
	 */
	public void setCommits(String commits) {
		this.commits = commits;
	}
	private String commits = "";
	@Override
	public String getCommits() {
		return commits;
	}

	/**
	 * SCM unique identifier for the current commit.
	 * This matches the regex "([0-9a-f]{6})?".
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}
	private String hash = "";
	@Override
	public String getHash() {
		return hash;
	}

	/**
	 * SCM branch name (e.g. "master" or "develop")
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	private String branch = "";
	@Override
	public String getBranch() {
		return branch;
	}

	/**
	 * Additional information (compiler flags, svn revision etc.)
	 */
	public void setAdditional(String additional) {
		this.additional = additional;
	}
	private String additional = "";
	@Override
	public String getAdditional() {
		return additional;
	}

	/**
	 * time of build
	 */
	public void setBuildTime(String buildTime) {
		this.buildTime = buildTime;
	}
	private String buildTime = "";
	@Override
	public String getBuildTime() {
		return buildTime;
	}

	/**
	 * Returns whether this is a release build of the engine
	 */
	public void setRelease(boolean isRelease) {
		this.isRelease = isRelease;
	}
	private boolean isRelease = false;
	@Override
	public boolean isRelease() {
		return isRelease;
	}

	/**
	 * The basic part of a spring version.
	 * This may only be used for sync-checking if IsRelease() returns true.
	 * @return "Major.PatchSet" or "Major.PatchSet.1"
	 */
	public void setNormal(String normal) {
		this.normal = normal;
	}
	private String normal = "";
	@Override
	public String getNormal() {
		return normal;
	}

	/**
	 * The sync relevant part of a spring version.
	 * This may be used for sync-checking through a simple string-equality test.
	 * @return "Major" or "Major.PatchSet.1-Commits-gHash Branch"
	 */
	public void setSync(String sync) {
		this.sync = sync;
	}
	private String sync = "";
	@Override
	public String getSync() {
		return sync;
	}

	/**
	 * The verbose, human readable version.
	 * @return "Major.Patchset[.1-Commits-gHash Branch] (Additional)"
	 */
	public void setFull(String full) {
		this.full = full;
	}
	private String full = "";
	@Override
	public String getFull() {
		return full;
	}

}

