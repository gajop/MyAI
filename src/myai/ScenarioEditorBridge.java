package myai;

import java.util.logging.Logger;

//import com.springrts.ai.command.CallLuaRulesAICommand;

import myai.utility.SpringCommunications;

public class ScenarioEditorBridge {
    SpringCommunications spring;
    Logger log;

    public ScenarioEditorBridge(SpringCommunications spring) {
        this.spring = spring;
        log = spring.getLogger("scenario-editor-bridge");
    }

	
	public void obtainMetaData() {		
		String msg = "scen_edit|meta";
//		spring.getClb().
		//spring.getClb().
	//	spring.handleEngineCommand(command);
		log.info("Obtaining meta data info...");
		//spring.getClb().
	}
}
