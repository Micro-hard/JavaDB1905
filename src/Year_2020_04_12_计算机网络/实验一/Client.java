package Year_2020_04_12_计算机网络.实验一;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

//客户端
public class Client {

    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s=new Socket("127.0.0.1",8080);
        System.out.println("客户端连接成功;");
        Scanner scanner=new Scanner(System.in);

        String str;
        System.out.print("请输入字符串：");
        str=scanner.nextLine();

        //给服务端发送一个字符串
        PrintWriter out=new PrintWriter(s.getOutputStream());//带缓冲的
        out.println(str);
        //刷新后，服务端收到信息了；
        out.flush();//不一定立刻输出而是要等缓冲区满或flush()

        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String upperStr=br.readLine();
        System.out.println("变大写后的字符串："+upperStr);


        out.close();
        s.close();

    }
}
