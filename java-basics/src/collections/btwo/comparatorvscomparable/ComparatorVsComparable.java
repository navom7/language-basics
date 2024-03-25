package collections.btwo.comparatorvscomparable;

import java.util.Arrays;

public class ComparatorVsComparable {
    public static void main(String[] args) {
        Integer a[] = {5,4,3,6,72,1};
        Arrays.sort(a, (Integer c, Integer b) -> c-b);
        Arrays.sort(a);

    }
}
