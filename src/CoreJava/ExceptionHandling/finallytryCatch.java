package CoreJava.ExceptionHandling;

import java.util.Scanner;

public class finallytryCatch {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num1 = in.nextInt();
            System.out.print("Enter another number: ");
            int num2 = in.nextInt();

            if (num2 == 0) {
                // Anonymous object
                throw new ArithmeticException("Divide by zero");
            }

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            in.close();
            System.out.println("Scanner closed");
        }
    }
}
