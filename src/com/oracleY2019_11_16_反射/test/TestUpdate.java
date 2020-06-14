package com.oracleY2019_11_16_反射.test;


import com.oracleY2019_11_16_反射.dao.Bookdao;
import com.oracleY2019_11_16_反射.vo.Book;

public class TestUpdate {
    public static void main(String[] args) {
    Book b=new Book(4,"数学之美","吴军",50);
    Bookdao.update(b);
    }
}
