package classes.genericclass.method;

import classes.genericclass.multiple.Pair;

public class GenericMethod {
    public <K,V> void printValue(Pair<K,V> p1, Pair<K, V> p2) {
        System.out.println(p1.getKey() + " " + p2.getKey());
        System.out.println(p1.getValue() + " " + p2.getValue());
    }
}
