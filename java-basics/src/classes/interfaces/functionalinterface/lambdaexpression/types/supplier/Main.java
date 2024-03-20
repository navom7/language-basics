package classes.interfaces.functionalinterface.lambdaexpression.types.supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> c = ( ) -> {
            return "abc";
        };

        System.out.println(c.get());
    }
}
