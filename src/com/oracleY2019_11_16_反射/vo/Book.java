package com.oracleY2019_11_16_反射.vo;

import com.oracleY2019_11_16_反射.annotation.PrimaryKey;
import com.oracleY2019_11_16_反射.annotation.Table;

import java.util.Objects;

@Table("Book")
public class Book {
    @PrimaryKey
    public  int bookid;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getBookid() == book.getBookid() &&
                getPrice() == book.getPrice() &&
                Objects.equals(getName(), book.getName()) &&
                Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getBookid(), getName(), getAuthor(), getPrice());
    }

    protected String name;
    private String author;
    private int price;
    public Book(){//必须有无参构造方法
        super();
    }
    public Book(int bookid, String name, String author, int price) {
        this.bookid=bookid;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBookid() {
        return bookid;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
