package collections.btwo.comparatorvscomparable;

import java.util.Comparator;

public class CarCustomComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int res = o2.name.compareTo(o1.name);
        return res == 0 ? o1.carType.compareTo(o2.carType) : res;
    }
}
