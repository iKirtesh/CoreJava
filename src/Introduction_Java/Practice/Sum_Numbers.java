package Introduction_Java.Practice;

import java.util.Scanner;

public class Sum_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++){
            System.out.print(i + (i < num ? " + " : ""));
            sum += i;
        }
        System.out.println(" = " + sum);
    }
}
