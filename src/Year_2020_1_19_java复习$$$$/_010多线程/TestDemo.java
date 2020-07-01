package Year_2020_1_19_java复习$$$$._010多线程;

public class TestDemo {
    public static void main(String[] args) {
        Demo d=new Demo();
        Demo d1=new Demo();

        //这两个线程使用的是同一把锁，
        new Thread(new Runnable() {
            @Override
            public void run() {
                d.getOne();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                d.getTwo();
            }
        }).start();


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                d.getThree();
//            }
//        }).start();
    }
}
