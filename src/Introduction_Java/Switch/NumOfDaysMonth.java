package Introduction_Java.Switch;

// Write a program to Find the number of days in a month using a switch statement
import java.util.Scanner;
public class NumOfDaysMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Month Number : ");
        int mon = input.nextInt();
        switch (mon) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.print("Number of Days 31..");
                break;
            case 4, 6, 9, 11:
                System.out.print("Number of Days 30..");
                break;
            case 2:
                System.out.println("Number of Days 28..");
                break;
            default:
                System.out.print("Invalid...Please Enter the 1 to 12...");
                break;
        }
    }
}