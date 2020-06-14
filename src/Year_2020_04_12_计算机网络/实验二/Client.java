package Year_2020_04_12_计算机网络.实验二;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//客户端
public class Client {

    public static void test001(String data, boolean timeOut) throws IOException,RuntimeException {
        //                                          超时时间3秒
        TimeOutThread timeOutThread=new TimeOutThread(3000,new TimeOutException("超时了"));
        //超时计时器启动
        timeOutThread.start();
        System.out.println(System.currentTimeMillis());
        //如果手动设置为超时
        if(timeOut) {
            //休眠的时间超过了 定义的超时时间
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没超时，进入，如果超时就执行TimeOutThread的run里的超时重传，
        if(!timeOutThread.isTimeOut()){
            Socket s=new Socket("127.0.0.1",8080);
            PrintWriter out=null;
            BufferedReader br=null;

            out=new PrintWriter(s.getOutputStream());//带缓冲的
            out.println(data);
            //刷新后，服务端收到信息了；
            out.flush();//不一定立刻输出而是要等缓冲区满或flush()

            br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            String msg=br.readLine();
            System.out.println("服务端返回的信息："+msg);
            out.close();
            s.close();
        }

        //超时计时器关闭
        timeOutThread.cancel();
        System.out.println(System.currentTimeMillis());
    }

    public static void main(String[] args) throws UnknownHostException, IOException {
        String data="1101011011";       //发送的正确的数据
        String errData="1101011010";    //发送的错误的数据
        String checkCode="1110";        //校验码
        String choose="";               //输入的选项
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("1.正常数据帧的通信过程");
            System.out.println("2.错误帧的通信过程");
            System.out.println("3.数据帧的丢失的通信过程");
            System.out.println("4.结束");
            System.out.println("5.计算校验码");
            choose=scanner.nextLine();
            switch (choose){
                case "1":
                    //发送正确的数据和校验码
                    test001(data+"Q"+checkCode,false);
                    break;
                case "2":
                    //发送错误的数据和校验码
                    test001(errData+"Q"+checkCode,false);
                    break;
                case "3":
                    //                      手动设置超时
                        test001(data+"Q"+checkCode,true);
                    break;
                case "4":
                    System.exit(0);
                case "5":
                    System.out.println();
                    //                                              数据      生成多项式  校验码
                    //System.out.println("校验码为"+Tools.isRightData("101110","1001",null));
                    System.out.println("校验码为"+Tools.isRightData("1101011011","10011",null));
            }
        }
    }
}
