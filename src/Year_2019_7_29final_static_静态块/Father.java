package Year_2019_7_29final_static_静态块;

public class Father {
    private NewClass newClass=new NewClass("父");
    {
        System.out.println("Father非静态");
    }
    static {
        System.out.println("-----Father静态块------");
    }
    public Father() {
        System.out.println("father");
    }
}
