package Year_2020_1_19_java复习$$$$._010多线程;

public class Demo {

    //synchronized  一定要有锁对象,   锁的是当前对象，!!!!!!!当前对象，调用synchronized方法的时候，其它synchronized方法都不能执行，
    public  static synchronized void getOne(){//加了static后，不是一把锁了，static的是类对象Class
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("one");
    }

    public  static synchronized void getTwo(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("two");
    }
    public  void getThree(){

        System.out.println("three");
    }
}
