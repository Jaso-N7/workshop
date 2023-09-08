/*
 * Exercise 1: Creating the WordTool Class

The goal of this exercise is to create a piece of reusable code, a class, 
that can be inserted in other programs, and that can be used to perform various
statistical analyses on text. 
We could be interested, for example, in getting to know the frequency of a 
certain word or letter in the text, how many words we have used so far, and more.
 */

/**
 *
 * @author PacktPub
 */
public class WordTool {

    public WordTool() {
    }

    public static void main(String[] args) {
        WordTool wt = new WordTool();
        String text = "The river carried the memories from her childhood.";

        System.out.println("Analyzing the text: \n" + text);
        System.out.println("Total words: " + wt.wordCount(text));
        System.out.println("Total symbols (w. spaces): " + wt.symbolCount(text, true));
        System.out.println("Total amout of e: " + wt.symbolFrequency(text, 'e', false));
    }

    /**
     * Count the number of words within a string.
     *
     * @param s The string to be used
     * @return The number of words found in the string
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
     * Count the number of letters in a string, and add the ability to count
     * both with and without white space characters
     *
     * @param s The data to be read
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
     * Calculates the frequency (how often) of a certain symbol.
     * 
     * @param s The text data containing the symbol
     * @param symbol The symbol to search for
     * @param whiteSpaces Set to true if the symbol being counted is a white space
     * @return The frequency of the specified symbol contained in the given data
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
