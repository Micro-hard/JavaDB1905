package Year_2019_8_14_多线程;

import java.util.ArrayList;

public class Bank {
    private int count = 0;//账户余额 存钱
    public Bank(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addMoney(int money) {
        synchronized (this) {
            count += money;
        }
        System.out.println(System.currentTimeMillis() + "存进：" + money);
    }//取钱

    public void subMoney(int money) {
        synchronized (this) {
            if (count - money < 0) {
                System.out.println("余额不足");
                return;
            }
            count -= money;
        }
        System.out.println(System.currentTimeMillis() + "取出：" + money);
    }
    //查询 comment
    public void lookMoney() {
            System.out.println("账户余额：" + count);

    }
}
