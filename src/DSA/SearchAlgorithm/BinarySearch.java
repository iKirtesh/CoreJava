package DSA.SearchAlgorithm;

import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;     // return index of a key
            else if (arr[mid] < key)
                low = mid + 1;  // key is in the right half
            else
                high = mid - 1; // key is in the left half
        }

        return -1;      // return -1 if key not found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();


        int result = binarySearch(arr, key);
        System.out.println(result);

        if (result == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index " + result);
    }

    // Time Complexity: O(log n)
    // Auxiliary Space: O(1) means Space Complexity is constant
}
