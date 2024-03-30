package collections.cthreeDQandList;

import java.util.LinkedList;

public class LinkedListExplore {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.addLast(6);
        ll.add(1, 7);
        ll.addFirst(9);
        System.out.println(ll.getFirst() + " \n");
        ll.forEach((Integer a) -> System.out.print(a + " "));
        System.out.println();


    }
}
