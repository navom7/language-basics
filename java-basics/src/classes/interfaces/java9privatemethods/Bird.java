package classes.interfaces.java9privatemethods;


/*
-We can provide the implementation of method but as a private access modifier in interface.
- It brings more readability of the code. For example if multiple default method share some code, that this can help
- It can be defined as static and non-static.
- From Static method, we can call only private static interface method.
- Private static method, can be called from both static and non static method.
- Private interface method can not be abstract. Means we have to provide the definition.
- It can be used inside of the particular interface only.
 */
public interface Bird {
    void canFly(); // this is equivalent to public abstract void canFly();

    public default void minimumFlyingHeight() {
        myStaticPublicMethod();
        myPrivateMethod();
        myPrivateStaticMethod();
    }

    static void myStaticPublicMethod() {
        myPrivateStaticMethod();
    }

    private void myPrivateMethod() {
        // implementation
    }

    private static void myPrivateStaticMethod() {
        //implementation
    }
}
