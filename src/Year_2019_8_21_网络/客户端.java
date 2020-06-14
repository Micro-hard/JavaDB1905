package Year_2019_8_21_网络;

import java.io.*;
import java.net.Socket;

public class 客户端 {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("127.0.0.1",5001);  //客户端
            OutputStream out=socket.getOutputStream();

            FileInputStream input=new FileInputStream("D:\\IO818\\A.txt");
            byte[] bytes=new byte[input.available()];
            input.read(bytes);
            out.write(bytes);
            input.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
