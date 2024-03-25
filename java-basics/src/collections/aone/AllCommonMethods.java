package collections.aone;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllCommonMethods {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        System.out.println("Size: " + values.size());
        System.out.println("isEmpty: " + values.isEmpty());
        System.out.println("contains 1: " + values.contains(1));
        System.out.println("contains 6:" + values.contains(6));

        System.out.println("at index 1: " + values.get(1));
        //remove using index
        values.remove(1);
        System.out.println("after remove using index 1: " + values.get(1));

        values.remove(Integer.valueOf(1));
        System.out.println("after removed value 1: " + values.contains(1));

        System.out.println("Size after removing elements from values: " + values.size());

        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);

        values.addAll(stackValues);
        System.out.println("after adding stack size: " + values.size());

        System.out.println("contains all test: " + values.containsAll(stackValues));

        values.remove(Integer.valueOf(7));
        System.out.println("contains all test after removing elements: " + values.containsAll(stackValues));


        values.removeAll(stackValues);

        System.out.println("size after remove all: " + values);
        values.clear();
        System.out.println("Is empty: " + values.isEmpty());
    }
}
