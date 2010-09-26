package nulloojavaai.buildmanager.buildplanner;

import java.util.logging.Logger;

import nulloojavaai.utility.SpringCommunications;

public class BuildPlanner {
	SpringCommunications spring;
	Logger log;
	
	public BuildPlanner(SpringCommunications spring) {
		super();
		this.spring = spring;
		this.log = spring.getLogger("build-planner");
	}

	
}
