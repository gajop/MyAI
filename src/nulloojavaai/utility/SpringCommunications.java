/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nulloojavaai.utility;

import com.springrts.ai.AICommand;
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

    public SpringCommunications(OOAICallback clb) {
        this.clb = clb;
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

    public Logger getLogger(String topic) {
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
}
