package Year_2020_1_19_java复习$$$$._002Date_Calendar;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.getTime());//   getTime() 将日历转成Date
        c.add(Calendar.DATE,1);  //加两天   当前基础上增加
        System.out.println(c.getTime());
        c.add(Calendar.YEAR,-2);//减两年
        System.out.println(c.getTime());

        c.set(Calendar.YEAR,1998);  //直接修改
        System.out.println(c.getTime());

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));//日一二三四五六
        System.out.println(c.get(Calendar.DAY_OF_YEAR));//当前是今年的第几天
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));
    }
}
