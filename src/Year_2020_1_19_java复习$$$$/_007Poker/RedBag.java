package Year_2020_1_19_java复习$$$$._007Poker;

import java.util.*;
/**
 * 模拟红包
 */
public class RedBag {
    int sum;//红包总钱数  (几分钱)
    int number;//红包个数
    int index=1;//第几个红包

    List<Integer> list=new ArrayList<Integer>();

    public RedBag(int sum,int number){  //钱，人
        if(sum<number){
            throw new RuntimeException("每个红包不能低于一分钱！");
        }
        this.sum=sum;
        this.number=number;

        //计算每个红包的钱数
        Set<Integer> set=new TreeSet<Integer>();//不重复且有序
        Random random=new Random();
        do{
            set.add(random.nextInt(sum-1)+1);  //从一分钱 到 总钱数减去一分钱
        }while (set.size()<number-1);
        set.add(0);
        set.add(sum);

        list.addAll(set);
        System.out.println(list);//[0, 6, 7, 11, 14, 20]  第一个人6分，第二个人1分，最后一个人6分
    }

    public void open(){
        if(index>number){
            System.out.println("你来晚了，红包已经被抢光了!");
            return;
        }
        System.out.println("你是第:"+index+"个人抢到的");

        System.out.println(list.get(index)-list.get(index-1));

        index++;
    }
}
