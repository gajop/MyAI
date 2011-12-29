/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.utility;

//import com.springrts.ai.oo.clb.AICommand;
import com.springrts.ai.oo.AIFloat3;
//import com.springrts.ai.oo.clb.CreateLineFigureDrawerAICommand;
//import com.springrts.ai.command.SendTextMessageAICommand;
import com.springrts.ai.oo.clb.OOAICallback;
import com.springrts.ai.oo.clb.StubFigure;

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
    final String errorReport = "Something bad has happened with : " + AIName + 
		"! Please report it, and include infolog.txt from your " + 
		"Spring installation directory in Windows or from ~/.spring/" +     				
		" in linux. Also include all files from AI/Skirmish/" + AIName + 
		" from your Spring installation directory in Windows or ~/.spring in linux";

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
    		sendTextMsg(errorReport);
    	}
    }

    public OOAICallback getClb() {
        return clb;
    }

    public void setClb(OOAICallback clb) {
        this.clb = clb;
    }

    public void sendTextMsg(String msg) {
    	clb.getGame().sendTextMessage(msg, DEFAULT_ZONE);
    }

    private Logger createLogger(String topic) {
        for (SpringLogger logger : loggers) {
            if (logger.getTopic().equals(topic)) {
                return logger.getLog();
            }
        }        
        String path = clb.getDataDirs().allocatePath("log-team-" +
                clb.getGame().getMyTeam() + "/" + topic + ".txt", true, true, false, false);
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
    	StubFigure fig = new StubFigure();
    	fig.drawLine(begin, end, 10, false, 100, 42);
    }
	public void update(int frame) { 
		if (errorReported && frame == 1000) { //retransmits the error report a bit later in the game, since early error reports might be missed
			sendTextMsg(errorReport);
		}
	}
}
