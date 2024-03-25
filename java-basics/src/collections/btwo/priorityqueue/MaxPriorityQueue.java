package collections.btwo.priorityqueue;

import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a, Integer b) -> b-a);
        maxPQ.add(5);
        maxPQ.add(10);
        maxPQ.add(4);
        maxPQ.add(2);
        maxPQ.add(7);

        maxPQ.forEach((Integer a) -> System.out.println(a));

        while(!maxPQ.isEmpty()) {
            int a = maxPQ.poll();
            System.out.println("Poll: " + a);
        }
    }
}
