package classes.interfaces.staticmethod;

import classes.interfaces.defaultmethod.override.Bird;

public interface ImportantBird extends Bird {

    /*
    this is not possible to override the static method
     */
//    static boolean canBreath() {
//        return true;
//    }
    default boolean canEat() {
//        Bird.canBreath();
        return true;
    }
}
