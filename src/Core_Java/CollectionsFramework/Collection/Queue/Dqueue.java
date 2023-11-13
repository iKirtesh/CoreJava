package Core_Java.CollectionsFramework.Collection.Queue;

import java.util.ArrayDeque;

public class Dqueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(1);
        ad.add(2);
        ad.add(3);

        System.out.println(ad); // [1, 2, 3]

        System.out.println(ad.peek()); // 1

        System.out.println(ad.poll()); // 1


    }
}
