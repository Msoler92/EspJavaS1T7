package n2i3exercici1.classes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JSONSerializable {
    String destinationPath() default "src/main/java/n2exercici1";
}
