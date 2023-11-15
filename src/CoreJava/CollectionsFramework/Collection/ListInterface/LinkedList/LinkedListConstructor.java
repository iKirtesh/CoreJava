package CoreJava.CollectionsFramework.Collection.ListInterface.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListConstructor {
    public static void main(String[] args) {
        // Default constructor
        LinkedList<String> ll = new LinkedList<String>();

        // Constructor from Collection
        List<String> list = Arrays.asList("Kirtesh", "Saurabh", "Shubham", "Pratik");
        LinkedList<String> ll1 = new LinkedList<String>(list);
        System.out.println(ll1);

        // Constructor from another LinkedList
        LinkedList<String> ll2 = new LinkedList<String>(ll1);
        System.out.println(ll2);
    }
}
