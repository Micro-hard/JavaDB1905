package Year_2020_1_8_设计模式.工厂模式.factorymethod;

import Year_2020_1_8_设计模式.工厂模式.Human;

public class test2 {
    public static void main(String[] args) {
        //读文件，
        //读到类名，newInstans
        Factory f=new BlackFactory();
        Human h=f.getHuman();
        h.eat();
    }
}
