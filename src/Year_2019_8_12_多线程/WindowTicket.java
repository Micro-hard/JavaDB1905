package Year_2019_8_12_多线程;

public class WindowTicket implements Runnable {    //卖票练习
    private int num = 100;

    public synchronized boolean mai() {
        if (num > 0) {
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num--;
            System.out.println(Thread.currentThread().getName() + "卖出一张，剩" + num + "张");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        while (mai()) {
        }
    }

    public static void main(String[] args) {
        WindowTicket windowTicket = new WindowTicket();
        Thread t1 = new Thread(windowTicket, "1");
        Thread t2 = new Thread(windowTicket, "2");
        Thread t3 = new Thread(windowTicket, "3");
        Thread t4 = new Thread(windowTicket, "4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
