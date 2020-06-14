package Year_2019_8_12_多线程;

public class RunnableDemo implements Runnable{//第二种创建线程的方式     这两种方法缺陷得不到返回值
    @Override
    public void run() {
        System.out.println("线程体");
    }

    public static void main(String[] args) {
        RunnableDemo r1=new RunnableDemo();
        Thread t1=new Thread(r1,"线程1");
        Thread t2=new Thread(r1,"线程2");
        t1.start();
       // t1.start();

    }
}
