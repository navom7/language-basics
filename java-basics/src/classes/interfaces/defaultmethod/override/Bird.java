package classes.interfaces.defaultmethod.override;

public interface Bird extends LivingThings{
    default boolean canBreath() {

        /*
        called the default method from parent interface and here i can use the result
        and add more functionality to it
         */
        boolean canBreathe = LivingThings.super.canBreath();
        if(canBreathe) {
            System.out.println("yes");
        }
        return canBreathe == true ? true : false;
    }
}
