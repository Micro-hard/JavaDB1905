package Year_2019_9_16_软件测试;

import java.util.Scanner;

public class Test001 {
    public static int PreDate(int date){
        int year=0;
        int month=0;
        int day=0;
        if(date<0||date/100000000>=1){
            System.out.println("日期错误");
            System.exit(0);
        }
        year=date/10000;
        month=date%10000/100;
        day=date%10+date/10%10*10;
        if(year>2019||year<1000){
            System.out.println("请输入1000 年到2019 年之间的某个日期");
            System.exit(0);
        }
        if(month>12){
            System.out.println("月份错误");
            System.exit(0);
        }
        if(day<1||day>31){
            System.out.println("日期错误");
            System.exit(0);
        }
        int tmp=0;
        if((year%4==0)&&(year%100!=0)||(year%400==0)){//闰年
            tmp=29;
        }else{//平年
            tmp=28;
        }
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(day>31){
                    System.out.println("日期错误");
                    System.exit(0);
                }
                if(month==1){
                    if(day>1){
                        System.out.println(year+""+month+""+(day-1));
                    }else{
                        System.out.println((year-1)+""+12+""+31);
                    }
                    break;
                }
                if(month==3){
                    if(day>1){
                        System.out.println(year+""+month+""+(day-1));
                    }else{
                        System.out.println(year+""+(month-1)+""+tmp);
                    }
                    break;
                }
                if(month==8){
                    if(day>1){
                        System.out.println(year+""+month+""+(day-1));
                    }else{
                        System.out.println(year+""+(month-1)+""+31);
                    }
                    break;
                }
                if(day>1){
                    System.out.println(year+""+month+""+(day-1));
                }else{//day==0
                    System.out.println(year+""+(month-1)+""+30);
                }
                break;
            case 2:
                if(day>tmp){
                    System.out.println("日期错误");
                    System.exit(0);
                }
                if(day>1){
                    System.out.println(year+""+month+""+(day-1));
                }else{//day==0
                    System.out.println(year+""+(month-1)+""+"31");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(day>30){
                    System.out.println("日期错误");
                    System.exit(0);
                }
                if(day>1){
                    System.out.println(year+""+month+""+(day-1));
                }else{//day==0
                    System.out.println(year+""+(month-1)+""+"31");
                }
                break;
        }
        //System.out.println(year);
        //System.out.println(month);
        //System.out.println(day);
        return 0;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入8位数字：");
        int a=scanner.nextInt();
        PreDate(a);
    }
}
