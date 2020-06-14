package Year_2019_8_13_多线程;

public class ShareApple implements Runnable {
    private int appleCount = 5;
    private boolean isRun = true;

    public boolean getApple() {
        synchronized (this) {
            if (appleCount == 0)
                return false;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            appleCount--;
            if (appleCount >= 0) {
                System.out.println(Thread.currentThread().getName() + " 吃了，还剩" + appleCount);
            } else {
                System.out.println(Thread.currentThread().getName() + "美丽");
            }
            return true;
        }
    }

    @Override
    public void run() {
        while (isRun) {
            isRun = getApple();
        }
        if (appleCount <= 0) {
            System.out.println(Thread.currentThread().getName() + "线程死亡");
            return;
        }

    }

    public static void main(String[] args) {
        ShareApple shareApple = new ShareApple();
        Thread thread1 = new Thread(shareApple);
        Thread thread2 = new Thread(shareApple);
        thread1.setName("小明");
        thread2.setName("小强");
        thread1.start();
        thread2.start();

    }
}
