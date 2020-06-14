package Year_2020_1_8_设计模式.工厂模式;

public class test {
    public static void main(String[] args) {
        HumanFactory factory=new HumanFactory();
        Human h=factory.getHuman("white");
        h.eat();
    }
}
