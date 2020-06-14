package com.oracleY2019_11_23_Annotation;

import com.oracleY2019_11_23_Annotation.annotation.Table;
import com.oracleY2019_11_23_Annotation.vo.Book;

public class TestDao {
    public static void main(String[] args) {
        Book b=new Book(23,"童年的秘密");
        insert(b);
    }

    public static void insert(Object obj){
        //生成一个sql  ;insert into 表名
        Class<?> c=obj.getClass();
        //判断c是否有@Table注解
        Table t=c.getAnnotation(Table.class);
        if (c.isAnnotationPresent(Deprecated.class)){
            System.out.println("过期的类，别用了");
        }
        if (t!=null){
            System.out.println("insert into "+t.value());
        }else {
            System.out.println("insert into "+c.getSimpleName());
        }
    }
}
