package com.oracleY2019_11_16_反射.vo;

import java.lang.reflect.Field;

public class TestField {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //访问私有成员
        Book b=new Book(8,"思考快与慢","丹尼尔",10);
        //1.获得属性，
        // 2.调用setAccessible（true） 改变可访问性
        //3.通过get，set来访问属性
        Class c=b.getClass();

        Field f=c.getDeclaredField("author");

        //先获得b的author属性
        //以前   对象.属性  b.author
        //现在   属性.对象
        f.setAccessible(true);
        Object author=f.get(b);
        System.out.println(author);
        f.set(b,"吴军");
        System.out.println(b);
    }
}
