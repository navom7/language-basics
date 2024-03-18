package classes.interfaces.abstractclass;

//abstract class is not forced to implement all the methods
public abstract class SampleAbstract implements Interface1 {
    @Override
    public void method2() {
        System.out.println("method2");
    }
    public void method3() {
        System.out.println("method3");
    }

    public abstract void method7();
}
