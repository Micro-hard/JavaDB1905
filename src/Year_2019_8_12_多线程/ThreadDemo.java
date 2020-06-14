package Year_2019_8_12_多线程;

public class ThreadDemo extends Thread{
    public ThreadDemo(String s) {
        super(s);
    }     //不可取，不能继承别的类了
    @Override
    public void run() {     //run方法是线程执行体
        for (int i=0;i<100;i++){
            try {

                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"---"+i);//获得当前线程名
        }
    }

    public static void main(String[] args) {
        ThreadDemo t1=new ThreadDemo("线程1");
        ThreadDemo t2=new ThreadDemo("线程2");
        t1.start();       //启动线程使用start
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        System.out.println("主线程中的代码");
    }
}
