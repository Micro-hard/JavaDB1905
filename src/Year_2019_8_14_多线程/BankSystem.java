package Year_2019_8_14_多线程;

import java.util.Date;

public class BankSystem {
    public static void main(String[] args) throws InterruptedException {
        Bank 银行 = new Bank(1000);
        Customer 顾客1 = new Customer(银行, true,100);
        Customer 顾客2 = new Customer(银行, false,190);
        Thread t1 = new Thread(顾客1);
        Thread t2 = new Thread(顾客2);
        t1.start();
        t2.join();
        t2.start();
        while (true){
            Thread.sleep(10);
            if (银行.getCount()<=0){
                银行.setCount(1000);
            }
        }
    }
}
//顾客或者叫储户
class Customer implements Runnable{
    private Bank bank;//银行
    private boolean quOrcun;//false代表取钱 true就是存
    private int money;

    /**
     * 构造方法
     * @param bank      银行对象
     * @param quOrcun   存或者取标记
     * @param money     存或者取多少钱
     */
    public Customer(Bank bank, boolean quOrcun, int money) {
        this.bank = bank;
        this.quOrcun = quOrcun;
        this.money = money;
    }

    @Override
    public void run() {
        if(quOrcun){
            while (true){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bank.addMoney(money);
                bank.lookMoney();
            }
        }else{
            while (true){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bank.subMoney(money);
                bank.lookMoney();
            }
        }
       // bank.lookMoney();
    }
}