package Year_2020_1_8_设计模式.工厂模式.abstractfactor;

public class Test {
    public static void main(String[] args) {
        EleFactory factory=new HaierFactory();
        factory.getFridge();
        factory.getTv();
        factory.getwm();
    }
}
