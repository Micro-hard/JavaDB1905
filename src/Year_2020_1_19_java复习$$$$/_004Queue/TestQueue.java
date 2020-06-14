package Year_2020_1_19_java复习$$$$._004Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue=new ArrayDeque<String>();
        queue.offer("张飞");
        queue.offer("刘备");
        queue.offer("关羽");
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
