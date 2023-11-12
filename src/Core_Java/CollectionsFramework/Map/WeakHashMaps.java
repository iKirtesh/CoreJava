package Core_Java.CollectionsFramework.Map;

import java.util.WeakHashMap;

public class WeakHashMaps {
    public static void main(String[] args) {
        WeakHashMap<String, Integer> whm = new WeakHashMap<>();

        String s1 = new String("Kirtesh");
        String s2 = new String("Saurabh");
        String s3 = new String("Shubham");

        whm.put(s1, 1);
        whm.put(s2, 2);
        whm.put(s3, 3);

        int i = whm.get(s1);
        System.out.println(i); // 1

        System.out.println(whm); // {Shubham=3, Saurabh=2, Kirtesh=1}

    }
}
