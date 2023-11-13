package Core_Java.Packages;

import java.util.StringTokenizer;

public class StringTokenize {
    public static void main(String[] args) {
        // Creating a StringTokenizer with default delimiters (space, tab, newline, carriage return)
        StringTokenizer defaultTokenizer = new StringTokenizer("Java Programming is Fun");

        // Iterating over tokens
        while (defaultTokenizer.hasMoreTokens()) {
            String token = defaultTokenizer.nextToken();
            System.out.println(token);
        }

        // Creating a StringTokenizer with custom delimiter
        StringTokenizer customTokenizer = new StringTokenizer("Java:Programming:is:Fun", ":");

        // Counting tokens
        int tokenCount = customTokenizer.countTokens();
        System.out.println("\nToken count: " + tokenCount);

        // Iterating over tokens with custom delimiter
        while (customTokenizer.hasMoreTokens()) {
            String token = customTokenizer.nextToken();
            System.out.println(token);
        }
    }
}
