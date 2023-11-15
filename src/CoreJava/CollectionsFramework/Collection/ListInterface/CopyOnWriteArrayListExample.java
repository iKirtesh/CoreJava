package CoreJava.CollectionsFramework.Collection.ListInterface;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        // Creating a CopyOnWriteArrayList
        CopyOnWriteArrayList<String> copyOnWriteList = new CopyOnWriteArrayList<>();

        // Adding elements
        copyOnWriteList.add("one");
        copyOnWriteList.add("two");
        copyOnWriteList.add("three");

        // Iterating over the list (Thread-safe iteration)
        Iterator<String> iterator = copyOnWriteList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            // Modifying the list during iteration is allowed
            copyOnWriteList.add("four");
        }

        // Displaying the final state of the list
        System.out.println("Final List: " + copyOnWriteList);
    }
}
