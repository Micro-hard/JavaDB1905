package com.oracleY2019_11_16_反射.test;

import com.oracleY2019_11_16_反射.vo.Book;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class test01 {
    public static void main(String[] args) throws ClassNotFoundException {

        //Class是反射的入口（类实例）

        //showMethodInfo(String.class);
        Class c=Book.class;
        System.out.println(c.getName());//绝对包名
        System.out.println(c.getPackage().getName());//getname（）后就没有packa了，
        System.out.println(c.getSimpleName());//只是类名
        System.out.println(c.getModifiers());//public
        System.out.println(c.getSuperclass());//父类  只有object没有父类，返回null

        Class[] cs=String.class.getInterfaces();
        System.out.println(cs.length);
        //***********************
        Class c1=Class.forName("com.oracleY2019_11_16_反射.vo.Book");//需要抛出异常，又可能写错
        System.out.println(c==c1);//一个类只加载一次，只有一个类实例

        Object o=new Book();
        Class c2=o.getClass();
        System.out.println(c==c2);
    }

}
