package CoreJava.CollectionsFramework.Collection.QueueInterface;

import java.util.concurrent.SynchronousQueue;

public class SynchronousQueues {
    public static void main(String[] args) {
        SynchronousQueue<Integer> sq = new SynchronousQueue<>();
        sq.add(1);
        sq.add(2);
        sq.add(3);

        System.out.println(sq); // [1, 2, 3]

    }
}
