package Year_2019_8_13_多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test002 implements Callable {
    @Override
    public Object call() throws Exception {
        int i=0;
        for (;i<100;i++){
            Thread.sleep(50);
            System.out.println(Thread.currentThread().getName()+"下载了："+i+"%");
        }
        System.out.println(Thread.currentThread().getName()+"下载OK");
        return null;
    }



    public static void main(String[] args) {
        Callable c=new test002();
        FutureTask futureTask=new FutureTask(c);
        FutureTask futureTask1=new FutureTask(c);
        Thread thread=new Thread(futureTask,"线程一");
        Thread thread1=new Thread(futureTask1,"线程二");
        thread.start();
        thread1.start();
//        try {
//            System.out.println(futureTask.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
    }
}
