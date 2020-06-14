package Year_2020_04_12_计算机网络.实验三;

import java.io.Serializable;

//路由表中的信息
public class Information implements Serializable {
    private String targetNetwork;  //目的网络
    private int distance;          //距离
    private String nextJumpRouter; //下一跳路由器

    public Information() {
    }

    @Override
    public String toString() {
        return "\n"+targetNetwork+
                "\t"+distance+
                "\t"+nextJumpRouter;
    }

    public void setTargetNetwork(String targetNetwork) {
        this.targetNetwork = targetNetwork;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setNextJumpRouter(String nextJumpRouter) {
        this.nextJumpRouter = nextJumpRouter;
    }

    public String getTargetNetwork() {

        return targetNetwork;
    }

    public int getDistance() {
        return distance;
    }

    public String getNextJumpRouter() {
        return nextJumpRouter;
    }

    public Information(String targetNetwork, int distance, String nextJumpRouter) {

        this.targetNetwork = targetNetwork;
        this.distance = distance;
        this.nextJumpRouter = nextJumpRouter;
    }
}
