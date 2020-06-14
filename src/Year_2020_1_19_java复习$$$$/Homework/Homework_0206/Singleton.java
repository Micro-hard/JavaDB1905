package Year_2020_1_19_java复习$$$$.Homework.Homework_0206;

public class Singleton {  //线程安全的单例模式
    private volatile static Singleton instance;//没有直接赋值，懒汉式   volatile防止指令重排序
    //构造方法私有化
    private Singleton(){

    }

    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();  //1.开辟空间，2.初始化对象，调用构造方法，3.传引用
            //jvm可能会指令重排序,2和3可能会调换，多线程下有问题
        }
        return instance;
    }
}
