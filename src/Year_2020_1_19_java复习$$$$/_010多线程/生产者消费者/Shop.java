package Year_2020_1_19_java复习$$$$._010多线程.生产者消费者;

import java.util.Random;


/**
 *商场类
 *
 */
public class Shop {
    int sum=0;//面包的数量
    Random r=new Random();//随机制作面包和卖面包

    //生产面包
    public synchronized void make(){
        //如果有面包，不生产
        if(sum!=0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            //生产面包
            sum=r.nextInt(20)+1;
            System.out.println("-------生产面包数"+sum);
            //唤醒其它线程；
            this.notify();
            try {
                this.wait();//释放锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //卖面包
    public synchronized void sale(){
        if(sum==0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            int va=r.nextInt(sum)+1;
            System.out.println("消费面包:"+va);
            sum-=va;

            if(sum==0){
                this.notify();
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
