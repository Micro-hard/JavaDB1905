package Year_2019_7_31_接口;

/**
 * 子类实现接口，关键字时implements
 */
public class Person implements Runner{//实现
    @Override
    public void run() {
        System.out.println("人类的方法");
    }
}
