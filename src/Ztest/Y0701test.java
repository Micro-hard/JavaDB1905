package Ztest;

public class Y0701test {

    static void test(float a){
        System.out.println("float"+a);
    }
    static void test(double a){
        System.out.println("double"+a);
    }

    public static void main(String[] args) {
        test(1.0);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
abstract class test{
    //抽象方法不能是 synchronized的
    //abstract synchronized void te();
}

interface tt{
     void a();
}