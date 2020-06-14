package Year_2019_7_24_extend;

import HomeworkMethod.Vehicle;

public class Vehicles {//交通工具类
    private String brand;//商标
    private String color;

    public Vehicles(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void run() {
        System.out.println("我已经开动了");
    }

    public void showInfo() {
        System.out.println("商标：" + this.brand + "颜色：" + this.color);
    }

    public static void main(String[] args) {
        Car car=new Car("宝马","绿色",20);
        Truck truck=new Truck("马云","绿色",1000);
        car.showCar();
        truck.showTruck();
    }
}
