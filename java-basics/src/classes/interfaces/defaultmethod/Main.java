package classes.interfaces.defaultmethod;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InterfaceImplementation i = new InterfaceImplementation();
        i.fly();
        System.out.println(i.getMinimumFlyHeight());


        List<String> lines = new ArrayList<String>();

        /*this stream was introduced in Collections interface and since collection was
        implemented in so many classes i.e ArrayList, List, Array etc

        stream had to be implemented in all these places hence they decided to create a
        new functionality to add the implementation of functions in interface itself
        so that all the classes that implemented this interface will have that functionality

        i.e stream();


         */
        lines.stream();
    }
}
