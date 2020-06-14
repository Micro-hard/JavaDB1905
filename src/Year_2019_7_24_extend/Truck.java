package Year_2019_7_24_extend;



public class Truck extends Vehicles {
    private float load;

    public Truck(String brand, String color, float load) {
        super(brand, color);
        this.load = load;
    }

    public void showTruck(){
        showInfo();
        System.out.println("载重："+load);
    }

}
