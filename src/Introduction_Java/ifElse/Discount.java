package Introduction_Java.ifElse;

import java.util.Scanner;

/*
A shop will give a discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
 */
public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the quantity : ");
        int x = in.nextInt();
        int y = (x*100);
        System.out.println("Your Amount of Product is : " + y);
        if(y > 1000){
            System.out.println("The Discount is " + (0.1 * y) + "\nYour Amount is " + (y- (0.1* y)));
        }
        else {
            System.out.println("No Discount!");
        }
    }
}
