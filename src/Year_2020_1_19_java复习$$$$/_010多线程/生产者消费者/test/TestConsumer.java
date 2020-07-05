package Year_2020_1_19_java复习$$$$._010多线程.生产者消费者.test;

public class TestConsumer {
    public static void main(String[] args) {
        Shop shop=new Shop();
        new Provider(shop).start();
        new Consumer(shop).start();
    }
}

class Provider extends Thread{
    Shop shop;
    public Provider(Shop shop){
        this.shop=shop;
    }
    @Override
    public void run(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shop.make();
        }
    }
}

class Consumer extends Thread{
    Shop shop;
    public Consumer(Shop shop){
        this.shop=shop;
    }
    @Override
    public void run(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            shop.sale();
        }
    }
}
