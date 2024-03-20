package classes.interfaces.functionalinterface.lambdaexpression.types.consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> c = (String str) -> {
            System.out.println(str);
        };

        c.accept("abc");
    }
}
