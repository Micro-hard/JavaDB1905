package com.oracleY2019_11_16_反射.test;

import com.oracleY2019_11_16_反射.dao.Bookdao;
import com.oracleY2019_11_16_反射.vo.Book;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestDao {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Book book=new Book(8,"思考快与慢","丹尼尔",10);
        //Bookdao.insert(book);

        //通过反射调用类中私有方法
        //1.获得方法
        Method m=book.getClass().getDeclaredMethod("setAuthor",String.class);//想调用叫getname的没有参数的方法
        m.setAccessible(true);
        //2.调用方法
        m.invoke(book,"余华");
        System.out.println(book);
        System.out.println();
        }

    /**
     * 显示一个类中所有的方法
     * @param c
     */
    public static void showMethodInfo(Class c) {//输出方法的修饰符，返回值类型，名，参数
        Method[] ms = c.getMethods();
        for (Method m : ms) {
            System.out.println(Modifier.toString(m.getModifiers()) + " " + m.getReturnType() + " " + m.getName());// m.getModifiers()返回整数形式的修饰符，Modifier.toString(m.getModifiers())字符串形式的
            Class[] ps = m.getParameterTypes();
            for (Class cp : ps) {
                System.out.print("  " + cp.getSimpleName());
            }
            System.out.println();
        }
    }
}
