package Year_2019_8_5_Calendar_SimpleDateFormat;

import Year_2019_7_24_extend.C;
import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getTime());
        long tmp=c.getTimeInMillis();
        c.set(2019,9,1);
        //c.add(Calendar.MONTH,5);             //
        
        //System.out.println((c.getTimeInMillis()-tmp)/1000/60/60/24);
        CalendarDemo.getDaysByDate(2019,10,1);
        System.out.println(CalendarDemo.getDaysByDate1(2019,10,1));


        Date date=new Date();             /////////////////java的SimpleDateFormat包帮我们规范格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月DD日hh时mm分ss秒");
        System.out.println(sdf.format(date));
        DecimalFormat df=new DecimalFormat("$###,###");
        System.out.println(df.format(33487000));
             // print();    兔子的题

        CalendarDemo.riLi(2019,9);
        String[] arrays={"a","s","d","f","g","h"};
        System.out.println(StringUtils.join(arrays,"\t"));

    }
    public static int getDaysByDate(int year,int month,int date){////方法一
        Calendar c=Calendar.getInstance();
        long tmp=c.getTimeInMillis();
        c.set(year,month-1,date);  //c.add(Calendar.MONTH,5);             //
        System.out.println((c.getTimeInMillis()-tmp)/1000/60/60/24);
        return (int)(c.getTimeInMillis()-tmp)/1000/60/60/24;
    }
    public static int getDaysByDate1(int year,int month,int date){/////方法二
        int days=0;
        Calendar now=Calendar.getInstance();
        Calendar future=Calendar.getInstance();
        future.set(year,month-1,date);
        do{
            now.add(Calendar.DATE,1);
            days++;
        }while(!(now.get(Calendar.YEAR)==future.get(Calendar.YEAR)&&now.get(Calendar.MONTH)==future.get(Calendar.MONTH)&&now.get(Calendar.DATE)==future.get(Calendar.DATE)));
        return days;
    }
    public static void print(){///兔子 的题
        int n=0;
        int m1=2;
        int m2=0;
        for(int i=1;i<=20;i++){
            n=n+m2;
            m2=m1;
            m1=n;
            System.out.println("第"+i+"月:"+n);
        }
    }
    public static void riLi(int year,int month){/////8月6日作业  模仿日历
        Calendar calender=Calendar.getInstance();
        calender.set(year,month-1,1);  ///月从0开始
        int tmp;///先输出几个空格
        tmp=calender.get(Calendar.DAY_OF_WEEK);//1~7  周日到周六
        System.out.println(tmp);
        System.out.println("日 一 二 三 四 五 六");
        for (int i=0;i<tmp-1;i++){
            System.out.print("   ");
        }
        for (int i=1;i<=calender.getActualMaximum(Calendar.DAY_OF_MONTH);i++){//最大日期数量
            System.out.printf("%2d ",i);
            if (i+tmp==8||(i-(8-tmp))%7==0){   //i+tmp得等于8
                System.out.println();
            }

        }
    }
}
