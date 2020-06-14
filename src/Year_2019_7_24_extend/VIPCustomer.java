package Year_2019_7_24_extend;

public class VIPCustomer extends NormalCustomer {
    private double discount;//打折[0.00~1.00]

    public static void main(String[] args) {
        VIPCustomer vip = new VIPCustomer("马云", 0, true, 0.5);
        vip.setUserName("张飞");//父类属性私有，不能使用   setter是共有的
        vip.setPoints(0);
    }

    public VIPCustomer(String username, int points, boolean isADV, double discount) {//会员构造器  无广告
        super(username, points, isADV);//没有这个会报错，子类可以调用父类带参数的构造方法/////     super  .是属性和方法 （）是构造方法
        this.discount = discount;
    }
}
