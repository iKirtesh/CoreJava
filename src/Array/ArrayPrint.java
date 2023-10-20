package Array;

import java.util.Scanner;

public class ArrayPrint {
    static Scanner in = new Scanner(System.in);

    private static void acceptRecord(int[] number) {
        if (number != null){
                System.out.print("Enter number : ");
                number[0] = in.nextInt();
        }
    }
    private static void printRecord(int[] number) {
        if (number != null){
            System.out.println("Number : " + number[0]);
        }
    }
    public static void main(String[] args) {
        int[] number = new int[1];
        ArrayPrint.acceptRecord(number);
        ArrayPrint.printRecord(number);
    }
}
