package Year_2020_1_8_设计模式.装饰模式;

public class ChangeWhiteDecorator extends Decorator{
    public ChangeWhiteDecorator(Person p) {
        super(p);
    }

    @Override
    public void show() {
        System.out.println("此人已经美白处理，皮肤增白50%");
        super.p.show();
    }
}
