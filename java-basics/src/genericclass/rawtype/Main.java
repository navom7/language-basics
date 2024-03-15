package genericclass.rawtype;

public class Main {
    public static void main(String[] args) {

        //Raw use of generic classe
        RawType rawType = new RawType();
        rawType.setValue("abc");
        System.out.println(rawType.getValue());
    }

}
