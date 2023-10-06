package Array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 56, 23, 8};

        System.out.println("Old Array : " + Arrays.toString(arr));

        int[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("New Copy of Array : " + Arrays.toString(newArr));
    }
}
