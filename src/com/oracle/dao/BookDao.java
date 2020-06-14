package com.oracle.dao;

import com.oracle.vo.Book;

import java.util.List;

//dao接口，定义了Book对象的所有数据库访问操作（CURD）
public interface BookDao {
    public void insert(Book book);
    public void update(Book book);
    public void delete(int bookid);
    public List<Book> getAll();//查询所有图书
    public Book getBookById(int bookid);//根据图书id查询
    public List<Book> getBooksForPage(int pageNum);//分页查询第n页的图书
}
