package classes.interfaces;

/*
    Interface is something which helps 2 system to interact with each other without
    one system has to know the details of other system

    or

    in simple words, it helps achieve abstraction

    -> only public and default access modifiers are allowed, no private or protected
    -> one interface can extend from multiple interfaces with comma separated list of interfaces
    -> we can achieve 100 percent abstraction with interface
    -> we use interface also for polymorphism
        * we can implement same class of interfaces in different classes with different implementations
    -> we can achive multiple inheritance in java only through interfaces
    -> all the methods are implicitly public only whether you define its modifiers or not
    -> methods cannot be final
    -> overriding methods cannot downgrade the access modifier
    -> concrete must implement all the methods of the interface it implements
    ->** abstract class are not restricted/forced to provide the implementation of all the methods it may or may not provide the implementation
    -> in concrete class

 */
public interface InterfaceDescription extends Interface1, Interface2 {
    public void fly();//no implementation

    //fields are public static final by default whether you specify or not
    int MAX_HEIGHT_IN_FEET = 211;
}
