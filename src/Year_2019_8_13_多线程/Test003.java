package Year_2019_8_13_多线程;

public class Test003 implements Runnable {
    private int num;
    @Override
    public void run() {
        switch (num){
            case 1:
                for (int i=2;i<=1000;i++){
                    int tmp=0;
                    for (int j=2;j<i;j++){
                        if (i%j==0&&i!=j){
                            tmp=1;
                            break;
                        }
                    }
                    if (tmp==0){
                        System.out.println(Thread.currentThread().getName()+i);
                    }
                }
                break;
            case 2:
                for (int i=1001;i<=2000;i++){
                    int tmp=0;
                    for (int j=2;j<i;j++){
                        if (i%j==0&&i!=j){
                            tmp=1;
                            break;
                        }
                    }
                    if (tmp==0){
                        System.out.println(Thread.currentThread().getName()+i);
                    }
                }
                break;
            case 3:
                for (int i=2001;i<=3000;i++){
                    int tmp=0;
                    for (int j=2;j<i;j++){
                        if (i%j==0&&i!=j){
                            tmp=1;
                            break;
                        }
                    }
                    if (tmp==0){
                        System.out.println(Thread.currentThread().getName()+i);
                    }
                }
                break;
        }
    }

    public Test003(int num) {
        this.num=num;
    }

    public static void main(String[] args) {
        Test003 test1=new Test003(1);
        Test003 test2=new Test003(2);
        Test003 test3=new Test003(3);
        Thread thread1=new Thread(test1,"线程一");
        Thread thread2=new Thread(test2,"线程二");
        Thread thread3=new Thread(test3,"线程三");
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread3.start();
    }
}
