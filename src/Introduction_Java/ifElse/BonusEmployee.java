package Introduction_Java.ifElse;

/*
A company decided to give a bonus of 5% to an employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
 */
import java.util.Scanner;
public class BonusEmployee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Salary of Sau: ");
        int salary = in.nextInt();
        System.out.print("Year of Service : ");
        int service = in.nextInt();

        if(service > 5){
            System.out.println("Congratulations! You qualify for a bonus of " + (salary*0.05));
        }
        else {
            System.out.println("Sorry, you do not qualify for bonus!");
        }
    }
}