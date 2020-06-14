package Year_2019_8_12_多线程;

import javax.swing.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int i=0;
        for (;i<100;i++){
            System.out.println("i="+i);
        }
        return i;
    }

    public CallableDemo() {
    }

    public static void main(String[] args) {
        Callable c1=new CallableDemo();
        FutureTask futureTask=new FutureTask(c1);//桥梁等返回值的
        Thread t1=new Thread(futureTask,"线程一");//他是创建线程
        t1.start();
        try {
            System.out.println(futureTask.get());  //get方法一定是在写在线程启动后
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("主线程中的代码。。。");
        //一个线程输出技术，一个线程输出偶数
    }
}
