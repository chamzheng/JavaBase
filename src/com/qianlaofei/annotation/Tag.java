package com.qianlaofei.annotation;

import java.lang.annotation.*;

/**
 * Created by chamz on 2017-03-14.
 */
@Inherited
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface Tag {
    String name() default "改叫啥才好呢？";
    String description() default "这家伙很懒，啥也没留下...";
}

