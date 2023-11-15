package CoreJava.CollectionsFramework.Map;

import java.util.IdentityHashMap;
public class IdentityHashMaps {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> ihm = new IdentityHashMap<>();
        ihm.put(1, "Kirtesh");
        ihm.put(2, "Kirtesh");

        System.out.println(ihm); // {1=Kirtesh, 2=Kirtesh}
        System.out.println(ihm.get(2)); // Kirtesh

        System.out.println(ihm.containsKey(1)); // true
        System.out.println(ihm.containsValue("Kirtesh")); // true
    }
}
