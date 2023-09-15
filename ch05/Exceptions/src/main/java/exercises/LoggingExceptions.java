package exercises;

import java.util.logging.*;

/**
 * Class that assists with Logging Exceptions
 * 
 * @author Jason Robinson
 * @version 0.1, 09/15/23
 */
public class LoggingExceptions {

    public static void main(String[] args) {
        
        Logger logger = Logger.getAnonymousLogger();
        
        // Provoking an exception
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException np) {
            logger.log(Level.SEVERE, "Exception happened", np);
        }
    }
}
