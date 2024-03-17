package classes.enums;

public class Main {
    public static void main(String[] args) {
        /*
            common functions which is used in enums
            - values()
            - Ordinal() //indexes like 0, 1, 2 ...
            - valueOf()
            - name()
         */
        for(EnumSample sample : EnumSample.values()) {
            System.out.println(sample);
            System.out.println(sample.ordinal());
        }

        //valueOf matches with the name and it is case-sensitive
        EnumSample enumVariable = EnumSample.valueOf("FRIDAY");
        System.out.println(enumVariable.name());
        System.out.println("");

        //custom values in enum
        EnumWithCustomValues values = EnumWithCustomValues.getEnumWithCustomValue(3);
        System.out.println(values.ordinal());
        System.out.println(values.name());
        System.out.println(values.getValue());

        //method override
        for(EnumWithMethodOverride e : EnumWithMethodOverride.values()) {
            System.out.println(e.name());
            e.dummyMethod();
        }
        System.out.println("\nInterface with enums: ");
        //Interface with enum
        for(EnumsWithInterface e : EnumsWithInterface.values()) {
            System.out.println(e.name());
            System.out.println(e.toLowerCase());
        }
    }
}
