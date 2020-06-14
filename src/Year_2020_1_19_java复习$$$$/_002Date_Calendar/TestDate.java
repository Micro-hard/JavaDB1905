package Year_2020_1_19_java复习$$$$._002Date_Calendar;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date d=new Date(1);//util包
        Date today=new Date();
        System.out.println(today.after(d));//在d之后
        System.out.println(today);//一样的
        System.out.println(today.toString());//一样的
    }
}
