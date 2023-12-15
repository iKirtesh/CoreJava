package DSA.SearchAlgorithm;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                return i;   // return index of a key
        return -1;  // return -1 if key not found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();

        int result = linearSearch(arr, key);
        System.out.println(result);

//        if (result == -1)
//            System.out.println("Element is not present in the array");
//        else
//            System.out.println("Element is present at index " + result);
    }
}


// Time Complexity: O(n)
// Auxiliary Space: O(1) means Space Complexity is constant