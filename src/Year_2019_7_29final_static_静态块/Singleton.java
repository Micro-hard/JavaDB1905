package Year_2019_7_29final_static_静态块;

/**
 *    在一个软件系统里只有一个对象
 *    不能产生多个
 */
public class Singleton {//单例
    //第三步声明本类对象
    private static Singleton instance;
    //第一步：构造器设置为私有的，不让别人new创建本类对象
    private Singleton(){

    }

    public static Singleton getInstance() {//instance 实例
        if (instance==null)
            instance=new Singleton();
        return instance;
    }

    //第二步：因为外界不能使用new创建对象
    //只能通过静态方法调用能返回这个类的实例，因为静态方法和
    //属性不同创建对象就可以使用
    public int add(int a,int b){
        return a+b;
    }
}
class Test1Singleton{
    public static void main(String[] args) {
        Singleton s=Singleton.getInstance();
        Singleton s1=Singleton.getInstance();
       // System.out.println(s.add(1,2));
        System.out.println(s);
        System.out.println(s1);
    }
}
