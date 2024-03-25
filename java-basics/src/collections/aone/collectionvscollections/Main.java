package collections.aone.collectionvscollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        lst.add(5);
        lst.add(3);
        lst.add(2);
        lst.add(4);

        System.out.println("Max value: " + Collections.max(lst));
        System.out.println("Min value: " + Collections.min(lst));

        Collections.sort(lst);
        System.out.println("Sorted List: ");
        lst.forEach((Integer it) -> System.out.print(it + " "));
        Collections.rotate(lst, 2);
        System.out.println("Rotated List: ");
        lst.forEach((Integer it) -> System.out.print(it + " "));

    }
}
