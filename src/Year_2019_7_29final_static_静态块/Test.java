package Year_2019_7_29final_static_静态块;

public class Test {
    private int count;

    public static void main(String[] args) {
        Test test= new Test(88);
        System.out.println(test.count);
    }

    public Test(int count) {
        this.count = count;
    }
}
