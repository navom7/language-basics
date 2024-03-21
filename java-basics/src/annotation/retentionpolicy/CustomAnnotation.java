package annotation.retentionpolicy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
//this will be available in runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
}
