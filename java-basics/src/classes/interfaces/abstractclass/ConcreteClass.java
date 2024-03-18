package classes.interfaces.abstractclass;


/*
concrete class must implement all the remainin non-implemented methods
 */
public class ConcreteClass extends SampleAbstract{

    @Override
    public void method7() {
        System.out.println("method7");
    }

    @Override
    public void method1() {
        System.out.println("method1");
    }


    @Override
    public void method4() {
        System.out.println("method4");
    }
}
