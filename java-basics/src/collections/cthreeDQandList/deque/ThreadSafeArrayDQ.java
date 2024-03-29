package collections.cthreeDQandList.deque;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ThreadSafeArrayDQ {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> cldq = new ConcurrentLinkedDeque<Integer>();
        cldq.add(2);
        cldq.add(6);
        System.out.println(cldq.peek());

    }
}
