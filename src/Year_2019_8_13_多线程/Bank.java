package Year_2019_8_13_多线程;

public class Bank {
    private int count = 0;//账户余额
    public Bank() {
    }

    public void addMoney(int momey) {
        synchronized (this) {
            count += momey;
        }
        System.out.println(System.currentTimeMillis() + "存进" + momey);
    }

    public void subMoney(int money) {
        synchronized (this) {
            if (count - money < 0) {
                System.out.println("余额不足");
                return;
            }
            count-=money;
        }
        System.out.println(System.currentTimeMillis() + "取出" + money);
    }
    public void lookMoney(){
        System.out.println("账户余额:"+count);
    }
}
