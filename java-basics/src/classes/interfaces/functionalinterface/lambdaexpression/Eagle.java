package classes.interfaces.functionalinterface.lambdaexpression;

import classes.interfaces.functionalinterface.lambdaexpression.Bird;

public class Eagle {
    public static void main(String[] args) {
        /*
        lambda expression to implement the functional interface abstract method
        this can be achieved because we know that there is only one abstract method in
        functional interface and implementation can be done for that method only
         */
        Bird eagleObject = (String value) -> {
            System.out.println(value);
        };
        eagleObject.canFly("string");
    }
}
