package Core_Java.Collections.SetInterface;

import java.util.*;

public class TreeSets {
public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Kirtesh");
        ts.add("Saurabh");
        ts.add("Shubham");
        ts.add("Kirtesh");

        System.out.println(ts);
        System.out.println(ts.size());
        System.out.println(ts.contains("Kirtesh"));

        // Iterating over TreeSet
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
                System.out.println(itr.next());
        }
    }
}
