package Year_2019_7_23.第四节课oop;

import javax.swing.*;
import java.util.Random;

public class Window extends JFrame {
    public Window(){//构造方法  初始化
        setVisible(true);
        setDefaultCloseOperation(3);
        setBounds(new Random().nextInt(1000),new Random().nextInt(700),200,200);
    }

    public static void main(String[] args) {
        new Window();//只用一次的对象用匿名就可以
    }
}
