package classes.interfaces.functionalinterface.lambdaexpression.types.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> c = (String str) -> {
            return str.equalsIgnoreCase("abc");
        };

        System.out.println(c.predicate("abc"));
    }
}
