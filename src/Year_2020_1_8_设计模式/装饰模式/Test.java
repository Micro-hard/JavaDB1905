package Year_2020_1_8_设计模式.装饰模式;

public class Test {
    public static void main(String[] args) {
        Person p=new Student("张飞","男");
        Person p1= new ChangeWhiteDecorator(p);
        p1.show();
    }
}
