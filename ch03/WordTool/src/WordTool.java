/*
 * Exercise 1: Creating the WordTool Class

The goal of this exercise is to create a piece of reusable code, a class, 
that can be inserted in other programs, and that can be used to perform various
statistical analyses on text. 
We could be interested, for example, in getting to know the frequency of a 
certain word or letter in the text, how many words we have used so far, and more.
 */

/**
 * A class that can perform various statistical analysis on text.
 * 
 * Usage:
 * <code>
 *   WordTool wt = new WordTool();
 *   wt.wordCount("An example corpus");
 * </code>
 * 
 * @author Jason Robinson
 * @version 0.1, 09/07/23
 */
public class WordTool {

    /**
     * Class constructor.
     */
    public WordTool() {
    }

    /**
     * Demonstrates how to use <code>WordTool</code> and it's expected results.
     *
     * @param args optional command line arguments passed to the application.
     *             Has no use or bearing on the demonstration.
     */
    public static void main(String[] args) {
        WordTool wt = new WordTool();
        String text = "The river carried the memories from her childhood.";

        System.out.println("Analyzing the text: \n" + text);
        System.out.println("Total words: " + wt.wordCount(text));
        System.out.println("Total symbols (w. spaces): " + wt.symbolCount(text, true));
        System.out.println("Total amout of e: " + wt.symbolFrequency(text, 'e', false));
    }

    /**
     * Counts the number of words within a string.
     * 
     * Words are considered groups of characters / symbols succeeded, preceded
     * or surrounded by white spaces.
     * 
     * given: <code>"An example corpus"</code>, expect: <code>3</code>
     * given: <code>""</code>, expect: <code>0</code>
     *
     * @param s the string to be used
     * @return the number of words found in the given string
     */
    public int wordCount(String s) {
        int count = 0; // variable to count words

        // if the entry is empty or is null, count is zero
        // therefore we evaluate it only otherwise
        if (!(s == null || s.isEmpty())) {
            // use the split method from the String class to
            // separate the words having the whitespace as separator
            String[] w = s.split("\\s+");
            count = w.length;
        }

        return count;
    }

    /**
     * Counts the number of letters in a string.
     * 
     * The ability to count both with and without white space characters is
     * given by the flag <code>withSpaces</code>
     *
     * given: <code>"An example corpus", false</code>, expect: <code>15</code>
     * given: <code>"An example corpus", true</code>, expect: <code>17</code>
     * 
     * @param s the data to be read
     * @param withSpaces flag to determine if white spaces are to be treated as
     * symbols
     * @return The amount of symbols found in the given string
     */
    public int symbolCount(String s, boolean withSpaces) {
        int count = 0; // variable to count symbols

        // if the entry is empty or is null, count is zero
        // therefore we evaluate it only otherwise
        if (!(s == null || s.isEmpty())) {
            if (withSpaces) {
                // with whiteSpaces return the full length
                count = s.length();
            } else {
                // without whiteSpaces, eliminate whitespaces and get the length
                // on the fly
                count = s.replace(" ", "").length();
            }
        }

        return count;
    }
    
    /**
     * Calculates the frequency of a certain symbol appearing within a given text.
     * 
     * Given an example to search for the letter <code>'e'</code>, not treating
     * white spaces as symbols:
     * <code>
     *   WordTool wt = new WordTool();
     *   String text = "The river carried the memories from her childhood.";
     *   int frequency = wt.symbolFrequency(text, 'e', false);
     * </code>
     * Expect: <code>frequency</code> => <code>7</code>
     * 
     * Given n example to search for the letter <code>'h'</code>, this time, treating
     * white spaces as symbols, the effect is the same as the previous example:
     * <code>
     *   WordTool wt = new WordTool();
     *   String text = "The river carried the memories from her childhood.";
     *   int frequency = wt.symbolFrequency(text, 'h', true);
     * </code>
     * Expect: <code>frequency</code> => <code>5</code>
     * 
     * Given n example to search for white spaces <code>' '</code>, this time, treating
     * white spaces as symbols:
     * <code>
     *   WordTool wt = new WordTool();
     *   String text = "The river carried the memories from her childhood.";
     *   int frequency = wt.symbolFrequency(text, ' ', true);
     * </code>
     * Expect: <code>frequency</code> => <code>7</code>
     * 
     * @param s the text data containing the symbol
     * @param symbol the symbol to search for
     * @param whiteSpaces a flag to determine whether white spaces should be counted
     * @return how often the specified symbol appears in the given data
     */
    public int symbolFrequency(String s, char symbol, boolean whiteSpaces) {
        int count = 0;
        
        // Ensure the string is not empty
        if(!(s == null || s.isEmpty())) {
            if(whiteSpaces) {
                for(int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == symbol) {
                        count++;
                    }
                }
            } else {
                String withoutSpaces = s.replace(" ", "");
                for (int i = 0; i < withoutSpaces.length(); i++) {
                    char a = withoutSpaces.charAt(i);
                    if (a == symbol) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }

}
