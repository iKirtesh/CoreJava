package Core_Java.CollectionsFramework.Collection.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RetainAllMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> list2 = list.subList(0, 3);
        System.out.println(list2); // [1, 2, 3]

        // retainAll() method retains only the elements in this list that are contained in the specified collection
        list2.retainAll(list);
        System.out.println(list2); // [1, 2, 3]
    }
}
