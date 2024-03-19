package classes.interfaces.defaultmethod;

public interface MethodWithDefaultInterface {
    //this is the normal abstract class that every interface has
    void fly();

    /*
    this is the new functionality in java 8 and beyond where it supports a method that can be
    implemented in interface itself and will be available in all the classes that implement
    this method

    Important: if class implements from more than one interface, and all these interfaces
    has default methods with same name, than that class must provide implementations for that
    method in it.

    -> there can be multiple level of inheritance
            and in this case default methods is avaliable in all of its child classes
    -> if interface1 has a default method and interface2 extends interface1 and insided this
            interface2 same default method it makes abstract then those classes implementing
            this interface2 will have to provide implementations of that method
     */
    default int getMinimumFlyHeight(){
        return 10000;
    }

}


/*
Why default method was introduced

since from java 8 and beyond streams was introduced
to add the functionality in existing legacy interface we need to use default method.
Example stream() method in
 */