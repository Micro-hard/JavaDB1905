package Year_2020_1_19_java复习$$$$._010多线程.生产者消费者.test;

import java.util.Random;

public class Shop {
    int count;
    Random random=new Random();


    public synchronized void make(){
        if(count!=0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            count=random.nextInt(10)+1;//一个到十个
            System.out.println("生产者生产了："+count);
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void sale(){
        if(count==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            int ran=random.nextInt(count)+1;
            System.out.println("消费者消费了"+ran);
            count-=ran;
            if(count==0){
                notify();
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
