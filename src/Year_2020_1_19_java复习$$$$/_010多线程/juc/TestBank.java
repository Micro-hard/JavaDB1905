package Year_2020_1_19_java复习$$$$._010多线程.juc;


import java.util.concurrent.ArrayBlockingQueue;

//生产者消费者
public class TestBank {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> q=new ArrayBlockingQueue<Integer>(10);
        new MakeNum(q).start();
        new TakeNum(q).start();

    }
}

/**
 * 排号器
 */
class MakeNum extends Thread{
    ArrayBlockingQueue<Integer> q;

    public MakeNum(ArrayBlockingQueue<Integer> q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 0; i <100000000 ; i++) {
            try {
                q.put(i);
                System.out.println(Thread.currentThread().getName()+"拍号的是："+q.take());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class TakeNum extends Thread{
    ArrayBlockingQueue<Integer> q;

    public TakeNum(ArrayBlockingQueue<Integer> q) {
        this.q = q;
    }

    @Override
    public void run() {
        for (int i = 0; i <100000000 ; i++) {
            try {
                q.put(i);
                System.out.println(Thread.currentThread().getName()+"----------取到的号码是："+q.take());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}