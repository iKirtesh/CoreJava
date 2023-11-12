package Core_Java.CollectionsFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Kirtesh");
        map.put(2, "Saurabh");
        map.put(3, "Shubham");

        System.out.println(map); // {1=Kirtesh, 2=Saurabh, 3=Shubham}
    }
}
