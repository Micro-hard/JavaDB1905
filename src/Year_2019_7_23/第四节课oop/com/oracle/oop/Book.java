package Year_2019_7_23.第四节课oop.com.oracle.oop;

import java.util.Scanner;

public class Book {
    private int pageCount;//页数
    private String name;
    private double price;
    private String name1;

    public void setPageCount(int pc){
        this.pageCount=pc;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName1() {
        return name1;
    }

    public int getPageCount() {
        return pageCount;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    void fire(){
        System.out.println("shit");
    }

    /**
     * 打折
     * @param sale 几折
     */
    double discount(double sale){
        return price*sale;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Book book=new Book();
        book.setName("java编程思想");
        book.setPageCount(800);
        book.setPrice(108);
        System.out.println("折后:"+book.discount(0.6));
        System.out.println("请输入名：");
        book.setName1(scanner.next());
        System.out.println(book.name1);
    }
}
