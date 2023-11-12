package Core_Java.CollectionsFramework.Collection;

import java.util.Arrays;

public class CollectionSort {
    public static void main(String[] args) {
        int[] intArray = { 5, 2, 1, 4, 3 };
        System.out.print("Before sorting: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }

        System.out.print("\nAfter sorting : ");
        Arrays.sort(intArray);
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
