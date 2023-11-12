package Core_Java.CollectionsFramework.Collection.ListInterface.ArrayList;

import java.util.List;

public class SubListOperations {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list); // [1, 2, 3]

        // sublist from index 1 to 3
        List<Integer> subList = list.subList(1, 3);
        System.out.println(subList); // [2, 3]
    }
}
