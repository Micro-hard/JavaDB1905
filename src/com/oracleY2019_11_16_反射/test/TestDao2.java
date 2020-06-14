package com.oracleY2019_11_16_反射.test;

import com.oracleY2019_11_16_反射.dao.Bookdao;
import com.oracleY2019_11_16_反射.vo.Book;

import java.util.List;

public class TestDao2 {
    List<Book> list=Bookdao.getAll(Book.class);
}
