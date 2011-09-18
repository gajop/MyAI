/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package myai.utility;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

import myai.NullOOJavaAIFactory;
/**
 *
 * @author gajop
 */
public class SpringLogger {
    private static class MyCustomLogFormatter extends Formatter {

        private DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        public String format(LogRecord record) {

// Create a StringBuffer to contain the formatted record
// start with the date.
            StringBuffer sb = new StringBuffer();

// Get the date from the LogRecord and add it to the buffer
            Date date = new Date(record.getMillis());
            sb.append(dateFormat.format(date));
            sb.append(" ");

// Get the level name and add it to the buffer.
            sb.append(record.getLevel().getName());
            sb.append(": ");

// Get the formatted message (includes localization
// and substitution of paramters) and add it to the buffer
            sb.append(formatMessage(record));
            sb.append("\n");

            return sb.toString();
        }
    }

    SpringLogger(String topic, String path) {
        this.topic = topic;
        FileHandler fileLogger;
        try {
            fileLogger = new FileHandler(path, false);
            fileLogger.setFormatter(new MyCustomLogFormatter());
            fileLogger.setLevel(Level.ALL);
            log = Logger.getLogger(path); //shared statics are messy, this is unique at least
            log.addHandler(fileLogger);
            if (NullOOJavaAIFactory.isDebugging()) {
                log.setLevel(Level.ALL);
            } else {
                log.setLevel(Level.INFO);
            }
        } catch (IOException ex) {
            Logger.getLogger(SpringCommunications.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(SpringCommunications.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getTopic() {
        return topic;
    }

    public Logger getLog() {
        return log;
    }

    private Logger log;
    String topic;
}
