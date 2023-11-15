package CoreJava.CollectionsFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kirtesh");
        map.put(2, "Saurabh");
        map.put(3, "Shubham");

        System.out.println(map); // {1=Kirtesh, 2=Saurabh, 3=Shubham}
        System.out.println(map.get(2)); // Saurabh
        System.out.println(map.containsKey(3)); // true


        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        System.out.println(map.remove(2)); // Saurabh
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}
