package 计网.shiyan3;

import java.io.Serializable;

public class routerTable implements Serializable {
    private String targetNetwork;  //目的网络
    private int distance;          //距离
    private String nextJumpRouter; //下一跳路由器

    public String getTargetNetwork() {
        return targetNetwork;
    }

    public void setTargetNetwork(String targetNetwork) {
        this.targetNetwork = targetNetwork;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public routerTable(String targetNetwork, int distance) {
        this.targetNetwork = targetNetwork;
        this.distance = distance;
    }

    public String getNextJumpRouter() {
        return nextJumpRouter;
    }

    public void setNextJumpRouter(String nextJumpRouter) {
        this.nextJumpRouter = nextJumpRouter;
    }

    public routerTable(String targetNetwork, int distance, String nextJumpRouter) {
        this.targetNetwork = targetNetwork;
        this.distance = distance;
        this.nextJumpRouter = nextJumpRouter;
    }

    public routerTable() {
    }

    @Override
    public String toString() {
        if (nextJumpRouter!=null) {
            return "  " + targetNetwork + "\t" +
                    "       " + distance +
                    "        \t" + nextJumpRouter
                    ;
        }else{
            return "  "+targetNetwork+"\t       "
                    + distance
                    ;
        }
    }
}
