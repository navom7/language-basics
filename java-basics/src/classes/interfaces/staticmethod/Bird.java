package classes.interfaces.staticmethod;

public interface Bird {

    /*
    this is a static method
        ->we can provide the implementation of the static method in interfaces
        -> it cannot be overridden by classes which implement the interface
        -> we can access this using the interface name itself
     */
    static boolean canBreath() {
        return true;
    }
}
