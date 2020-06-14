package Year_2019_8_5_Calendar_SimpleDateFormat;

import java.util.Date;

/**
 * java.util.Data类造成不要的java.sql.Date类混淆
 * date日期
 * data数据
 */
public class DateDemo {
    public static void main(String[] args) {
        Date now=new Date();
        System.out.println(now.toLocaleString());
        Date 年月日=new Date(1999-1900,12,20,8,18,18);
        System.out.println(now.getTime());
        System.out.println(年月日.toLocaleString());
        System.out.println(年月日.getYear());
        System.out.println(年月日.getMonth()+1);
        System.out.println(年月日.getDate());
        System.out.println("周"+年月日.getDay());
        System.out.println(年月日.getHours());
        System.out.println(年月日.getMinutes());
        System.out.println(年月日.getSeconds());
        System.out.println((now.getTime()-年月日.getTime())/24/60/60/1000+"天");
        Date date=new Date(9798788789784L);
        System.out.println(date);/////根据给的毫秒输出年月日
    }
}
