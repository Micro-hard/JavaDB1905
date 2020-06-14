package Year_2019_8_12_多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class test001 implements Callable {   //或者建两个类 分别实现Runnable接口 run里写方法     这里用的构造方法传进call里，
    private boolean isJishu;
    public test001(boolean isJishu) {
        this.isJishu=isJishu;
    }


    @Override
    public Object call() throws Exception {
        int i=0;
        if (isJishu)
             for (;i<=10;i+=2){
                System.out.println(i);
             }
        else
            for (i=1;i<=10;i+=2){
                if (i%2!=0){
                    System.out.println(i);
                }
            }
        return null;
    }

    public static void main(String[] args) {
        Callable c1=new test001(true);
        Callable c2=new test001(false);
        FutureTask futureTask=new FutureTask(c1);
        FutureTask futureTask1=new FutureTask(c2);
        Thread t1=new Thread(futureTask,"线程一");
        Thread t2=new Thread(futureTask1,"线程二");
        t1.start();
        t2.start();
        /*int i=0;
        for (;i<=10;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }*/
    }
}
