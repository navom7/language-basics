package classes.genericclass.bounded.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();

        vehicleList.add(new Car());//Possible
        vehicleList.add(new Vehicle());


        List<Bus> busList = new ArrayList<Bus>();

//        vehicleList = busList;//Not Possible

        Vehicle vehicle = new Vehicle();
        Bus bus = new Bus();

        vehicle = bus; //Possible
//        bus = vehicle; //Not Possible


        Print printObj = new Print();
        printObj.setPrintValues(vehicleList);
//        printObj.setPrintValues(busList);//Not Possible


    }
}
