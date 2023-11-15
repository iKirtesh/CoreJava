package CoreJava.CollectionsFramework.Collection;

import java.util.ArrayList;
import java.util.List;

public class PositionalAccess {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // positional access using get method
        System.out.println(list); // [Java, Python, C++]
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println();

        // positional access using set method
        System.out.println(list); // [Java, Python, C++]
        list.set(1, "JavaScript");
        System.out.println(list); // [Java, JavaScript, C++]

        // positional access using indexOf method
        System.out.println(list.indexOf("Java")); // 0
        System.out.println(list.indexOf("JavaScript")); // 1
        System.out.println(list.indexOf("C++")); // 2
        System.out.println(list.indexOf("Python")); // -1

        // Why -1? Because indexOf method returns -1 if the element is not found in the list.
        // So, if you want to check if an element exists in the list, you can use the indexOf method.
        // If the returned value is -1, then the element does not exist in the list or either removed from the list or replaced with another.

        // positional access using contains method
        System.out.println(list.contains("Java")); // true
        System.out.println(list.contains("JavaScript")); // true
        System.out.println(list.contains("C++")); // true
        System.out.println(list.contains("Python")); // false

        // positional access using lastIndexOf method
        System.out.println(list.lastIndexOf("C++")); // 2
    }
}
