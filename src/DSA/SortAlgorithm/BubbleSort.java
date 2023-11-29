package DSA.SortAlgorithm;

// Bubble Sort Algorithm using do-while loop

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        bubbleSort(arr);

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}