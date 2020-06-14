package com.oracleY2019_11_16_反射.test;

import com.oracleY2019_11_16_反射.vo.Book;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestReflect2 {
    public static void main(String[] args) {
        //showInfo(new ArrayList());
        //showInfo(new LinkedList());//实现了Deque接口，
        showInfo(new int[8]);
    }

    /**
     * 输出当前对象的类信息
     * @param obj
     */
    public static void showInfo(Object obj){
        //获得类名
        Class c=obj.getClass();
        System.out.println(c.getName());
        System.out.println("类名"+c.getSimpleName());
        System.out.println("包"+c.getPackage());
        System.out.println("父类"+c.getSuperclass());
        Class[] cs=c.getInterfaces();
        if (cs.length!=0){
            for (Class ci:cs){
                System.out.println(ci.getName());
            }
        }else {
            System.out.println("没实现任何接口");
        }
        //判断是否是哟个数组
        if (c.isArray()){
            System.out.println("是数组,数组中元素："+c.getComponentType());//得到类型
        }else {
            System.out.println("不是数组");
        }
        System.out.println(int.class.isPrimitive());//是否是一个基本数据类型

        //匿名类
        //System.out.println(A.class.isMemberClass());
        System.out.println(new Runnable() {
            @Override
            public void run() {

            }
        }.getClass().isAnonymousClass());//是不是一个匿名类true

        System.out.println(A.class.getModifiers());//没有修饰符

        int i=A.class.getModifiers();
        System.out.println(Modifier.isFinal(i));
    }
    public static final class A{

    }

}
