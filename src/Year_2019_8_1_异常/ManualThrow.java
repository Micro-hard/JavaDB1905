package Year_2019_8_1_异常;

public class ManualThrow {
    public void method(){
        throw new NullPointerException("消息");
    }

    public static void main(String[] args) {
        new ManualThrow().method();
    }
}
