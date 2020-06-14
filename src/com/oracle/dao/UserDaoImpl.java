package com.oracle.dao;

import com.oracle.common.JdbcTools;
import com.oracle.vo.User;

public class UserDaoImpl implements UserDao{
    @Override
    public void insert(User user) {
        JdbcTools.execute("insert into sys_user values(?,?,?)",user.getUserid(),user.getUserName(),user.getRemain());
    }

    @Override
    public void update(User user) {
        JdbcTools.execute("update sys_user set userName=?,remain=? where userid=?",user.getUserName(),user.getRemain(),user.getUserid());
    }

    @Override
    public void delete(int userid) {
        JdbcTools.execute("delete from sys_user where userid=?",userid);
    }
}
