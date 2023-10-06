package Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1, 67, 89, 34, 89, 90};

        Arrays.sort(arr);
        System.out.println("Sorted Array Are: ");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
