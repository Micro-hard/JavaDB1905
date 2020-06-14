package Year_2019_7_23.第四节课oop;

import java.text.DecimalFormat;

public class Circle {
    private int radius;//半径
    double area(){
        return  Math.PI*this.radius*this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("#.##");//保留两位小数
        Circle c=new Circle();
        c.setRadius(10);
        System.out.println(df.format(c.area()));
    }
}
