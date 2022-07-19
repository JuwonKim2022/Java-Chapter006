package sec15.ex01_annotation;

import java.lang.annotation.*;


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {

	String value() default "-";
	int number() default 15;

}