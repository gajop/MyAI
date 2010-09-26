/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.utility;

import com.springrts.ai.AICommand;
import com.springrts.ai.AIFloat3;
import com.springrts.ai.command.CreateLineFigureDrawerAICommand;
import com.springrts.ai.command.SendTextMessageAICommand;
import com.springrts.ai.oo.OOAICallback;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author gajop
 */
public class SpringCommunications {
    private OOAICallback clb;
    private final int DEFAULT_ZONE = 0;
    private List<SpringLogger> loggers = new LinkedList<SpringLogger>();
    Logger errorLogger;
    boolean errorReported = false;
    static final String AIName = "MyUnnamedAI";

    public SpringCommunications(OOAICallback clb) {
        this.clb = clb;
        errorLogger = createLogger("error");
    }
    /*
     * Should only be used if an error has been detected with the AI.
     * To report other errors, use custom loggers from @see getLogger
     */
    public void logError(String error) {
    	errorLogger.severe(error);
    	if (!errorReported) {
    		errorReported = true;
    		sendTextMsg("Something bad has happened with : " + AIName + 
    				"! Please report it, and include infolog.txt from your " + 
    				"Spring installation directory in Windows or from ~/.spring/" +     				
    				" in linux. Also include all files from AI/Skirmish/" + AIName + 
    				" from your Spring installation directory in Windows or ~/.spring in linux");
    	}
    }

    public OOAICallback getClb() {
        return clb;
    }

    public void setClb(OOAICallback clb) {
        this.clb = clb;
    }

    public int handleEngineCommand(AICommand command) {
        return clb.getEngine().handleCommand(
                com.springrts.ai.AICommandWrapper.COMMAND_TO_ID_ENGINE,
                -1, command);
    }

    public int sendTextMsg(String msg) {
        SendTextMessageAICommand msgCmd = new SendTextMessageAICommand(msg,
                DEFAULT_ZONE);
        return handleEngineCommand(msgCmd);
    }

    private Logger createLogger(String topic) {
        for (SpringLogger logger : loggers) {
            if (logger.getTopic().equals(topic)) {
                return logger.getLog();
            }
        }
        String path = clb.getDataDirs().allocatePath("log-team-" +
                clb.getTeamId() + "/" + topic + ".txt", true, true, false, false);
        SpringLogger newLogger = new SpringLogger(topic, path);
        loggers.add(newLogger);
        return newLogger.getLog();
    }
    
    public Logger getLogger(String topic) {
    	if (topic.equals("error")) {
    		return null;
    	}
    	return createLogger(topic);
    }

    public void drawLine(AIFloat3 begin, AIFloat3 end) {
        AICommand drawCommand = new CreateLineFigureDrawerAICommand(begin,
                            end, 10, false, 42, 0, 42);
        handleEngineCommand(drawCommand);
    }
}
