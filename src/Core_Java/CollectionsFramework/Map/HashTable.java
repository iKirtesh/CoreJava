package Core_Java.CollectionsFramework.Map;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Kirtesh");
        ht.put(2, "Saurabh");
        ht.put(3, "Shubham");

        System.out.println(ht); // {3=Shubham, 2=Saurabh, 1=Kirtesh}

        System.out.println(ht.get(2)); // Saurabh
        System.out.println(ht.containsKey(3)); // true

        for (int key : ht.keySet()) {
            System.out.println(key + " " + ht.get(key));
        }
    }
}
