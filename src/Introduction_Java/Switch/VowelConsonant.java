package Introduction_Java.Switch;

// Write a program to Check whether a character is a vowel or consonant using a switch statement
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Character: ");
        char ch = in.next().charAt(0);

        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            switch (ch){
                case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
                default -> System.out.println("Consonant");
            }
        } else {
            System.out.println("This is not Character!");
        }
    }
}
