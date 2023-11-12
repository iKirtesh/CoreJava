package Core_Java.CollectionsFramework.Collection.ListInterface.LinkedList;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Kirtesh");
        ll.add("Saurabh");
        ll.add("Shubham");
        ll.add("Pratik");

        System.out.println(ll);

        // Iterating over linked list
        for (String str : ll) {
            System.out.println(str);
        }
    }
}
