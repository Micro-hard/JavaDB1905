package Year_2019_7_31_接口;

public class TestRunner {
    public static void main(String[] args) {
        Runner r=new Runner() {//可直接实现方法
            @Override
            public void run() {
                System.out.println("实现类跑");
            }
        };
        Runner liuxiang=new Person();
        Bird niao=new Bird();
        liuxiang.run();
        niao.run();
        r.run();
    }
}
