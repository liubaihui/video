package com.vip.video.controller;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserFactory
 * @Author liubaihui
 * @Date 2019/4/24
 * @Version 1.0
 * @Describe
 **/
public class UserFactory {
    public static <T> T create(Class<T> t) throws IllegalAccessException, InstantiationException {
        T t1 = t.newInstance();
        Field[] fields = t1.getClass().getDeclaredFields();
        for (Field field:fields) {
            if(field.isAnnotationPresent(IniterValue.class)){
                IniterValue annotation = field.getAnnotation(IniterValue.class);
                try {
                    field.setAccessible(true);
                    Class<?> type = field.getType();
                    Object obj=null;
                    if(type == Integer.class){
                        obj = Integer.valueOf(annotation.value());

                    }
                    if(type==String.class){
                        obj=annotation.value();
                    }
                    field.set(t1,obj);

                   // method.invoke(t1,annotation.value(),annotation.intValue());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return t1;

    }
}
