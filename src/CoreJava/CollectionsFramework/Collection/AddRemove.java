package CoreJava.CollectionsFramework.Collection;

import java.util.ArrayList;
import java.util.List;

public class AddRemove {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list); // [Java, Python, C++]

        // add an element at specified index
        list.add(1, "JavaScript");
        System.out.println(list); // [Java, JavaScript, Python, C++]

        // remove an element from specified index
        list.remove(1);
        System.out.println(list); // [Java, Python, C++]

        // remove element by object
        list.remove("C++");
        System.out.println(list); // [Java, Python]

        // remove all elements from the list
        list.clear();
        System.out.println(list); // []

        // add all elements of another collection
        list.addAll(java.util.Arrays.asList("C", "C++", "Python"));
        System.out.println(list); // [C, C++, Python]

        // remove all elements of another collection
        list.removeAll(java.util.Arrays.asList("C", "C++"));

        // remove all elements except the specified collection
        list.retainAll(java.util.Arrays.asList("Python"));
        System.out.println(list); // [Python]

        // check if the list is empty
        System.out.println(list.isEmpty()); // false

        // get the size of the list
        System.out.println(list.size()); // 1

        // convert a list to array
        Object[] objectArray = list.toArray();
        System.out.println(java.util.Arrays.toString(objectArray)); // [Python]

        // convert a list to array
        String[] stringArray = list.toArray(new String[0]);

        // convert a list to string
        System.out.println(list.toString()); // [Python]

        // convert a list to string
        System.out.println(list); // [Python]

    }
}
