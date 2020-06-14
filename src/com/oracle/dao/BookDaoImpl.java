package com.oracle.dao;

import com.oracle.common.Converter;
import com.oracle.common.JdbcTools;
import com.oracle.vo.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao{
    private static String SQL_INSERT="insert into book(bookName,author,price) values(?,?,?)";
    private static String SQL_DELTTE="delete from book where bookid=?";
    private static String SQL_UPDATE="update book set bookName=?,author=?,price=? where bookid=?";
    private static String SQL_SELECTALL="select * from book order by bookid";
    private static String SQL_SELECTBYID="select bookid,bookName,author,price from book where bookid=?";
    private static String SQL_SELECT_FOR_PAGE="select bookid,bookName,author,price from book limit ?,?";
    private static Integer PAGE_SIZE=2;//每页2条
    @Override
    public void insert(Book book) {
        /*try(Connection con=JdbcTools.getConnection();
            PreparedStatement ps=con.prepareStatement(SQL_INSERT)){
            //给ps复制并执行
            ps.setString(1,book.getName());
            ps.setString(2,book.getAuthor());
            ps.setObject(3,book.getPrice());
            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
        }*/
        JdbcTools.execute(SQL_INSERT,book.getName(),book.getAuthor(),book.getPrice());//简化的
    }

    @Override
    public void update(Book book) {
        try(Connection con=JdbcTools.getConnection();
            PreparedStatement ps=con.prepareStatement(SQL_UPDATE)){
            ps.setString(1,book.getName());
            ps.setString(2,book.getAuthor());
            ps.setInt(3,book.getPrice());
            ps.setInt(4,book.getBookid());
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Book getBookById(int bookid) {
        try(Connection con=JdbcTools.getConnection();
            PreparedStatement ps=con.prepareStatement(SQL_SELECTBYID);
            ){

            ps.setInt(1,bookid);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){//如果有记录
                Book b=new Book();
                b.setBookid(rs.getInt("bookid"));
                b.setName(rs.getString("bookName"));
                b.setAuthor(rs.getString("author"));
                b.setPrice(rs.getInt("price"));
                return b;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Book> getBooksForPage(int pageNum) {//按照页号查询
        List<Book> list=new ArrayList<Book>();
        try(Connection con=JdbcTools.getConnection();
            PreparedStatement ps=con.prepareStatement(SQL_SELECT_FOR_PAGE)){
            //为sql语句的参数赋值
            ps.setInt(1,(pageNum-1)*PAGE_SIZE);//起始位置
            ps.setInt(2,PAGE_SIZE);//size
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Book b=new Book();
                b.setBookid(rs.getInt("bookid"));
                b.setName(rs.getString("bookName"));
                b.setAuthor(rs.getString("author"));
                b.setPrice(rs.getInt("price"));
                list.add(b);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void delete(int bookid) {
        try(Connection con=JdbcTools.getConnection();
            PreparedStatement ps=con.prepareStatement(SQL_DELTTE)){
            ps.setInt(1,bookid);
            //ps.execute();
            int i=ps.executeUpdate();//多少条记录
            System.out.println("删除成功"+i);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Book> getAll() {
        /*List<Book> list=new ArrayList<Book>();
        try(Connection con=JdbcTools.getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL_SELECTALL);){
            while (rs.next()){
                //list.add(new Book(rs.getInt("bookid"),rs.getString("bookName"),rs.getString("authou"),rs.getInt("price")));
                Book b=new Book();
                b.setBookid(rs.getInt("bookid"));
                b.setName(rs.getString("bookName"));
                b.setAuthor(rs.getString("author"));
                b.setPrice(rs.getInt("price"));
                list.add(b);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return list;*/
        return JdbcTools.query("select * from book",new BookConverter());
    }
    //自定义的转换器，将rs中的记录转成Book
    class BookConverter implements Converter<Book>{

        @Override
        public Book convert(ResultSet rs) throws SQLException {
            Book book=new Book();
            book.setBookid(rs.getInt("bookid"));//.....
            return book;
        }
    }
}
