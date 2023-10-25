package Core_Java.ExceptionHandling;

public class ArithmeticException2 {
    public static void main(String[] args) {
        // java.lang.Exception
        // java.lang.Throwable
        // java.lang.RuntimeException
        // java.lang.ArithmeticException

        ArithmeticException e = new ArithmeticException("Cannot divide by zero");  // Ok
        System.out.println(e.getMessage());
        RuntimeException e1 = new ArithmeticException("Cannot divide by zero");  // Ok : Upcasting
        System.out.println(e1.getMessage());
        Throwable e2 = new ArithmeticException("Cannot divide by zero");    // Ok : Upcasting
        System.out.println(e2.getMessage());
        Exception e3 = new ArithmeticException("Cannot divide by zero");  // Ok : Upcasting
        System.out.println(e3.getMessage());

    }
}