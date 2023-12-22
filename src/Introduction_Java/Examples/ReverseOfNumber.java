package Introduction_Java.Examples;

public class ReverseOfNumber {

    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;
        int rem;

        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("Reverse of number is: " + rev);
    }
}
