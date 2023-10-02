package Introduction_Java.Practice;

import java.util.Scanner;

public class Factorial_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int fact = 1;
        for(int i=1; i <= num; i++){
            System.out.print(i + (i < num ? " * " : ""));
            fact = fact * i;
        }
        System.out.println(" = " + fact);
    }
}
