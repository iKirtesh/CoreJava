package CoreJava.CollectionsFramework.Collection.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q); // [1, 2, 3]

        System.out.println(q.peek()); // 1
        System.out.println(q.poll()); // 1
        System.out.println(q); // [2, 3]

        System.out.println(q.offer(4)); // true
        System.out.println(q); // [2, 3, 4]
    }
}
