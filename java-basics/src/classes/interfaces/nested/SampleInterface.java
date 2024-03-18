package classes.interfaces.nested;

public interface SampleInterface {
    void method1();
    public interface InnerInterface{
        void method2();
        void method1();
    }
}
