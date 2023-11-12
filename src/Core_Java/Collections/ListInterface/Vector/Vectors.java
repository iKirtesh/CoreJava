package Core_Java.Collections.ListInterface.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Kirtesh");
        v.add("Saurabh");
        v.add("Shubham");

        System.out.println(v);

        // Adding an element a specific position
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        // Adding an element a specific position
        v.add(1, "Pratik");

        // Removing an element
        v.remove("Saurabh");


        System.out.println("\n" + v.get(1) + "\n");
        // Iterating over vector
        for (String str : v) {
            System.out.println(str);
        }

        System.out.println();
        // Enumeration
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
