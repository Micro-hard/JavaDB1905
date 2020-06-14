package Year_2019_7_31_接口;

public class Bus implements Vehicle{
    @Override
    public void start(int a) {
        System.out.println("公交车走");
    }

    @Override
    public void stop(int a) {
        System.out.println("公交车停");

    }
}
