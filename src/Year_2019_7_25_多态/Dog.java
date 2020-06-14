package Year_2019_7_25_多态;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void follow() {
        //super.follow();
        System.out.println("狗在跟随");
    }
}
