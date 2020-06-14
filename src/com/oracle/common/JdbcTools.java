package com.oracle.common;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcTools {
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/transaction","root","");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    /*******************************************************
     * 执行给定的sal，并使用args进行赋值
     * @param sql
     * @param args
     */
    public static void execute(String sql,Object...args){
        try(Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement(sql);){

            //给ps赋值
            for(int i=0;i<args.length;i++){
                ps.setObject(i+1,args[i]);//从零到n
            }
            //执行sql
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 执行查询sql的通用方法
     * @param sql
     * @param converter
     * @param args
     * @param <T>
     * @return
     */
    public static <T> List<T> query(String sql,Converter<T> converter,Object...args){
        List<T> list=new ArrayList<T>();

        try(Connection con=JdbcTools.getConnection();
            PreparedStatement ps=con.prepareStatement(sql)){
            //为sql赋值
            for (int i=0;i<args.length;i++){
                ps.setObject(i+1,args[i]);
            }
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                //回调用户传递的转换方法
                list.add(converter.convert(rs));//取一条记录，把一条记录转换成vo，执行次数：记录条数
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }
}
