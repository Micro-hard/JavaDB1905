package com.oracleY2019_11_23_Annotation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//          定义注解
@Retention(RetentionPolicy.RUNTIME)//存活时间
@Target({ElementType.FIELD,ElementType.TYPE})//设置 属性,类 可以添加注解
public @interface PrimaryKey {
    //String value();//对应的列名    value是默认的传参的时候可以不写value="..."
    //String type();//对应的类型
    //String type1() default "int";//默认值
    String[] name();
    /**    如果注解里写数组是可以用{}
     * @PrimaryKey(name={"bookid","id","isbn"})
     */


    //数据类型+成员名
}
