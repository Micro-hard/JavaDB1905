package Year_2019_7_31_接口.练习;

public abstract class initDoor {
    private double price;//价格
    private double length;//长
    private double width;//宽
    private String material;//材料

    public double getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }

    public initDoor(double price, double length, double width, String material) {
        this.price = price;
        this.length = length;
        this.width = width;
        this.material = material;
    }
    public abstract void openDoor();
    public abstract void closeDoor();
}
