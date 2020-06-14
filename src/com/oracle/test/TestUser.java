package com.oracle.test;

import com.oracle.dao.UserDao;
import com.oracle.dao.UserDaoImpl;
import com.oracle.vo.User;

public class TestUser {
    public static void main(String[] args) {
        User user=new User(2,"hahahaha",1000);
        UserDao dao=new UserDaoImpl();
        //dao.insert(user);
        //dao.update(user);
        dao.delete(2);
    }
}
