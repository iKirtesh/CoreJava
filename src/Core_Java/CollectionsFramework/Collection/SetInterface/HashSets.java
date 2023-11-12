package Core_Java.CollectionsFramework.Collection.SetInterface;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Kirtesh");
        hs.add("Saurabh");
        hs.add("Shubham");
        hs.add("Pratik");
        hs.add("Kirtesh");
        hs.add(null); // HashSet allows null values

        System.out.println(hs);
        hs.remove(null);
        hs.remove("Kirtesh");
        System.out.println(hs);

        // Checking Membership
        System.out.println(hs.contains("Saurabh"));

        // Size and isEmpty
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());

        // Iterating over HashSet
        for (String str : hs) {
            System.out.println(str);
        }

        // Clearing HashSet
        hs.clear();
        System.out.println(hs);
    }
}
