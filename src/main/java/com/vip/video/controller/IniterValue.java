package com.vip.video.controller;

import java.lang.annotation.*;

@Documented
@Inherited
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IniterValue {
    public String value() default "";
}
