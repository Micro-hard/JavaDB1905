package Year_2020_04_12_计算机网络.实验二;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class Server {

    public static void main(String[] args) throws IOException {
        String generatorPolynomial="10011";//生成多项式
        String data=null;
        Socket s=null;
        BufferedReader br=null;
        int number=0;  //计数
        //创建一个ServerSocket
        ServerSocket server=new ServerSocket(8080);//本机的8888端口上监听到了一个客户的连接请求
        System.out.println("服务器已经启动");

        while(true){
            //接受请求，如果没有，则一直等待，这是一个阻塞方法；
            s=server.accept();
            //将字节转成字符流；这个流就是对方的输出流；
            br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            data=br.readLine();//客户端传过来的数据,
            System.out.println("客户端的数据："+data);

            //计算data经过CRC校验的余数。
            String result= Tools.isRightData(data.split("Q")[0],generatorPolynomial,data.split("Q")[1]);
            System.out.println("计算的余数是"+result);
            String serverStr="";
            //余数为0
            if(result==""){
                //返回ACK
                serverStr="ACK"+(++number);
            }else {
                //返回NAK
                serverStr="NAK"+number;
            }

            //返回给客户端的消息
            PrintWriter out=new PrintWriter(s.getOutputStream());
            out.println(serverStr);
            out.flush();
            br.close();
            s.close();
        }
    }
}
