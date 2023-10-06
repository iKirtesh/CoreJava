package Introduction_Java.Loop;

import java.util.Scanner;
import java.lang.Math;

public class SumInWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        char ch;

        do {
            System.out.print("Enter number 1: ");
            num1 = in.nextInt();

            System.out.print("Enter number 2: ");
            num2 = in.nextInt();

            System.out.println("Sum is " + (num2 + num1));

            System.out.print("Do you want to continue!(y/n): ");
            ch = in.next().charAt(0);

        } while (ch == 'Y' || ch =='y');
    }
}
