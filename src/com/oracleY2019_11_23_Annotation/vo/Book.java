package com.oracleY2019_11_23_Annotation.vo;

import com.oracleY2019_11_23_Annotation.annotation.PrimaryKey;
import com.oracleY2019_11_23_Annotation.annotation.Table;

//图书实体类，对应book表     注释在 虚拟机的class 字节码 中是没有的

@Table("Book")  //可以利用注解来获得表名，因为有时候类名和表明不同
               //有注解就用注解，没有就用类名
public class Book {
    //图书编号，主键
    //@PrimaryKey(value = "bookid",type = "int")
    @PrimaryKey(name = {"bookid","id","isbn"})
    private Integer bookid;
    private String name;

    public Book(Integer bookid, String name) {
        this.bookid = bookid;
        this.name = name;
    }

    /**
     * 这个方法已经被。。。。替代
     * @param book
     */
    @Deprecated
    public void save(Book book){
        System.out.println("插入一本书"+this);//this就是toString方法
    }

    @Override
    public String toString(){    //可以检查有没有写错==

        return bookid+":"+name;
    }
}
