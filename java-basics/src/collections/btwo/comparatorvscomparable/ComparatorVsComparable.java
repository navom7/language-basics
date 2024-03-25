package collections.btwo.comparatorvscomparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorVsComparable {
    public static void main(String[] args) {
        Integer a[] = {5,4,3,6,72,1};
        Arrays.sort(a, (Integer c, Integer b) -> b-c);
        for(int i: a) {
            System.out.println(i);
        }
        Arrays.sort(a);
        System.out.println("\nnew:");
        for(int i: a) {
            System.out.println(i);
        }




        //Custom Object sorting
        Car[] carArr = new Car[3];
        carArr[0] = new Car("Sedan", "petrol");
        carArr[1] = new Car("Sedan", "diesel");
        carArr[2] = new Car("Hatchback", "cng");

        //both of these sorting does the same thing
        Arrays.sort(carArr, Comparator.comparing((Car c) -> c.carType));
        Arrays.sort(carArr, (Car c, Car b) -> c.carType.compareTo(b.carType));

        for(Car c: carArr) {
            System.out.println(c.name + " " + c.carType);
        }
        System.out.println("\nafter custom comparison: ");

        Arrays.sort(carArr, new CarCustomComparator());
        for(Car c: carArr) {
            System.out.println(c.name + " " + c.carType);
        }
    }
}
