package classes.enums;

public enum EnumWithMethodOverride {
    MONDAY{
        @Override
        public void dummyMethod() {
            System.out.println("monday dummy method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummyMethod() {
        System.out.println("default dummy method");
    }
}
