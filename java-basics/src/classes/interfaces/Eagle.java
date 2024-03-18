package classes.interfaces;

public class Eagle implements InterfaceDescription{


    //while overriding we cannot downgrade the access modifier
    // i.e from public we cannot make it private or protected
    @Override
    public void fly() {
        System.out.println("fly from Eagle");
    }
}
