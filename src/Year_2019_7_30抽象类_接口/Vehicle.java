package Year_2019_7_30抽象类_接口;

public abstract class Vehicle {
    public abstract String NoOfWheels();//抽象方法

    public static void main(String[] args) {
        Car car=new Car();
        Motobike motobike=new Motobike();
        System.out.println(car.NoOfWheels());
        System.out.println(motobike.NoOfWheels());
    }
}
