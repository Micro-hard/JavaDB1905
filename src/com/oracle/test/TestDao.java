package com.oracle.test;

import com.oracle.dao.BookDao;
import com.oracle.dao.BookDaoImpl;
import com.oracle.vo.Book;

import java.util.List;

public class TestDao {
    public static void main(String[] args) {
        BookDao dao=new BookDaoImpl();

        //Book b=new Book(4,"童年的秘密","蒙台梭利",70);

        //dao.insert(b);

        //dao.delete(4);
        //dao.update(b);


        List<Book> list=dao.getAll();
        for (Book b:list){
            System.out.println(b);
        }
        System.out.println("---------------------------------------------");
        //System.out.println(dao.getBookById(1));
       list=dao.getBooksForPage(2);//分页测试
        for (Book b:list){
            System.out.println(b);
        }
    }
}
