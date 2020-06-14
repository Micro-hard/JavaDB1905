package Year_2019_7_23.第五节课Constructor;

public class Animal {
    private int legs;

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    //构造方法与类名相同   没有返回值
    //一般写成public
    public Animal(int i){
        legs =i;
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Animal animal=new Animal(4);
        animal.setLegs(5);
    }
}
