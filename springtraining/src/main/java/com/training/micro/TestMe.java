package com.training.micro;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target({
          TYPE,
          FIELD,
          METHOD
})
public @interface TestMe {

    String testStr();

    int testVal();

    double amount() default 0.1D;
}
