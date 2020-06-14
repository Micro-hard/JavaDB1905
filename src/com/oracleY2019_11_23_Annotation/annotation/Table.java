package com.oracleY2019_11_23_Annotation.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//需要用RUNTIME  才可以用反射来操作。。。
@Target(ElementType.TYPE)//给类用
public @interface Table {
    String value();
}
