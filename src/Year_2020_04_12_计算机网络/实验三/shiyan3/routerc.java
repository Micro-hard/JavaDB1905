package 计网.shiyan3;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 路由器c
 */
public class routerc{
    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
        Socket socket = new Socket("127.0.0.1",9999);
        routerTable[] rou = {new routerTable("N1",5),new routerTable("N2",4),
                new routerTable("N3",8),new routerTable("N6",4),new routerTable("N8",3)};
        System.out.println("C发送的路由信息为：");
        System.out.println("目的网络" +"\t      "+"距离");
        for (routerTable a:rou
             ) {
            System.out.println(a);
        }
        ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
        /**
         *对象流发送对象
         */
        for (int i = 0;i<rou.length;i++){
            Thread.sleep(1000);
            os.writeObject(rou[i]);
        }
        os.close();
        socket.close();
    }
}
