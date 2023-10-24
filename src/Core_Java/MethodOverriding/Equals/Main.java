package Core_Java.MethodOverriding.Equals;

public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        System.out.println(num1 == num2);   // true

        if (num1 == num2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
