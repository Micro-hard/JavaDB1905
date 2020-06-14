package Year_2019_7_24_extend;

public class NormalCustomer {
    private String userName;//用户名
    private int points;//积分
    private boolean isADV=true;//广告有无 初始为有

    public NormalCustomer(String userName, int points, boolean isADV) {
        this.userName = userName;
        this.points = points;
        this.isADV = isADV;
    }
    /*public NormalCustomer(){//这样子类就能调出来没参数的构造方法

    }*/

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setADV(boolean ADV) {
        isADV = ADV;
    }

    public String getUserName() {
        return userName;
    }

    public int getPoints() {
        return points;
    }

    public boolean isADV() {
        return isADV;
    }


}
