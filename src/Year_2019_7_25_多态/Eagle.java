package Year_2019_7_25_多态;

public class Eagle extends Pet{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void follow() {
        //super.follow();
        System.out.println("鹰在跟随");
    }
}
