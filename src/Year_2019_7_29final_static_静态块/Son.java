package Year_2019_7_29final_static_静态块;

public class Son extends Father{
    private NewClass newClass=new NewClass("子");
    {
        System.out.println("Son非静态");
    }
    static {
        System.out.println("-----Son静态块------");
    }
    public Son() {
        System.out.println("Son");
    }
}
