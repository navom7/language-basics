package collections.cthree.deque;

import java.util.ArrayDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class ArrDequeue {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrDq = new ArrayDeque<>();
        arrDq.addLast(1);
        arrDq.addLast(5);
        arrDq.addLast(10);

        System.out.println(arrDq.size());

        System.out.println(arrDq.poll());


        PriorityBlockingQueue<Integer> dq = new PriorityBlockingQueue<>();

        dq.add(1);
        dq.add(5);
        dq.add(10);
        dq.add(10);
        System.out.println(dq.size());

    }
}
