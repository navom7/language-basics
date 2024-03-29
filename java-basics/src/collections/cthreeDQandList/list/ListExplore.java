package collections.cthreeDQandList.list;

import java.util.ArrayList;
import java.util.List;

public class ListExplore {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(0,1);
        list1.add(1,2);
        list1.add(4);
        list1.add(6);
        list1.add(3, 9);
//        list1.forEach((Integer a) -> System.out.println(a));

        List<Integer> list2 = new ArrayList<>();
        list2.add(0,10);
        list2.add(1,20);
        list2.add(40);
        list2.add(60);
        list2.add(3, 90);

        list1.addAll(2, list2);


        System.out.println("\nafter add all: ");
        list1.forEach((Integer a) -> System.out.print(a + " "));


        list1.replaceAll((Integer a) -> -1*a);
        System.out.println("\n\nafter replace all: ");
        list1.forEach((Integer a) -> System.out.print(a + " "));


        list1.sort((Integer a, Integer b) -> a-b);

        System.out.println("\n\nafter sorting: ");
        list1.forEach((Integer a) -> System.out.print(a + " "));


        System.out.println("\n\nget at position 2");
        System.out.println(list1.get(2));

        list1.set(2, 500);
        System.out.println("\n\nafter replace at pos 2: ");
        list1.forEach((Integer a) -> System.out.print(a + " "));

        list1.remove(2);
        System.out.println("\n\nafter remove at pos 2: ");
        list1.forEach((Integer a) -> System.out.print(a + " "));

        System.out.println("\n");
        System.out.println("index of -20: " + list1.indexOf(-20));
    }
}
