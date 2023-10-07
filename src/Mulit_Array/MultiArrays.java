package Mulit_Array;

import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 4}, {1, 4, 5, 7}};

        System.out.println("Multi Array is : " + Arrays.deepToString(arr));
        System.out.println("Array length : " + arr.length + " ;First Array: " + arr[0].length + " ;2nd Array : " + arr[1].length);

        // Access Element
        System.out.println(arr[0][2]); // 4
    }
}
