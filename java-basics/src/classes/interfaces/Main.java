package classes.interfaces;

public class Main {
    public static void main(String[] args) {
        InterfaceDescription bird1 = new Eagle();
        InterfaceDescription bird2 = new Hen();

        /*
        same fly method is implemented differently in different classes
        hence this decides in run time to which implementation to use

        polymorphism is achieved polymorphism
         */
        bird1.fly();
        bird2.fly();
    }
}
