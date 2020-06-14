package Year_2019_8_13_多线程;



public class BankTest extends Bank implements Runnable{
    private String string;
    private int money;

    public void setString(String string) {
        this.string = string;
    }

    public BankTest(String string, int money) {
        this.string = string;
        this.money=money;

    }

    @Override
    public void run() {
        switch (string){
            case "存":
                this.addMoney(money);
                break;
            case "取":
                this.subMoney(money);
                break;
            case "看":
                this.lookMoney();
                break;
        }
    }



    public static void main(String[] args) {
        BankTest bankTest=new BankTest("取",100);
        //BankTest bankTest2=new BankTest("存",200);
        //BankTest bankTest3=new BankTest("看",0);
        Thread thread1=new Thread(bankTest,"线程一");

        Thread thread2=new Thread(bankTest,"线程二");

        Thread thread3=new Thread(bankTest,"线程二");
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bankTest.setString("存");

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bankTest.setString("看");
        thread3.start();


    }
}
