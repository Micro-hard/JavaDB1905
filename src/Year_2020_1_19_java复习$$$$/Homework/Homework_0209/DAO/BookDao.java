package Year_2020_1_19_java复习$$$$.Homework.Homework_0209.DAO;

import Year_2020_1_19_java复习$$$$.Homework.Homework_0209.VO.Book;

import java.util.List;

public interface BookDao {
    /**
     * 插入一本书
     * @param book ：被插入的用户对象
     */
    public void insert(Book book);


    /**
     * 修改一本书：
     * @param book：被修改的BOOK对象
     */
    public void update(Book book);

    /**
     * 根据图书编号删除多个BOOK
     * @param ids：被删除的用户编号数组
     */
    public void delete(int[] ids);

    /**
     * 查询所有的图书，将查询出的BOOK存储在List中
     * @return :所有图书对象的集合
     */
    public List<Book> getAll();

    /**
     * 查询某一页的Book
     * @param pagesize：每页的记录条数
     * @param pageOrder：页号（即第几页）
     * @return
     */
    public List<Book> getBookForPage(int pagesize,int pageOrder);


    /**
     * 根据图书编号，查询出此编号对应的图书
     * @return
     */
    public Book getBookById(int id);

}
