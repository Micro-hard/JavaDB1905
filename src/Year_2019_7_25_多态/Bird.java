package Year_2019_7_25_多态;

public class Bird extends Animal {
    public int wings;

    public Bird(int i) {
        this.wings=i;
    }
    public Bird() {

    }

    public void display(){
        super.display();
        System.out.println("翅膀:"+wings);
    }

    /*public void setWings(int wings) {
        this.wings = wings;
    }*/
}
