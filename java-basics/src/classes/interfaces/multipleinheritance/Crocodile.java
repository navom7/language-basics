package classes.interfaces.multipleinheritance;

//solution to diamond problem
//multiple inheritance
public class Crocodile implements LandAnimal, WaterAnimal{
    @Override
    public void canBreathe() {
        System.out.println("canBreathe which is extended from two different interfaces");
    }
}
