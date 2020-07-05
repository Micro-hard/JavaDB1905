package Year_2020_1_19_java复习$$$$._010多线程.juc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestCool {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> q=new ArrayBlockingQueue<Integer>(10);
        for (int i = 0; i < 11; i++) {
            q.put(i);
            System.out.println(i+"长度是："+i);
        }
    }
}
