package classes.interfaces.nested;

public class ConcreteClass3 implements SampleInterface, SampleInterface.InnerInterface{
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }
}
