package com.oracle.dao;

import com.oracle.vo.User;

public interface UserDao {
    public void insert(User user);
    public void update(User user);
    public void delete(int userid);
}
