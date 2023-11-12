package Core_Java.CollectionsFramework.Map;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Kirtesh", 1);
        tm.put("Saurabh", 2);
        tm.put("Shubham", 3);
        
        System.out.println(tm); // {Kirtesh=1, Shubham=3, Saurabh=2}
        
        System.out.println(tm.get("Kirtesh")); // 1
        System.out.println(tm.containsKey("Shubham")); // true

        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());

        System.out.println(tm.tailMap("Kirtesh"));
        System.out.println(tm.headMap("Kirtesh"));

        System.out.println(tm.keySet());
        System.out.println(tm.subMap("Kirtesh", "Saurabh"));

        System.out.println(tm.remove("Kirtesh")); // 1
    }
}
