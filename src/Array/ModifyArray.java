package Array;

import java.util.Scanner;

public class ModifyArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5};

        System.out.print("Original array is: ");
        for (int k : a) {
            System.out.print(k + " ");
        }

        System.out.print("\nEnter the index to modify: ");
        int n = in.nextInt();

        if (n >= 0 && n < a.length) {
            System.out.print("Enter the new value: ");
            a[n] = in.nextInt();

            System.out.println("The element at index " + n + " is now " + a[n]);

            System.out.print("Updated array is: ");
            for (int j : a) {
                System.out.print(j + " ");
            }
        } else {
            System.out.println("Invalid index. Please enter a valid index within the array size.");
        }
    }
}