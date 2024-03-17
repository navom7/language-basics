package classes.enums.comparison;

public class Main {
    public static void main(String[] args) {
        //when we use the constants, there is no control over what comes in parameter
        //there can be values that are not expected at all and funtion can behave
        //weardly in this case
        isWeekend(1);
        isWeekend(2);
        isWeekend(10000);


        //incase of enums, we have full control over what data should come into the parameter
        isWeekend(EnumSample.MONDAY); //false
        isWeekend(EnumSample.SUNDAY); //true
    }

    public static boolean isWeekend(int day) {
        if(WeekDayConstants.SUNDAY == day || WeekDayConstants.SATURDAY == day) {
            return true;
        }
        return false;
    }

    public static boolean isWeekend(EnumSample enumer) {
        if(EnumSample.SUNDAY == enumer || EnumSample.SATURDAY == enumer) {
            return true;
        }
        return false;
    }
}
