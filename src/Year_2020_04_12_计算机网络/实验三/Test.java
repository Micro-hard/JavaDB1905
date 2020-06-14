package Year_2020_04_12_计算机网络.实验三;

import java.io.*;
import java.util.*;

public class Test {

    /**
     * 更新路由器的路由表
     * @param routerA   被更新的路由器
     * @param tmp       发来路由信息的路由器
     */
    public static void updateRouterTable(Router routerA,Router tmp) throws IOException, ClassNotFoundException {
        //如果没有信息，什么也不做
        if(tmp.getInformation()==null || tmp.getInformation().size()==0 || routerA==tmp){
            return;
        }
        //对tmp的复制，避免直接修改路由器C的路由表
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(baos);
        oos.writeObject(tmp);
        oos.close();
        byte[] bs=baos.toByteArray();
        ByteArrayInputStream bais=new ByteArrayInputStream(bs);
        ObjectInputStream ois=new ObjectInputStream(bais);
        Router routerB= (Router) ois.readObject();
        ois.close();
        //将发来路由信息的路由器的路由表中所有的距离都加1，并将B的下一跳全部改为路由器B的地址
        for(Information i:routerB.getInformation().values()){
            //距离小于16时才加
            if(i.getDistance()<16){
                i.setDistance(i.getDistance()+1);
            }
            i.setNextJumpRouter(routerB.getRouterName());
        }
        //System.out.println(routerB+" 00000000000000000000000000000");

        Information information=null;
        for(String s:routerB.getInformation().keySet()){
            //如果路由器A中原来不能到达这一网络，将这一网络加到路由器A中,并将下一跳改成B的地址
            if(!routerA.getInformation().containsKey(s)){
                //                         目的网络       距离                                 下一跳名称
                information=new Information(s,routerB.getInformation().get(s).getDistance(),routerB.getRouterName());
                routerA.getInformation().put(s,information);
            }else {
                //如果下一跳相同，替换原路由表中的项目，
                if(routerA.getInformation().get(s).getNextJumpRouter().equals(routerB.getRouterName())){
                    routerA.getInformation().put(s,routerB.getInformation().get(s));//直接替换
                }else {
                    //若收到的项目中的距离小于路由表中的距离，则进行更新，
                    if(routerB.getInformation().get(s).getDistance()<routerA.getInformation().get(s).getDistance()){
                        routerA.getInformation().put(s,routerB.getInformation().get(s));
                    }
                }
            }
        }
    }

    //更新路由表
    public static void update() throws IOException, ClassNotFoundException {
        Map<String,Information> informationA=new HashMap<>();
        informationA.put("N1",new Information("N1",5,"A"));
        informationA.put("N2",new Information("N2",3,"C"));
        informationA.put("N6",new Information("N6",6,"F"));
        informationA.put("N8",new Information("N8",4,"E"));
        Router A=new Router("B",informationA);
        Map<String,Information> informationB=new HashMap<>();
        informationB.put("N1",new Information("N1",5,""));
        informationB.put("N2",new Information("N2",4,""));
        informationB.put("N3",new Information("N3",8,""));
        informationB.put("N6",new Information("N6",4,""));
        informationB.put("N8",new Information("N8",3,""));
        Router B=new Router("C",informationB);

        System.out.println("原B路由器：\n"+A);
        System.out.println("C路由器：\n"+B);
        updateRouterTable(A,B);
        System.out.println("更新后的B路由器"+A);
    }

    //坏消息传播的慢
    public static void func2() throws IOException, ClassNotFoundException {
        Map<String,Information> informationA=new HashMap<>();
        //informationA.put("N1",new Information("N1",1,""));  //正常情况
        Router A=new Router("A",informationA);
        Map<String,Information> informationB=new HashMap<>();
        informationB.put("N1",new Information("N1",2,"A"));
        Router B=new Router("B",informationB);

        System.out.println("原A路由器：\n"+A);
        System.out.println("----------------------------------------");
        System.out.println("原B路由器：\n"+B);
        System.out.println("----------------------------------------");
        while ( B.getInformation().get("N1").getDistance()!=16){
            updateRouterTable(A,B);
            System.out.println("A路由器变为"+A);
            updateRouterTable(B,A);
            System.out.println("B路由器变为"+B);
        }
        System.out.println("-----------------------------------------");
        System.out.println("更新后的A路由器"+A);
        System.out.println("-----------------------------------------");
        System.out.println("更新后的B路由器"+B);
    }



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String choose="";               //输入的选项
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("1.求出路由器B更新后的路由表");
            System.out.println("2.好消息传播的快，坏消息传播的慢");
            System.out.println("3.路由表的动态变化，按照时间定期更新路由表，直到稳定为止");
            System.out.println("4.结束");
            choose=scanner.nextLine();
            switch (choose){
                case "1":
                    update();
                    break;
                case "2":
                    func2();
                    break;
                case "3":
                    //创建一个路由器
                    Map<String,Information> informationA=new HashMap<>();
                    informationA.put("N9",new Information("N9",5,"H"));
                    informationA.put("N10",new Information("N10",3,"I"));
                    informationA.put("N11",new Information("N11",6,"J"));
                    informationA.put("N12",new Information("N12",4,"K"));
                    Router D=new Router("D",informationA);
                    //自动更新路由表
                    AutoUpdate autoUpdate=new AutoUpdate();
                    autoUpdate.start();
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //3秒后新增一个路由器并自动更新
                    System.out.println("增加了一个路由器！！！！！！！！！！！！！！！！！！！！");
                    autoUpdate.getRouterList().add(D);
                    break;
                case "4":
                    System.exit(0);
                    break;
            }
        }
    }
}
