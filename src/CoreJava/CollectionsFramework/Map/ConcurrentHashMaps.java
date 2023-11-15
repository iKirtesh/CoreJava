package CoreJava.CollectionsFramework.Map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMaps {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
        chm.put(1, "Kirtesh");
        chm.put(2, "Saurabh");
        chm.put(3, "Shubham");

        System.out.println(chm); // {1=Kirtesh, 2=Saurabh, 3=Shubham}

        System.out.println(chm.get(2)); // Saurabh

        if (chm.containsKey(3)) {
            System.out.println("Key 3 is present");
        }

        System.out.println(chm.putIfAbsent(4, "Rahul")); // null
        System.out.println(chm.replace(1, "Kirtesh", "Kirtesh1")); // true
        System.out.println(chm.compute(1, (key, val) -> val + " Singh")); // Kirtesh1 Singh
    }
}
