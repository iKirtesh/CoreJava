package Core_Java.CollectionsFramework.CollectionSorting;

import java.util.*;
public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);

        System.out.println(list);

        // Sort the list
        Collections.sort(list);
        System.out.println(list);

        // Sort the list in reverse order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // Shuffle the list
        Collections.shuffle(list);
        System.out.println(list);

        // Obtain the minimum element
        System.out.println(Collections.min(list));

        // Obtain the maximum element
        System.out.println(Collections.max(list));

        // Obtain the frequency of an element
        System.out.println(Collections.frequency(list, 1));
    }
}
