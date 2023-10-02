package Introduction_Java.Practice;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base, power, result = 1;

        System.out.print("Enter Base and power: ");
        base = in.nextInt();
        power= in.nextInt();

        for(int i = 1; i<= power; i++){
            System.out.print(base + (i < power ? " * " : ""));
            result*= base;
        }
        System.out.println(" = " + result);
    }
}
