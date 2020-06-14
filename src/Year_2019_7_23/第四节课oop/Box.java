package Year_2019_7_23.第四节课oop;

public class Box {
    private int long1;
    private int high;
    private int wight;

    public void tiji() {
        System.out.println(long1 * high * wight + "m^3");
    }

    public void area() {
        System.out.println((long1 * wight + long1 * high + high * wight) * 2 + "m^2");
    }

    public void setLong1(int long1) {
        this.long1 = long1;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.setHigh(10);
        box.setLong1(5);
        box.setWight(12);
        box.area();
        box.tiji();
    }
}
