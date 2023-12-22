package Introduction_Java.Examples;

public class NumPrime {
    public static void main(String[] args) {
        int num = 7;
        int c = 2;

        while (c < num) {
            if (num % c == 0) {
                System.out.println("Number is Not prime");
                break;
            }
            c++;
        }
        if (c == num) {
            System.out.println("Number is Prime");
        }
    }
}
