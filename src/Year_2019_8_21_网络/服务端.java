package Year_2019_8_21_网络;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class 服务端 {
    public static void main(String[] args) {
        //端口5000以后的可以让用户自定义使用

        //端口的取值范围1~65535
        try {
            ServerSocket sever=new ServerSocket(5001);//服务端
            Socket socket=sever.accept();
            InputStream input=socket.getInputStream();
            FileOutputStream out=new FileOutputStream("D:\\IO818\\A1.txt");
            byte[] bytes=new byte[input.available()];
            input.read(bytes);
            out.write(bytes);
            out.close();
            input.close();
            System.out.println(socket);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
