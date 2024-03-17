package classes.singleton;


/*

Eager Initialization, Problem with this approach is that even if i don't want the
instance then also the object is created always

 */
public class AEagerInitialization {
    private static AEagerInitialization INSTANCE = new AEagerInitialization();
    private AEagerInitialization() {

    }

    public static AEagerInitialization getInstance() {
        return INSTANCE;
    }
}
