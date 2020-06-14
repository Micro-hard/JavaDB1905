package Year_2020_04_12_计算机网络.实验二;

import java.io.IOException;

public class TimeOutThread extends Thread{

    //超时时间
    private long timeOut;
    //是否取消
    private boolean cancel;
    //是否已经超时
    private boolean isTimeOut;
    //自定义的超时异常
    private TimeOutException timeOutException;
    //                        时间
    public TimeOutThread(long timeOut, TimeOutException timeOutException) {
        this.timeOut = timeOut;
        this.timeOutException = timeOutException;
        //设置本线程为守护线程(主线程结束了它也结束了)
        //this.setDaemon(true);
    }

    public boolean isTimeOut() {
        return isTimeOut;
    }

    //关闭超时计时器
    public synchronized void cancel(){
        cancel=true;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(timeOut);
            if(!cancel){
                System.out.println("超时计时器超时，自动重传数据！");
                //已经超时
                isTimeOut=true;
                //超时重传
                //发送正确的数据和校验码
                Client.test001("1101011011Q1110",false);
                //throw timeOutException;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //                                          超时时间为3秒
        TimeOutThread timeOutThread=new TimeOutThread(3000,new TimeOutException("超时了"));
        try {
            System.out.println(System.currentTimeMillis());
            timeOutThread.start();
            Thread.sleep(1000);
            timeOutThread.cancel();
            System.out.println(System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}