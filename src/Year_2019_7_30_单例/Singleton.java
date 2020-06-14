package Year_2019_7_30_单例;

public class Singleton {
    private static Singleton instance=new Singleton();
    private Singleton() {
    }
    public int add(int a,int b){
        return a+b;
    }
    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton s=instance.getInstance();
        System.out.println(s.add(1,2));
    }
}
