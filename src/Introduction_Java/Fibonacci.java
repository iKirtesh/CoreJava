package Introduction_Java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int a = 1;
        int b = 1;
        System.out.println(a +  "\n" + b);

        for(int n = 0; n < num - 2; n++){
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
