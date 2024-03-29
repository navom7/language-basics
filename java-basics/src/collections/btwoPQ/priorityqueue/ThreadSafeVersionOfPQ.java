package collections.btwoPQ.priorityqueue;

import java.util.concurrent.PriorityBlockingQueue;

public class ThreadSafeVersionOfPQ {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<>();
        pq.add(3);
        pq.add(5);
        System.out.println(pq.peek());
    }
}
