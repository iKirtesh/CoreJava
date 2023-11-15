package CoreJava.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticException1 {



    public static void main(String[] args) {

        Scanner  in = new Scanner(System.in);
        try {
            System.out.println("Resource is allocated");
            System.out.print("Enter a number: ");
            int num1 = in.nextInt();
            System.out.print("Enter another number: ");
            int num2 = in.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException | InputMismatchException e) { // Multi-catch or pipe operator (|) is used to catch multiple exceptions
            System.out.println("Exception: " + e.getMessage());
        }

        in.close();
        System.out.println("Resource is released / deallocated");
    }
}
