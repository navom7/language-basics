package classes.genericclass;

public class Main {
    public static void main(String[] args) {
        Print<Integer> c = new Print<Integer>();
        c.setValue(5);
        System.out.println(c.getValue());
    }
}
