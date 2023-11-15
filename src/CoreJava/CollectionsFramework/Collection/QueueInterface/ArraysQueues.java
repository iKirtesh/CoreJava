package CoreJava.CollectionsFramework.Collection.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class ArraysQueues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q); // [1, 2, 3]

        System.out.println(q.peek()); // 1

        // new method of queue interface
        System.out.println(q.element()); // 1

        System.out.println(q.poll()); // 1

        // new method of queue interface
        System.out.println(q.remove()); // 2

        System.out.println(q); // [3]

        System.out.println(q.offer(4)); // true

    }
}
