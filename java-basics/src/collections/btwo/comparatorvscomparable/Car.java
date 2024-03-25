package collections.btwo.comparatorvscomparable;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    String name;
    String carType;

    public Car() {
    }

    Car(String name, String carType) {
        this.name = name;
        this.carType = carType;
    }


    @Override
    public int compareTo(Car o1) {
        return this.name.compareTo(o1.name);
    }
}
