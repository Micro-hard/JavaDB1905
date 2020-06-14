package Year_2019_8_14_多线程;

public class test001{
    private boolean flag = true;
    public String string=new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    public int i=1;
    public int tmp=0;

    public static void main(String[] args) {
        test001 t=new test001();
        Str str=new Str(t);
        Num num=new Num(t);
        Thread thread1=new Thread(str);
        Thread thread2=new Thread(num);
        thread1.start();
        thread2.start();
    }
    public synchronized void num(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (flag)try {
            wait();
        }catch(Exception e){
        }
        for (int j=0;j<2;j++)
            System.out.println(i++);
        flag = true;
        this.notify();
    }
    public synchronized void str(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!flag)try {
            wait();
        }catch(Exception e){
        }
        if (tmp==26)
            tmp=0;
        for (int j=0;j<2;j++)
            System.out.println(string.charAt(tmp++));
        //tmp=0;
        flag = false;
        this.notify();
    }
}

class Str implements Runnable{
    private test001 t;

    public Str(test001 t) {
        this.t = t;
    }

    @Override
    public void run() {
        while (true){
            t.str();
        }
    }
}

class Num implements Runnable{
    private test001 t;

    public Num(test001 t) {
        this.t = t;
    }

    @Override
    public void run() {
        while (true){
            t.num();
        }
    }
}