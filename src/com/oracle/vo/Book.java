package com.oracle.vo;

public class Book {
    private int bookid;
    private String name;
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
