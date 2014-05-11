/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubGraphDrawer extends AbstractGraphDrawer implements GraphDrawer {

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	private boolean isEnabled = false;
	@Override
	public boolean isEnabled() {
		return isEnabled;
	}

	@Override
	public void setPosition(float x, float y) throws CallbackAIException {
	}

	@Override
	public void setSize(float w, float h) throws CallbackAIException {
	}

	public void setGraphLine(GraphLine graphLine) {
		this.graphLine = graphLine;
	}
	private GraphLine graphLine = null;
	@Override
	public GraphLine getGraphLine() {
		return graphLine;
	}

}

