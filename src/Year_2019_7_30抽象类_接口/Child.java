package Year_2019_7_30抽象类_接口;

public class Child extends Father{
    @Override
    public void dream() {
        //子类实现梦想
        System.out.println("我挣了一百万！！！！！！");
       setMoney(getMoney()+1000000);
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.dream();
        System.out.println(c.getMoney());
    }
}
