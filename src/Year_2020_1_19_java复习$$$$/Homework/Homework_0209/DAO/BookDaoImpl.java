package Year_2020_1_19_java复习$$$$.Homework.Homework_0209.DAO;

import Year_2020_1_19_java复习$$$$.Homework.Homework_0209.VO.Book;
import Year_2020_1_19_java复习$$$$.Homework.Homework_0209.common.Converter;
import Year_2020_1_19_java复习$$$$.Homework.Homework_0209.common.JdbcTools;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BookDaoImpl implements BookDao {

    @Override
    public void insert(Book book) {
        JdbcTools.execute("insert into book values(?,?,?,?,?)", null, book.getName(), book.getTitle(), book.getPrice(), book.getCount());
        System.out.println("插入成功");
    }

    @Override
    public void update(Book book) {
        JdbcTools.execute("update book set name=?,title=?,price=?,count=? where bookno=?", book.getName(), book.getTitle(), book.getPrice(), book.getCount(), book.getBookno());
        System.out.println("修改成功");
    }

    @Override
    public void delete(int[] ids) {
        String s=null;
        for(int i=0;i<ids.length;i++){
            s+=ids[i]+",";
        }
        s=s.substring(0,s.length()-1)+")";
        JdbcTools.executeSql("delete from book where bookno in ("+s);
    }

    @Override
    public List<Book> getAll() {
        return JdbcTools.query("select * from book",new BookConverter());
    }

    @Override
    public List<Book> getBookForPage(int pagesize, int pageOrder) {
        return JdbcTools.query("select * from book limit ?,?",new BookConverter(),pagesize,pageOrder);
    }

    @Override
    public Book getBookById(int id) {
        Book book=(Book)JdbcTools.query("select * from book where bookno=?",new BookConverter(),id);
        return book;
    }

    class BookConverter implements Converter<Book> {

        @Override
        public Book convert(ResultSet rs) throws SQLException {
            return new Book(rs.getInt("bookno"), rs.getString("name"), rs.getString("title"), rs.getInt("price"), rs.getInt("count"));
        }
    }
}
