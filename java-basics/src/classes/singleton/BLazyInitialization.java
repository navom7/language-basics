package classes.singleton;

/*
Lazy Initialization
problem: if two call happens simultaneously and instance is null
two object will be created

 */

public class BLazyInitialization {
    private static BLazyInitialization INSTANCE;

    private BLazyInitialization() {

    }

    public static BLazyInitialization getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new BLazyInitialization();
        }
        return INSTANCE;
    }
}
