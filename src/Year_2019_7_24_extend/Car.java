package Year_2019_7_24_extend;

public class Car extends Vehicles{
    private int seats;
    public Car(String brand, String color,int seats){//
        super(brand,color);
        this.seats=seats;
        super.run();
    }
    void showCar(){
        showInfo();
        System.out.println("座位数："+seats);
    }
}
