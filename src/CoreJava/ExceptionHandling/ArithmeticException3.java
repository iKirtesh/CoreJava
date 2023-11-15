package CoreJava.ExceptionHandling;

import java.util.Scanner;

public class ArithmeticException3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();

        if (num2 == 0) {
//            ArithmeticException e = new ArithmeticException("Divide by zero");
//            throw e;

            // Anonymous object
            throw new ArithmeticException("Divide by zero");
        }

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
