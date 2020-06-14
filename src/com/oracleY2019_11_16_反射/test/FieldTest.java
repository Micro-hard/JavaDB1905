package com.oracleY2019_11_16_反射.test;

import com.oracleY2019_11_16_反射.vo.Book;
import com.oracleY2019_11_16_反射.vo.NewPaper;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldTest {
    public static void main(String[] args) throws NoSuchFieldException {
        //获得某个类的所有属性
        //Class c=Book.class;
        Class c=NewPaper.class;
        //获得当前类的属性
        //获得指定的属性；1.可访问的（包含父类继承来的，只有public）  2.当前类中定义的（公有，私有）
        //Field getField(String name);  Field getDeclaredField(String name);
        //获得所有属性
        //Field[] getFields(); Field[] getDeclaredFields();

//        Field[] fs=c.getFields();
//        for (Field f:fs){
//            System.out.println(Modifier.toString(f.getModifiers())+" "+f.getName()+" "+f.getType()+" "+f.getModifiers());
//        }

        Field f=c.getField("pages");
        System.out.println(f);
    }
}
