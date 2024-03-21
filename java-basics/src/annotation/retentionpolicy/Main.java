package annotation.retentionpolicy;

public class Main {
    public static void main(String[] args) {
        Class getClass = TestClass.class;
        //this is how we can get the annotation used
        //only annotation that is present in runtime will be find
        System.out.println(getClass.getAnnotation(CustomAnnotation.class));
    }
}
