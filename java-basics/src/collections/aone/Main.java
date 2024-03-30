package collections.aone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);


        //using iterators
        Iterator<Integer> valuesIterator = values.iterator();
        while(valuesIterator.hasNext()) {
            int value = valuesIterator.next();
            System.out.println(value);
            if(value == 3) {
                valuesIterator.remove();
            }
        }

        System.out.println("\niterating using foreach iterator");
        for(int a: values) {
            System.out.println(a);
        }

        System.out.println("\ninterating using lambda forEach method");
        values.forEach((Integer val) -> {
            System.out.println(val);
        });
    }

}