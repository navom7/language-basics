package classes.interfaces.staticmethod;

public class Eagle {
    public void digestiveSystem() {
        /*
        static method from interface can be used directly by the interface name itself
         */
        if(Bird.canBreath()) {
            System.out.println("can breath");
        }
    }
}
