package Year_2019_7_31_接口;

public class Test {
    public void mi(Runner f){
        f.run();
    }
    public void m2(Swimmer s){
        s.swim();
    }
    public void m3(Animal a){
        a.eat();
    }
    public static void main(String[] args) {
        Test t=new Test();
        Person p=new Person();
        t.mi(p);

    }
}
