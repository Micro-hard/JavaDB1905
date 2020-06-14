package com.oracle.test;

import com.oracle.common.JdbcTools;

import java.sql.*;

public class TestMetaData {
    public static void main(String[] args) {
        //元数据的测试，获得结果集的列数，列明，数据类型
        query("select * from book");
        query("select bookName,price from book");
        query("select count(*) c from book");
        System.out.println(Types.INTEGER);
    }

    /**
     * 执行sql，输入执行结果的含义
     * @param sql:sql语句
     */
    public static void query(String sql){//AutoCloseable
        try(Connection con=JdbcTools.getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql)){
            //获得查询结果的元数据
            ResultSetMetaData rsmd=rs.getMetaData();//描述数据的数据  描述的是结果集的描述信息
            int count=rsmd.getColumnCount();//结果集列的数量
            System.out.println(sql+"结果集中列的数量"+count);
            for (int i=1;i<=count;i++){
                System.out.print(rsmd.getColumnName(i)+"\t");//结果集原始列名
                //System.out.print(rsmd.getColumnLabel(i)+"\t");//结果集修改后的列名(别名)
            }
            System.out.println();

            /*for (int i=1;i<=count;i++){
                System.out.print(rsmd.getColumnType(i)+"\t");//结果集列类型(数字形式)1 2 3   4 5
                System.out.print(rsmd.getColumnTypeName(i)+"\t");//结果集列类型（字符串形式） int....
            }
            System.out.println();*/

            //输出结果
            while(rs.next()){//有count就知道有几列了
                for (int i=1;i<=count;i++){
                    System.out.print(rs.getObject(i)+"\t");
                }
                System.out.println();
            }
        }catch (Exception e){

        }
    }
}
