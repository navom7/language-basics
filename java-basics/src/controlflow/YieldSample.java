package controlflow;

public class YieldSample {
    public static void main(String[] args) {
        int val = 3;

        //break statement is not required here
        // also default is must in this
        String outputVal = switch (val) {
            case 1 -> {
                System.out.println("Yielding one");
                yield "one";
            }
            default -> "None";
            case 2 -> "Two";
        };
        System.out.println(outputVal);
    }
}
