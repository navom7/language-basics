package controlflow;

public class CaseN {
    public static void main(String[] args) {
//        String day = "";
        int val = 3;

        //break statement is not required here
        // also default is must in this
        String outputVal = switch (val) {
            case 1 -> "One";
            default -> "None";
            case 2 -> "Two";
        };
        System.out.println(outputVal);
    }
}
