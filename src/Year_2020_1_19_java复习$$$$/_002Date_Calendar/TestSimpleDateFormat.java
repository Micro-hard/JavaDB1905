package Year_2020_1_19_java复习$$$$._002Date_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestSimpleDateFormat {
    public static void main(String[] args) {
        //指定格式的对象  日期->这种格式的字符串 或者  字符串->日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  //可以只写一个M 对月份没有影响，
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd 第D天");  //可以只写一个M 对月份没有影响，

        /*Date date=new Date();
        Calendar c=Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MONTH,10);
        date=c.getTime();
        String s=sdf.format(date);
        System.out.println(s);*/

        //将日期转字符串
        Date d=new Date();
        String str=sdf.format(d);//自己定义的格式
        System.out.println(str);

        //将字符串转成日期
        Date birth=null;
        try {  //如果月份填22，年分自动加，不会出错,,字符串的格式要和sdf的一致  和数字的位数无关（年填10000也没事），但是 -两侧的数字 个数 不能少(年-月-日必须对应 yyyy-MM-dd)
            birth=sdf.parse("1999-22-20");
            System.out.println(birth+"test");
        } catch (ParseException e) {
            e.printStackTrace();
        }


        getAge(birth);
    }

    public static int getAge(Date date){//获取年龄
        int age=0,year=0;
        Calendar calendar=Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);//当前年份
        System.out.println(year);
        calendar.setTime(date);//date->calendar
        age=year-calendar.get(Calendar.YEAR);
        System.out.println("你今年"+(age+1)+"岁");
        return age;
    }
}
