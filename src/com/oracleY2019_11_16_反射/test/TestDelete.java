package com.oracleY2019_11_16_反射.test;

import com.oracleY2019_11_16_反射.dao.Bookdao;
import com.oracleY2019_11_16_反射.vo.Book;

public class TestDelete {
    public static void main(String[] args) {

        Bookdao.delete(Book.class, 12134);
    }
}
