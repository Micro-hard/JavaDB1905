package Year_2019_7_30抽象类_接口;

public abstract class Father {//  抽象类
    private int money=600000;//存款

    public void cost(int c){
        this.money-=c;
    }
    public void earn(int c){
        this.money+=c;
    }
    //void dream();  这个叫定义方法，只有方法名
    public abstract void dream();//抽象方法

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {

        this.money = money;
    }
}
