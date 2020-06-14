package Year_2020_04_12_计算机网络.实验三;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

//路由器
public class Router implements Serializable {

    private String routerName;
    private Map<String,Information> information;

    public Router() {
    }

    public Router(String routerName, Map<String, Information> information) {
        this.routerName = routerName;
        this.information = information;
    }

    public String getRouterName() {
        return routerName;
    }

    public Map<String, Information> getInformation() {
        return information;
    }

    public void setRouterName(String routerName) {
        this.routerName = routerName;
    }

    public void setInformation(Map<String, Information> information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Router{\n"+
                "routerName:    "+routerName+
                "\ninformation:\n"+information.values()+
                "\n}"
                ;
    }
}
