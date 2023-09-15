package exercises;

/**
 *
 * @author Jason Robinson
 * @version 0.1, 09/15/23
 */
public class BreakingTheLaw {

    public static class MyException extends Exception {
        /**
         * Class constructor
         */
        public MyException() { super(); }
        
        /**
         * Class constructor
         */
        public MyException(String message) { super(message); }
        
        /**
         * Class constructor
         */
        public MyException(String message, Throwable cause) { super(message, cause); }
        
        /**
         * Class constructor
         */
        public MyException(Throwable cause) { super(cause); }
    }
    
    public static void main(String[] args) throws MyException {
        
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException npe) {
            // throw new MyException("Exception: my exception happened");
            throw new MyException("Exception: my exception happened", npe);
        }
    }
}
