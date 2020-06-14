package Year_2019_7_29final_static_静态块;

public class StaticDemo {
    private int a=5;
    private static int b=10;
    public static String name;

    @Override
    public String toString() {
        return "StaticDemo{" +
                "a=" + a +
                '}';
    }

    public static void main(String[] args) {
        StaticDemo staticDemo=new StaticDemo();
        StaticDemo staticDemo1=new StaticDemo();
        staticDemo.name="123";
        staticDemo1.name="1234";
        System.out.println(staticDemo);
        System.out.println(staticDemo.name);
        System.out.println(staticDemo1.name);
        System.out.println(b);
    }
}
