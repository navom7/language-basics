package annotation.repeatable;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class eagleClass = Eagle.class;
        Annotation[] categoriesName = eagleClass.getAnnotationsByType(Category.class);
        for(Annotation c: categoriesName) {
            System.out.println(c.annotationType());

        }
    }
}
