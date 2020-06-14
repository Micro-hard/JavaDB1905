package Year_2019_7_31_接口;

public class Personplus extends Animal implements Runner,Swimmer {
    @Override
    public void run() {
        System.out.println("哈哈哈哈哈哈");
    }

    @Override
    public double swim() {
        return 10000;
    }
    public int eat(){
        return 8888;
    }

}
