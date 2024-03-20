package classes.interfaces.functionalinterface.lambdaexpression.types.function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> c = (String str) -> {
            return 123;
        };

        System.out.println(c.function("abc"));
    }
}
