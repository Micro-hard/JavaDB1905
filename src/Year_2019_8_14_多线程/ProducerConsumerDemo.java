package Year_2019_8_14_多线程;

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        Resource r = new Resource();
        Producer pro = new Producer(r);
        Consumer con = new Consumer(r);
        Producer pro1 = new Producer(r);
        Consumer con1 = new Consumer(r);
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(con);
        Thread t3 = new Thread(pro1);
        Thread t4 = new Thread(con1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Resource { //生产者和消费者都要操作的资源
    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name) {
        if (flag) try {
            wait();
        } catch (Exception e) {
        }
        this.name = name + "---" + count++;
        System.out.println(Thread.currentThread().getName() + "...生产 者..." + this.name);
        flag = true;
        this.notify();
    }

    public synchronized void out() {
        if (!flag) try {
            wait();
        } catch (Exception e) {
        }
        System.out.println(Thread.currentThread().getName() + "...消费 者..." + this.name);
        flag = false;
        this.notify();
    }
}

class Producer implements Runnable {
    private Resource res;
    Producer(Resource res) {
        this.res = res;
    }
    public void run() {
        while (true) {
            res.set("商品");
//                但是如果有多个生产者和多个消费者，上面的代码是有问题，比如2个生产者，2 个消费者，运行结果就 可能出现生产的1个商品生产了一次而被消费了2次，或者连续生产2个商品而只有1个被消费，
//                这是因为 此时共有4个线程在操作Resource对象r, 而notify () 唤醒的是线程池中第1个wait() 的线程，所以生产者执 行notify () 时，唤醒的线程有可能是另1个生产者线程，
//                这个生产者线程从wait() 中醒来后不会再判断 ﬂag，而是直接向下运行打印出一个新的商品，这样就出现了连续生产2个商品。
        }
    }
}

class Consumer implements Runnable {
    private Resource res;
    Consumer(Resource res) {
        this.res = res;
    }
    public void run() {
        while (true) {
            res.out();
        }
    }
}

