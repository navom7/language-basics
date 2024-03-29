package collections.btwoPQ.priorityqueue;

import java.util.PriorityQueue;

public class MinPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(8);
        minPQ.add(10);
        minPQ.add(1);
        minPQ.add(2);

        minPQ.forEach((Integer i) -> System.out.println(i));

        while(!minPQ.isEmpty()) {
            int val = minPQ.poll();
            System.out.println("removed from top: " + val);
        }
    }
}
