package Core_Java.CollectionsFramework.Collection.QueueInterface;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueues {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<>();
        lbq.add(1);
        lbq.add(2);
        lbq.add(3);

        System.out.println(lbq); // [1, 2, 3]
    }
}
