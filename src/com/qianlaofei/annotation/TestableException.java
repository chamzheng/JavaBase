package com.qianlaofei.annotation;

import java.lang.annotation.*;

/**
 * Created by chamz on 2017-03-15.
 */
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestableException {
    Class<? extends Throwable>[] value();
}
