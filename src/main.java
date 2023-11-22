import java.util.Scanner;

class Main {


    /**
     *Take the input line from argument and return the string true if every single letter of the English alphabet exists in the string, otherwise return the string false. For example: if str is "zacxyjbbkfgtbhdaielqrm45pnsowtuv" then your program should return the string true because every character in the alphabet exists in this string even though some characters appear more than once.
     * */
    private static String alphabetSearching(String str) {
        boolean[] visited = new boolean[26];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z' && !visited[str.charAt(i) - 'a']) {
                visited[str.charAt(i) - 'a'] = true;
                count++;
            }
        }

        return count == 26 ? "true" : "false";
    }
    public static void main(String[] args) {
        // Arguments will be read by STDIN
Scanner s = new Scanner(System.in); // do not change this
String inputLine = s.nextLine(); // do not change this
// Your code here

        // below is a sample program output
        System.out.print(alphabetSearching(inputLine));
    }
}