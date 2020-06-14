package Year_2020_04_12_计算机网络.实验三;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoUpdate extends Thread{
    private List<Router> routerList;

    public AutoUpdate() {
        this.routerList=new ArrayList<Router>();
        Map<String,Information> informationA=new HashMap<>();
        informationA.put("N1",new Information("N1",5,"A"));
        informationA.put("N2",new Information("N2",3,"C"));
        informationA.put("N6",new Information("N6",6,"F"));
        informationA.put("N8",new Information("N8",4,"E"));
        Router B=new Router("B",informationA);
        Map<String,Information> informationB=new HashMap<>();
        informationB.put("N1",new Information("N1",5,"A"));
        informationB.put("N2",new Information("N2",4,"F"));
        informationB.put("N3",new Information("N3",8,"C"));
        informationB.put("N6",new Information("N6",4,"D"));
        informationB.put("N8",new Information("N8",3,"E"));
        Router C=new Router("C",informationB);

        this.routerList.add(B);
        this.routerList.add(C);
    }

    @Override
    public void run() {
        System.out.println("开始自动更新路由表！！！！！！！！");
        while (true){
            try {
                Thread.sleep(1000);
                for(Router router:routerList){
                    for(Router router1:routerList){
                        Test.updateRouterTable(router,router1);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("更新后：\n"+routerList);
        }
    }


    @Override
    public String toString() {
        return "AutoUpdate{" +
                "routerList=" + routerList +
                '}';
    }

    public List<Router> getRouterList() {
        return routerList;
    }

    public void setRouterList(List<Router> routerList) {
        this.routerList = routerList;
    }
}
