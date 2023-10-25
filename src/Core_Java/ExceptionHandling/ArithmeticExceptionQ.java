package Core_Java.ExceptionHandling;

import java.util.Scanner;

public class ArithmeticExceptionQ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Resource is allocated");
        System.out.print("Enter a number: ");
        int num1 = in.nextInt();
        System.out.print("Enter another number: ");
        int num2 = in.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        in.close();
        System.out.println("Resource is released / deallocated");
    }
}
