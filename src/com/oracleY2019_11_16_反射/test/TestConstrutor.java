package com.oracleY2019_11_16_反射.test;

import com.oracleY2019_11_16_反射.vo.Book;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestConstrutor {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        showInfo(Book.class);
//        Constructor c=Book.class.getConstructor(int.class,String.class,String.class,int.class);//调用构造方法
//        Object obj=c.newInstance(10,"数学之美","吴军",100);
//        System.out.println(obj);
        Object obj=Book.class.newInstance();//无参构造方法
        System.out.println(obj);
    }
    public static void showInfo(Class clazz){
        Constructor[] cc=clazz.getDeclaredConstructors();
        System.out.println(cc.length);
        for (Constructor c:cc){//遍历构造器
            Class[] type=c.getParameterTypes();
            for (Class t:type){//遍历参数
                System.out.print(t.getSimpleName()+" ");//输出构造器的参数
            }
            System.out.println();
        }
    }
}
