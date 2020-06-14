package Year_2019_7_26多态作业;

public class Commodity {              //商品类
    private int commodityNumber;//编号
    private String name;
    private double price;//单价
    private int amount;//数量

    public Commodity(int commodityNumber, String name, double price, int amount) {
        this.commodityNumber = commodityNumber;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public int getCommodityNumber() {
        return commodityNumber;
    }

    public String getName() {
        return name;
    }
    public double zongjia(){
        return this.amount*this.price;
    }
}
