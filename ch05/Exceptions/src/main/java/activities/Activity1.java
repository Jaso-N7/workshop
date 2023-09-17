package activities;

import java.nio.file.NoSuchFileException;
import java.util.logging.*;

/**
 * Class that is based on the arguments to the program, and responds by logging
 * exceptions in different ways.
 * 
 * @author Jason Robinson
 * @version 0.1, 09/15/23
 */
public class Activity1 {
    
    /**
     * Demonstrates how to respond to the logging exceptions in different ways,
     * based on the arguments passed to the command line.
     * <p>
     * Usage: {@code Activity1.main(\"severity\")"); }<br>
     * Where severity is a string of 1, 2 or 3.
     * 
     * @param args the type of severity to capture
     * @throws LogException when an exception of type severity is caught
     */
    public static void main(String[] args) throws LogException {
        
        if (args.length == 0) {
            System.err.println("Usage: Activity1.main(\"severity\")");
            System.err.println("Where severity is a string of 1, 2 or 3");
            System.exit(-1);
        }
        
        int severity = Integer.parseInt(args[0]);
        
        switch (severity) {
            case 1 -> {
                try {
                    issuePointerException();
                } catch (NullPointerException npe) {
                    throw new LogException(severity, npe);
                }
            }
            case 2 -> {
                try {
                    issueFileException();
                } catch (NoSuchFileException nsf) {
                    throw new LogException(severity, nsf);
                }
            }
            case 3 -> {
                try {
                    issueFileException();
                } catch (NoSuchFileException nsf) {
                    throw new LogException(severity, nsf);
                }
            }
            default -> {
                System.err.println("Severity is out of bounds, see usage for details");
                System.exit(-1);
            }
        }
        
    }
    
    public static void issuePointerException() throws NullPointerException {
        throw new NullPointerException("Exception: null pointer");
    }
    
    public static void issueFileException() throws NoSuchFileException {
        throw new NoSuchFileException("Exception: file not found");
    }
}

class LogException extends Exception {

    // !!! TODO update this to use Enums
    public LogException(int severity, Throwable cause) {
                
        Logger logger = Logger.getAnonymousLogger();
        switch (severity) {
            case 1 -> { logger.log(Level.SEVERE,"Exception: Null Pointer", cause); }
            case 2 -> { logger.log(Level.WARNING, "Exception: No Such File", cause);}
            default -> { logger.log(Level.INFO, "Exception: No Such File", cause);}
        }
        
    }
}
