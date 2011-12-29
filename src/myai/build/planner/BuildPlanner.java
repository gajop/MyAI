package myai.build.planner;

import java.util.logging.Logger;

import myai.utility.SpringCommunications;

public class BuildPlanner {
	SpringCommunications spring;
	Logger log;
	
	public BuildPlanner(SpringCommunications spring) {
		super();
		this.spring = spring;
		this.log = spring.getLogger("build-planner");
	}

	
}
