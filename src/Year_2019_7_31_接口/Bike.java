package Year_2019_7_31_接口;

public class Bike implements Vehicle{
    @Override
    public void start(int a) {
        System.out.println("自行车开始走了");
    }

    @Override
    public void stop(int a) {
        System.out.println("自行车开始停了");

    }
}
