package Core_Java.CollectionsFramework.Collection.SetInterface;

import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Kirtesh");
        lhs.add("Saurabh");
        lhs.add("Shubham");
        lhs.add("Kirtesh");

        System.out.println(lhs);
    }
}
