package Introduction_Java.Examples;

public class Armstrong {
    public static void main(String[] args) {
        // generate armstrong numbers between 1 and 1000

        for (int i = 1; i <= 1000; i++) {
            int num = i;
            int sum = 0;
            int rem;
            while (num != 0) {
                rem = num % 10;
                sum += rem * rem * rem;
                num /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}

