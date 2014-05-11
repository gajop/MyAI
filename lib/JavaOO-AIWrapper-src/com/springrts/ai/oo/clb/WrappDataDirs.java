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
public class WrappDataDirs extends AbstractDataDirs implements DataDirs {

	private AICallback innerCallback = null;

	public WrappDataDirs(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static DataDirs getInstance(AICallback innerCallback) {

		DataDirs _ret = null;
		_ret = new WrappDataDirs(innerCallback);
		return _ret;
	}


	/**
	 * Returns '/' on posix and '\\' on windows
	 */
	@Override
	public char getPathSeparator() {

		char _ret_int;

		_ret_int = innerCallback.DataDirs_getPathSeparator();
		return _ret_int;
	}

	/**
	 * This interfaces main data dir, which is where the shared library
	 * and the InterfaceInfo.lua file are located, e.g.:
	 * /usr/share/games/spring/AI/Skirmish/RAI/0.601/
	 */
	@Override
	public String getConfigDir() {

		String _ret_int;

		_ret_int = innerCallback.DataDirs_getConfigDir();
		return _ret_int;
	}

	/**
	 * This interfaces writable data dir, which is where eg logs, caches
	 * and learning data should be stored, e.g.:
	 * /home/userX/.spring/AI/Skirmish/RAI/0.601/
	 */
	@Override
	public String getWriteableDir() {

		String _ret_int;

		_ret_int = innerCallback.DataDirs_getWriteableDir();
		return _ret_int;
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

		boolean _ret_int;

		_ret_int = innerCallback.DataDirs_locatePath(path, path_sizeMax, relPath, writeable, create, dir, common);
		return _ret_int;
	}

	/**
	 * @see     locatePath()
	 */
	@Override
	public String allocatePath(String relPath, boolean writeable, boolean create, boolean dir, boolean common) {

		String _ret_int;

		_ret_int = innerCallback.DataDirs_allocatePath(relPath, writeable, create, dir, common);
		return _ret_int;
	}

	@Override
	public Roots getRoots() {

		Roots _ret_int_out;

		_ret_int_out = WrappRoots.getInstance(innerCallback);

		return _ret_int_out;
	}
}

