package classes.interfaces.functionalinterface.fi;


/*
Functional Interface
    -> It can contain only one abstract method(in interface any normal method is abstract by default)
        -> it may contain other methods like abstract methods, static and Object methods like toString();
    -> It is also know as SAM Interface(Single Abstract Method)
    -> @FunctionalInterface is optional to use, if we use this restricts it to be functional interface

 */
@FunctionalInterface
public interface Bird {
//    public Integer key;
    void canFly(String val);

    default void canBreath() {
        System.out.println("can Breath");
    }

    private static void canWalk(String val) {
        System.out.println("can walk " + val);
        Object obj = new Object();
        obj.toString();
    }

    /*
    method from Object.class as Object is parent of every class

    and it is true that if we use and Object class method in interface, classes that implement that interface
    does not have to implement that method in this class as that method is implemented in Object.class
    whic is parent of all the classes
     */

    String toString();

    /*
    if we try to add new abstract methods it will throw error because we are using @FunctionalInterface
     */
//    boolean canBreath();
}
