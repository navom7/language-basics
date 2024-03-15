package genericclass.bounded;

public class Main {
    public static void main(String[] args) {
        UpperBound<Integer> upperBound = new UpperBound();
        upperBound.setValue(1243);
        System.out.println(upperBound.getValue());

    }
}
