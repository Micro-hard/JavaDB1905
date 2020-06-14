package Year_2019_8_21_网络.聊天;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class 刘能 {
    public static void main(String[] args) {
        try {
            Socket client=new Socket("127.0.0.1",5002);
            ObjectOutputStream outputStream=new ObjectOutputStream(client.getOutputStream());
            User user=new User("刘能","你好大脚，我是你大爷","大脚");
            outputStream.writeObject(user);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
