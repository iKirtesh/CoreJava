package CoreJava.CollectionsFramework.Collection.QueueInterface;

import java.util.PriorityQueue;

public class PrioritysQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);

        System.out.println(pq); // [1, 2]

        System.out.println(pq.peek()); // 1

        System.out.println(pq.poll()); // 1

        System.out.println(pq); // [2]

        System.out.println(pq.offer(3)); // true

        System.out.println(pq); // [2, 3]

        System.out.println(pq.remove()); // 2

        System.out.println(pq); // [3]


    }
}
