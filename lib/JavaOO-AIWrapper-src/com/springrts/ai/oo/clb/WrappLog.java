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
public class WrappLog extends AbstractLog implements Log {

	private AICallback innerCallback = null;

	public WrappLog(AICallback innerCallback) {

		this.innerCallback = innerCallback;
	}

	public static Log getInstance(AICallback innerCallback) {

		Log _ret = null;
		_ret = new WrappLog(innerCallback);
		return _ret;
	}


	/**
	 * This will end up in infolog
	 */
	@Override
	public void log(String msg) {

		innerCallback.Log_log(msg);
	}

	/**
	 * Inform the engine of an error that happend in the interface.
	 * @param   msg       error message
	 * @param   severety  from 10 for minor to 0 for fatal
	 * @param   die       if this is set to true, the engine assumes
	 *                    the interface is in an irreparable state, and it will
	 *                    unload it immediately.
	 */
	@Override
	public void exception(String msg, int severety, boolean die) {

		innerCallback.Log_exception(msg, severety, die);
	}
}

