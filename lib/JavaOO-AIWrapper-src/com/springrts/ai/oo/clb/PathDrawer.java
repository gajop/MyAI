/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public interface PathDrawer extends Comparable<PathDrawer> {

	public void start(AIFloat3 pos, java.awt.Color color, short alpha) throws CallbackAIException;

	public void finish(boolean iAmUseless) throws CallbackAIException;

	public void drawLine(AIFloat3 endPos, java.awt.Color color, short alpha) throws CallbackAIException;

	public void drawLineAndCommandIcon(Command cmd, AIFloat3 endPos, java.awt.Color color, short alpha) throws CallbackAIException;

	public void drawIcon(Command cmd) throws CallbackAIException;

	public void suspend(AIFloat3 endPos, java.awt.Color color, short alpha) throws CallbackAIException;

	public void restart(boolean sameColor) throws CallbackAIException;

}

