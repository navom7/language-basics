package classes.immutable;

import java.util.ArrayList;
import java.util.List;

/*
1. We cannot change the value of an object once it is created
2. Declare the class as 'final' so that it cannot be extended
3. class member should be private
4. class member should be initialized only once through constructor
5. there should not be any setter method
6. there should be only getter method that should return copy of member variables


 */
final class ImmutableClass {
    private final String name;
    private final List<Object> petNameList;

    public ImmutableClass(String name, List<Object> petNameList){
        this.name = name;
        this.petNameList = petNameList;
    }

    public String getName(){
        return name;
    }

    public List<Object> getPetNameList(){
        /*
        this is required because making list final
        means you can not now point it to new list, but still can add, delete values in it
        so that is why we send copy of it.

         */
        return new ArrayList<Object>(petNameList);
    }

}


/*

final means we are allowed to always point to same list
basically same memory location where list is stored, but the value inside it can be changed
 */