package Year_2020_1_19_java复习$$$$.Homework.Homework_0209.VO;

public class Book {
    int bookno;//图书编号
    String name;//书名
    String title;//作者
    int price;//价格
    int count;//数量

    @Override
    public String toString() {
        return "Book{" +
                "bookno=" + bookno +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

    public Book(int bookno, String name, String title, int price, int count) {
        this.bookno = bookno;
        this.name = name;
        this.title = title;
        this.price = price;
        this.count = count;
    }

    public Book() {

    }

    public void setBookno(int bookno) {

        this.bookno = bookno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getBookno() {

        return bookno;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}
