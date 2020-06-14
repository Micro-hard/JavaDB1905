package Year_2020_04_12_计算机网络.实验一;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class Server {

    public static void main(String[] args) throws IOException {

        //创建一个ServerSocket
        ServerSocket server=new ServerSocket(8080);//本机的8888端口上监听到了一个客户的连接请求
        System.out.println("服务器已经启动");
        //接受请求，如果没有，则一直等待，这是一个阻塞方法；
        Socket s=server.accept();

        //将字节转成字符流；这个流就是对方的输出流；
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str=br.readLine();
        System.out.println("客户端的字符串："+str);
        String serverStr=str.toUpperCase();//将字符串变成大写的

        //返回给客户端的消息
        PrintWriter out=new PrintWriter(s.getOutputStream());
        out.println(serverStr);
        out.flush();

        br.close();
        s.close();
        server.close();

    }
}
