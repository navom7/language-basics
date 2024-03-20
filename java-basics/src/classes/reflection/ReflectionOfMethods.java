package classes.reflection;

public class ReflectionOfMethods {
    public String breed;
    private boolean canSwim;
    public void fly (){
        System.out.println("fly");
    }
    private void eat () {
        System.out.println("eat");
    }

    public void flyparams(int intParam, String stringParam, boolean booleanParam) {
        System.out.println("int param: " + intParam + " string " + stringParam + " boolean: " + booleanParam);
    }
}
