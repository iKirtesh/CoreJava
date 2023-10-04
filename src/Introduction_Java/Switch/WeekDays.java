package Introduction_Java.Switch;

import java.util.Scanner;

// Write a program to read a weekday number and print weekday name using a switch statement
public class WeekDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dayNum = 0;

        System.out.print("Enter the Number of day : ");
        dayNum = in.nextInt();

        String day = switch (dayNum){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday Or Sunday";
            default -> throw new IllegalStateException("Unexpected value: " + dayNum);
        };

        System.out.println("Today is " + day);
    }
}
