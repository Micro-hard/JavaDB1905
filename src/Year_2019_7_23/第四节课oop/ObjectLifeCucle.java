package Year_2019_7_23.第四节课oop;

public class ObjectLifeCucle {
    public static void main(String[] args) {
        Person p=null;
        p=new Person();
        //p=null;//这句话不是清理垃圾对象,不知道什么时候被JVM回收，cpu的事
        //System.gc();//是垃圾回收，但不是强制的是建议
        //当一个对象没人引用就是垃圾对象
        p.setAge(20);
        Person p2=p;//声明变量，把这个变量赋值给另一个变量
        p2.setAge(30);
        System.out.println(p.getAge());
    }
    //没人引用的就是垃圾对象
}
