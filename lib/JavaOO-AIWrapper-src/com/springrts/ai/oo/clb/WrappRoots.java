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
public class WrappRoots extends AbstractRoots implements Roots {

	private AICallback innerCallback = null;

	public WrappRoots(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Roots getInstance(AICallback innerCallback) {

		Roots _ret = null;
		_ret = new WrappRoots(innerCallback);
		return _ret;
	}


	/**
	 * Returns the number of springs data dirs.
	 */
	@Override
	public int getSize() {

		int _ret_int;

		_ret_int = innerCallback.DataDirs_Roots_getSize();
		return _ret_int;
	}

	/**
	 * Returns the data dir at dirIndex, which is valid between 0 and (DataDirs_Roots_getSize() - 1).
	 */
	@Override
	public boolean getDir(String path, int path_sizeMax, int dirIndex) {

		boolean _ret_int;

		_ret_int = innerCallback.DataDirs_Roots_getDir(path, path_sizeMax, dirIndex);
		return _ret_int;
	}

	/**
	 * Returns an absolute path which consists of:
	 * data-dir + relative-path.
	 * 
	 * example:
	 * input:  "AI/Skirmish", writeable, create, dir
	 * output: "/home/userX/.spring/AI/Skirmish/"
	 * The path "/home/userX/.spring/AI/Skirmish/" is created,
	 * if it does not yet exist.
	 * 
	 * @see DataDirs_locatePath
	 * @param   path          store for the resulting absolute path
	 * @param   path_sizeMax  storage size of the above
	 * @param   relPath    the relative path to find
	 * @param   writeable  if true, only the writable data-dir is considered
	 * @param   create     if true, and realPath is not found, its dir structure
	 *                     is created recursively under the writable data-dir
	 * @param   dir        if true, realPath specifies a dir, which means if
	 *                     create is true, the whole path will be created,
	 *                     including the last part
	 * @return  whether the locating process was successfull
	 *          -> the path exists and is stored in an absolute form in path
	 */
	@Override
	public boolean locatePath(String path, int path_sizeMax, String relPath, boolean writeable, boolean create, boolean dir) {

		boolean _ret_int;

		_ret_int = innerCallback.DataDirs_Roots_locatePath(path, path_sizeMax, relPath, writeable, create, dir);
		return _ret_int;
	}

	@Override
	public String allocatePath(String relPath, boolean writeable, boolean create, boolean dir) {

		String _ret_int;

		_ret_int = innerCallback.DataDirs_Roots_allocatePath(relPath, writeable, create, dir);
		return _ret_int;
	}
}

