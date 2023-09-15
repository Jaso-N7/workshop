package com.mindfulengineering.learn.exceptions;

/**
 * Example06 is a class that demonstrates how {@code NullPointerExceptions} are
 * likely to occur.
 * 
 * @author Jason Robinson
 */
public class Example06 {
    
    private static void staticMethod () {
        System.out.println("static method, accessible from null reference");
    }
    
    private void nonStaticMethod() {
        System.out.println("non-static method, inaccessible from null reference");
    }
    
    /**
     * Demonstrates a very common situation for provoking {@code NullPointerException}s
     * when trying to call a non-static method from an object initialized to {@code null}
     * 
     * <p>Comment or uncomment each of the lines calling the methods from {@code main}
     * @param args 
     */
    public static void main(String[] args) {
        Example06 object = null;
        
        object.staticMethod();
//        object.nonStaticMethod();
        
    }
}
