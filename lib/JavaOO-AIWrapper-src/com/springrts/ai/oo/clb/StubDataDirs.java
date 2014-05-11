/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubDataDirs extends AbstractDataDirs implements DataDirs {

	/**
	 * Returns '/' on posix and '\\' on windows
	 */
	public void setPathSeparator(char pathSeparator) {
		this.pathSeparator = pathSeparator;
	}
	private char pathSeparator = 0;
	@Override
	public char getPathSeparator() {
		return pathSeparator;
	}

	/**
	 * This interfaces main data dir, which is where the shared library
	 * and the InterfaceInfo.lua file are located, e.g.:
	 * /usr/share/games/spring/AI/Skirmish/RAI/0.601/
	 */
	public void setConfigDir(String configDir) {
		this.configDir = configDir;
	}
	private String configDir = "";
	@Override
	public String getConfigDir() {
		return configDir;
	}

	/**
	 * This interfaces writable data dir, which is where eg logs, caches
	 * and learning data should be stored, e.g.:
	 * /home/userX/.spring/AI/Skirmish/RAI/0.601/
	 */
	public void setWriteableDir(String writeableDir) {
		this.writeableDir = writeableDir;
	}
	private String writeableDir = "";
	@Override
	public String getWriteableDir() {
		return writeableDir;
	}

	/**
	 * Returns an absolute path which consists of:
	 * data-dir + Skirmish-AI-path + relative-path.
	 * 
	 * example:
	 * input:  "log/main.log", writeable, create, !dir, !common
	 * output: "/home/userX/.spring/AI/Skirmish/RAI/0.601/log/main.log"
	 * The path "/home/userX/.spring/AI/Skirmish/RAI/0.601/log/" is created,
	 * if it does not yet exist.
	 * 
	 * @see DataDirs_Roots_locatePath
	 * @param   path          store for the resulting absolute path
	 * @param   path_sizeMax  storage size of the above
	 * @param   writeable  if true, only the writable data-dir is considered
	 * @param   create     if true, and realPath is not found, its dir structure
	 *                     is created recursively under the writable data-dir
	 * @param   dir        if true, realPath specifies a dir, which means if
	 *                     create is true, the whole path will be created,
	 *                     including the last part
	 * @param   common     if true, the version independent data-dir is formed,
	 *                     which uses "common" instead of the version, eg:
	 *                     "/home/userX/.spring/AI/Skirmish/RAI/common/..."
	 * @return  whether the locating process was successfull
	 *          -> the path exists and is stored in an absolute form in path
	 */
	@Override
	public boolean locatePath(String path, int path_sizeMax, String relPath, boolean writeable, boolean create, boolean dir, boolean common) {
		return false;
	}

	/**
	 * @see     locatePath()
	 */
	@Override
	public String allocatePath(String relPath, boolean writeable, boolean create, boolean dir, boolean common) {
		return "";
	}

	public void setRoots(Roots roots) {
		this.roots = roots;
	}
	private Roots roots = null;
	@Override
	public Roots getRoots() {
		return roots;
	}

}

