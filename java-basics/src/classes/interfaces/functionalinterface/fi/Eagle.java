package classes.interfaces.functionalinterface.fi;

public class Eagle implements Bird{
    @Override
    public void canFly(String val) {
        System.out.println("can FLy");
    }

    public static void main(String[] args) {
        Bird eagleObject = new Bird() {
            @Override
            public void canFly(String val) {
                System.out.println(val);
            }
        };
    }

    //here i am not providing the implementation of toString() and still not getting any error
    //because toString() method is in Object class
}
