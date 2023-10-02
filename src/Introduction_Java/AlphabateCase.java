package Introduction_Java;

import java.util.Scanner;

public class AlphabateCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);

        if((int)(c) < 97){
            System.out.println("UpperCase");
        }
        else {
            System.out.println("lowerCase");
        }
    }
}
