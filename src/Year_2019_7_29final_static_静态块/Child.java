package Year_2019_7_29final_static_静态块;

public class Child extends Son{

    {
        System.out.println("Child非静态");
    }
    public Child() {
        System.out.println("Child");
    }
}
