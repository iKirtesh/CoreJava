package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 89};

        System.out.println("Array is : " + Arrays.toString(arr));
        System.out.print("Search element above in Array: ");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();

        int searchArray = Arrays.binarySearch(arr, index);
        System.out.println(searchArray);


    }
}
