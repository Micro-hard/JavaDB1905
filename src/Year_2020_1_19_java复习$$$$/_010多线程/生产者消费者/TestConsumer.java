package Year_2020_1_19_java复习$$$$._010多线程.生产者消费者;

public class TestConsumer {
    public static void main(String[] args) {
        Shop shop=new Shop();
        Maker maker=new Maker(shop);
        maker.start();
        Sale sale=new Sale(shop);
        sale.start();
    }
}
class Maker extends Thread{

    Shop shop;
    public Maker(Shop shop){
        this.shop=shop;
    }
    @Override
    public void run() {
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

class Sale extends Thread{

    Shop shop;
    public Sale(Shop shop){
        this.shop=shop;
    }
    @Override
    public void run() {
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
