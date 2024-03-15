package genericclass.bounded.wildcard;

import java.util.List;

public class Print {
    public void setPrintValues(List<Vehicle> vehicleList) {

    }
    /*
        UpperBound Wildcard
        this method accepts list of any class that is either Vehicle itself or subclass as first parameter
        and Number and its subclasses in second parameter
     */
    public void printWildCard(List<? extends Vehicle> vehicles, List<? extends Number> numbers) {

    }

    /*
        LowerBound Wildcard
        this method accepts list of any class that is either Vehicle itself
        or its parent and grandparent as first parameter
     */

    public void printLowerBoundWildCard(List<? super Vehicle> vehicles) {

    }


    /*
        Unbounded WildCard
        Incase there is no surity of which type will the object be then we can use this
     */

    public void UnboundedWildCard(List<?> vehicles) {

    }


    /*
        this method accepts list of any class that is of defined type T and only one type will be accepted everytime

        but in wildcard method can accept different objects in different calls
     */
    public <T> void printGenericsMethod(List<T> source, List<T> destination) {

    }
}
