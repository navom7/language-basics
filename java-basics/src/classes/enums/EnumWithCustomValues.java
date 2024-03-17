package classes.enums;

public enum EnumWithCustomValues {
    /*
        calling constructor as the constructor in enum are private
        and can be called from the enum class itself
     */
    MONDAY(1, "first day of weekd"),
    TUESDAY(2, "second day of week"),
    WEDNESDAY(3, "third day of week"),
    THURSDAY(4, "fourth day of week"),
    FRIDAY(5, "fifth day of week"),
    SATURDAY(6, "sixth day of week"),
    SUNDAY(7, "seventh day of week");
    private int val;
    private String comment;
    EnumWithCustomValues(int val, String comment) {
        this.val = val;
        this.comment = comment;
    }
    public int getValue() {
        return val;
    }
    public String getComment() {
        return comment;
    }
    public static EnumWithCustomValues getEnumWithCustomValue(int value) {
        for(EnumWithCustomValues e : EnumWithCustomValues.values()) {
            if(e.getValue() == value) {
                return e;
            }
        }
        return null;
    }
}
