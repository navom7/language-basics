package classes.interfaces.defaultmethod.override;

public class Eagle implements  Bird{

    /*
    here also i can override the default method method from parent interface
     */
    @Override
    public boolean canBreath() {
        return Bird.super.canBreath();

    }
}
