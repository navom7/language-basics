package collections.cthree.deque;

import java.util.ArrayDeque;

public class ArrDequeue {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrDq = new ArrayDeque<>();
        arrDq.addLast(1);
        arrDq.addLast(5);
        arrDq.addLast(10);

        System.out.println(arrDq.size());

        System.out.println(arrDq.poll());

    }
}
