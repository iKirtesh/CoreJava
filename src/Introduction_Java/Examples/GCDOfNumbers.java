package Introduction_Java.Examples;

public class GCDOfNumbers {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 8;

        int gcd = 1;
        int k = 2;

        while (k <= num1 && k <= num2) {
            if (num1 % k == 0 && num2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        System.out.println("GCD of numbers is: " + gcd);
    }
}
