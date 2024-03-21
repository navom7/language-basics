package annotation;

import java.util.ArrayList;
import java.util.List;

public class SafeVarargsExample {


    //If we do not use @SafeVarargs hover on method name we will get warnings saying "Possible heap pollution from parameterized vararg type"
//    @SafeVarargs //To suppress this warning we use @SafeVarargs
    public static void printLogValues(List<Integer>... logNumberList) {
        Object[] objectList = logNumberList;

        List<String> stringValueList = new ArrayList<>();
        stringValueList.add("Hello, world!");

        //Object of One Type (Example String), storing the reference of another type Object (Example Integer)
        //Here we are doing heap pollution
        objectList[0] = stringValueList;
    }

}
