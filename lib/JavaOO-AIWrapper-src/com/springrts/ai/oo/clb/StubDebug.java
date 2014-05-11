/* This file is part of the Spring engine (GPL v2 or later), see LICENSE.html */

/* Note: This file is machine generated, do not edit directly! */

package com.springrts.ai.oo.clb;


import com.springrts.ai.oo.CallbackAIException;
import com.springrts.ai.oo.AIFloat3;

/**
 * @author	AWK wrapper script
 * @version	GENERATED
 */
public class StubDebug extends AbstractDebug implements Debug {

	@Override
	public int addOverlayTexture(float[] texData, int w, int h) {
		return 0;
	}

	public void setGraphDrawer(GraphDrawer graphDrawer) {
		this.graphDrawer = graphDrawer;
	}
	private GraphDrawer graphDrawer = null;
	@Override
	public GraphDrawer getGraphDrawer() {
		return graphDrawer;
	}

}

