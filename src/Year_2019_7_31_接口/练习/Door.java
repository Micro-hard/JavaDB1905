package Year_2019_7_31_接口.练习;

public class Door extends initDoor implements DoorFunction{
    public Door(double price, double length, double width, String material) {
        super(price, length, width, material);
    }
    public void openDoor(){
        System.out.println("开门!!!");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门!!!");
    }
    public void theftproof() { //防盗{
        System.out.println("防盗");
    }
    public void waterproof(){//防水
        System.out.println("防水");
    }
    public void bullerproof() {//防弹
        System.out.println("防弹");
    }
    public void fireproof() {//防火
        System.out.println("防火");
    }

    public static void main(String[] args) {
        Door door=new Door(200,100,60,"木头");
        door.bullerproof();
    }
}
