package Year_2019_7_25_多态;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void follow() {
        //super.follow();
        System.out.println("猫在跟随");
    }
}
