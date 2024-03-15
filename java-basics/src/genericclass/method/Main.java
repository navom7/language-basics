package genericclass.method;

import genericclass.multiple.Pair;

public class Main {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.printValue(new Pair<String, Integer>("abc", 123), new Pair<>("def", 566));
    }
}
