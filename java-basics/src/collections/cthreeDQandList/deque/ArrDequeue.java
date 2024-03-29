package collections.cthreeDQandList.deque;

import java.util.ArrayDeque;


//ArrayDeque is not thread-safe
public class ArrDequeue {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrDq = new ArrayDeque<>();
        arrDq.addLast(1);
        arrDq.addLast(5);
        arrDq.addLast(10);

        int element = arrDq.removeFirst();
        System.out.println(element);

        ArrayDeque<Integer> arrDqAsStack = new ArrayDeque<>();
        arrDqAsStack.addFirst(1);
        arrDqAsStack.addFirst(5);
        arrDqAsStack.addFirst(10);

        int remEle = arrDqAsStack.removeFirst();
        System.out.println(remEle);



    }
}
