package Year_2020_1_19_java复习$$$$.Homework.Homework_0209;

import Year_2020_1_19_java复习$$$$.Homework.Homework_0209.DAO.BookDao;
import Year_2020_1_19_java复习$$$$.Homework.Homework_0209.DAO.BookDaoImpl;
import Year_2020_1_19_java复习$$$$.Homework.Homework_0209.VO.Book;

public class DaoTest {
    public static void main(String[] args) {
        BookDaoImpl dao=new BookDaoImpl();
        dao.insert(new Book(0,"西游记","吴承恩",100,10));//测试insert
        dao.update(new Book(0,"西游记","吴承恩",500,10));//测试update
        int[] test={0,1,2,3};
        dao.delete(test);  //测试delete

        for(Book book:dao.getAll()){   //测试getAll
            System.out.println(book);
        }

        Book b=dao.getBookById(1);
        System.out.println(b);//测试getBookById

        for(Book book:dao.getBookForPage(0,2)){//测试getBookForPage
            System.out.println(book);
        }
    }
}
