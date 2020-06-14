package com.oracleY2019_11_16_反射.dao;

import com.oracleY2019_11_16_反射.annotation.PrimaryKey;
import com.oracleY2019_11_16_反射.annotation.Table;

import java.sql.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Bookdao {
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static Connection getConnection(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/transaction","root","");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void insert(Object obj){
        //1.生成sql  2.执行sql
        Class c=obj.getClass();
        Field[] fs=c.getDeclaredFields();
        StringBuffer sb1=new StringBuffer("insert into "+c.getSimpleName()+"(");
        StringBuffer sb2=new StringBuffer(") values(");
        for (Field f:fs){
            sb1.append(f.getName()+",");
            sb2.append("?,");
        }
        String sql=sb1.toString().substring(0,sb1.length()-1)+sb2.toString().substring(0,sb2.length()-1)+")";
        System.out.println(sql);
        try(Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement(sql);){
            //给点位赋值
            for (int i=0;i<fs.length;i++){
                fs[i].setAccessible(true);
                ps.setObject(i+1,fs[i]);
            }
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static <T> List<T> getAll(Class<T> clazz){
        List<T> list=new ArrayList<T>();
        //生成sql
        String sql="select * from "+clazz.getSimpleName();
        try (Connection con=getConnection();
             Statement sta=con.createStatement();
             ResultSet rs=sta.executeQuery(sql)){

             Field[] fs=clazz.getDeclaredFields();

            //转换1.创建对象
            while(rs.next()){
                T t=clazz.newInstance();//调用无参构造方法，创建当前类型的实例
                //给各个属性赋值
                for (Field f:fs){
                    f.setAccessible(true);
                    //赋值
                    if (f.getType()==int.class||f.getType()==Integer.class){
                        f.set(t,rs.getInt(f.getName()));
                    }else {
                        f.set(t,rs.getObject(f.getName()));
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return list;
    }

    /**
     * 删除表中的数据
     * @param key
     */
    public static void delete(Class<?> clazz,Object key){
        //生成sql；  delete from 表明  where  主键=？
        //1.找出主键的属性
        Field[] fs=clazz.getDeclaredFields();
        Field pkField=null;
        for (Field f:fs){//遍历属性
            if (f.isAnnotationPresent(PrimaryKey.class)){//如果这个属性有注解   找出主键注解的那个属性
                System.out.println("是主键那个注解");
                pkField=f;
                f.setAccessible(true);
                break;
            }
        }
        //2.生成sql
        String sql=null;
                  //判断这个类有没有注解，来得到表明  ⬇
        Table table=clazz.getAnnotation(Table.class);//不加泛型返回类型是annotation的,需要强转
        if (table!=null){//有注解用注解的
            sql="delete from "+table.value()+"where "+pkField.getName()+"=?";
        }else {//没有用类名    来获得表明
            sql="delete from "+clazz.getSimpleName()+" where "+pkField.getName()+"=?";
        }
        System.out.println(sql);
        //执行sql
        try(Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement(sql);){
            ps.setObject(1,key);
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    /**
     * 对vo进行修改
     * @param obj
     */
    public static void update(Object obj){
        //update 表名 set 属性=？,属性=？,... where 主键=？
        //1.将属性分别存到两个List<Fiele>中
        //2.生成sql
        //3.执行sql

        //1.获得Class
        Class<?> c=obj.getClass();
        List<Field> columnList=new ArrayList<Field>();//非主键属性
        List<Field> pkList=new ArrayList<Field>();//主键属性
        Field[] fs=c.getDeclaredFields();
        for (Field f:fs){
            f.setAccessible(true);
            if (f.isAnnotationPresent(PrimaryKey.class)){
                pkList.add(f);
            }else {
                columnList.add(f);
            }
        }
        //2.生成sql
        StringBuffer sb=new StringBuffer("update ");
        Table t=c.getAnnotation(Table.class);//看看类有没有注解，得到表表名
        if (t==null){
            sb.append(c.getSimpleName()+" set");
        }else{
            sb.append(t.value()+"set");
        }
        for(int i=0;i<columnList.size();i++){
            if (i==0){  //  逗号
                sb.append(columnList.get(i).getName()+"=?");
            }else {
                sb.append(","+columnList.get(i).getName()+"=?");
            }
        }
        //连接where
        sb.append(" where "+pkList.get(0).getName()+"=?");
        //测试
        System.out.println(sb.toString());
        //3.执行sql
        try(Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement(sb.toString());){

            //i
            int index=1;
            for (Field f:columnList){//给非主键属性赋值
                ps.setObject(index++,f.get(obj));
            }
            //给主键赋值
            ps.setObject(index++,pkList.get(0).get(obj));
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /*public static void delete1(Class<?> clazz,Object key){
        //生成sql；  delete from 表明  where  主键=？
        //1.找出主键的属性
        Field[] fs=clazz.getDeclaredFields();
        Field f=null;
        for (Field ff:fs){
            if (ff.isAnnotationPresent(PrimaryKey.class)){
                f=ff;
                ff.setAccessible(true);
            }
        }
        //2.生成sql
        String sql=null;
        Table table=clazz.getAnnotation(Table.class);
        if (table!=null){
            sql="delete from "+table.value()+"where "+f.getName()+"+?";
        }else {
            sql="delete from "+clazz.getSimpleName()+"where "+f.getName()+"+?";
        }
        //执行sql
    }*/
}
