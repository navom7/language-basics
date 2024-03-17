package classes.genericclass.multiple;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pairObj = new Pair<>("hello", 1234);
        pairObj.put("hello", 1234);
        System.out.println(pairObj.getKey());
        System.out.println(pairObj.getValue());
        System.out.println(pairObj.getClass());
    }
}
