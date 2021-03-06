package org.squirrelframework.foundation.fsm.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({METHOD})
@Retention(RUNTIME)
public @interface TransitionException {
    String causedBy() default "";
    Class<?> typeOf() default Object.class;
    Class<? extends Throwable> exception() default Throwable.class;
}
