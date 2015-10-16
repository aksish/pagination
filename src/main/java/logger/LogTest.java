package logger;

import org.apache.log4j.Logger;

/**
 * Created by Aashis Khanal on 9/7/15.
 */
public class LogTest {
    public static Logger logger = Logger.getLogger("errorLog");

    public static void main(String[] args) {
        logger.debug("debugging");
        logger.error("error");
    }
}
