package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Size of Array: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // this is a short way to print an array
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
