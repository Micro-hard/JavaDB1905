package 计网.shiyan3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *路由器b
 */
public class routerb {
    private static int flag = 0;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket serverSocket  = new ServerSocket(9999);
        System.out.println("-------服务器已经启动-------");
        Socket socket = serverSocket.accept();
        System.out.println("接收数据");
        System.out.println("目的网络" +"\t      "+"距离");
        ObjectInputStream is = new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
        /*
        循环接受发送方数据
         */
        ArrayList<routerTable> tablec = new ArrayList<routerTable>();
        for (int i = 0;i<5;i++){
            routerTable q  = (routerTable) is.readObject();
            tablec.add(q);
            System.out.println(q);
        }
        ArrayList<routerTable> tableb = getTable();
        while (true){
            menu();
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextByte();
            if (choose == 4)
                break;
            switch (choose){
                case 1:update(tableb,tablec);
                        break;
                case 2:fun1(tableb,tablec);
                        break;
                case 3:fun2(tableb,tablec);
                        break;
            }
        }
        is.close();
        socket.close();
        serverSocket.close();
    }
    public static ArrayList<routerTable> getTable(){
        ArrayList<routerTable> arrayList = new ArrayList<routerTable>();
        arrayList.add(new routerTable("N1",5,"A"));
        arrayList.add(new routerTable("N2",3,"C"));
        arrayList.add(new routerTable("N6",6,"F"));
        arrayList.add(new routerTable("N8",4,"E"));
        System.out.println("目的网络" +"\t      "+"距离"+"\t      "+"下一跳路由器");
        for (routerTable a:arrayList
             ) {
            System.out.println(a);
        }
        return arrayList;
    }
    public static void menu(){
        System.out.println("1.求出路由器B更新后的路由表");
        System.out.println("2.好消息传播的快，坏消息传播的慢");
        System.out.println("3.路由表的动态变化，按照时间定期更新路由表，直到稳定为止。");
        System.out.println("4.结束");
        System.out.print("请输入选择：");
    }
    public static void update(ArrayList<routerTable> tableb,ArrayList<routerTable> tablec){
        /**
         * 发现新路由更新路由表
         */
        for (routerTable c:tablec
             ) {
            for (routerTable b:tableb
                 ) {
                if (b.getTargetNetwork().equals(c.getTargetNetwork())){          //如果存在相同目的地址，标志位置为1，发现新路由则不改变依旧为0
                    flag=1;
                    if (b.getDistance()>c.getDistance()+1){
                        b.setDistance(c.getDistance()+1);
                        b.setNextJumpRouter("C");
                        System.out.println("**********发现更短的路由,更新路由表**********");
                        System.out.println(b);
                    }
                    if (b.getNextJumpRouter().equals("C")){
                        if (b.getDistance()!=c.getDistance()+1){
                            b.setDistance(c.getDistance()+1);
                            System.out.println("*******发现必经之路距离有变化，更新路由表*******");
                            System.out.println(b);
                        }
                    }
                }
            }
            if (flag==0){
                routerTable qwe = new routerTable(c.getTargetNetwork(),c.getDistance()+1,"C");
                System.out.println("******发现新路由，更新路由表，添加目的网络******");
                System.out.println(qwe);
                tableb.add(qwe);
            }else
                flag=0;
        }
        System.out.println("******路由器B更新后的路由表******");
        System.out.println("目的网络" +"\t      "+"距离"+"\t      "+"下一跳路由器");
        for (routerTable a:tableb
                ) {
            System.out.println(a);
        }
    }
    public static void fun1(ArrayList<routerTable> tableb,ArrayList<routerTable> tablec){
        System.out.println(2);
    }
    public  static void fun2(ArrayList<routerTable> tableb,ArrayList<routerTable> tablec){
        System.out.println(3);
    }
}





















