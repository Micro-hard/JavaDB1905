package com.oracleY2019_11_23_Annotation;

import com.oracleY2019_11_23_Annotation.vo.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class test {
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    public static void main(String[] args) {
        int i=0;
        List list=new ArrayList();
        list.add("张无忌");
        Book b=new Book(23,"自卑与超越");
        System.out.println(b);
        b.save(b);

        Date date=new Date();
        System.out.println(date.getDate());//过期的方法
    }
}
