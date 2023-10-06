package Array;

import java.util.Arrays;

public class StringConvertArray {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Arrays.fill(arr, 1, 4, 0); // Fills elements at indices 1, 2, and 3 with zeros

        System.out.println(Arrays.toString(arr));
    }
}
