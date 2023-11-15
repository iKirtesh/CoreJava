package CoreJava.CollectionsFramework.Map;

import java.util.LinkedHashMap;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("Kirtesh", "Kirtesh");
        lhm.put("Saurabh", "Saurabh");
        lhm.put("Shubham", "Shubham");


        System.out.println(lhm);

        for (String key : lhm.keySet()) {
            System.out.println(key + " " + lhm.get(key));
        }

        System.out.println(lhm.remove("Kirtesh"));
        System.out.println(lhm);

        System.out.println(lhm.containsKey("Shubham"));
        System.out.println(lhm.containsValue("Shubham"));

        System.out.println(lhm.keySet());
        System.out.println(lhm.values());

        System.out.println(lhm.entrySet());

        System.out.println(lhm.getOrDefault("Kirtesh", "Not Found"));

        lhm.forEach((k, v) -> System.out.println(k + " " + v));

        lhm.replaceAll((k, v) -> "Kirtesh");

        System.out.println(lhm);

        lhm.clear();
    }
}
