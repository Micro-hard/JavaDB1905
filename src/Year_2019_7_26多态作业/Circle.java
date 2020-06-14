package Year_2019_7_26多态作业;

public class Circle extends GeometricObject{//圆形
    private double radius;//半径

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public double getRadius() {

        return radius;
    }

    @Override
    public double findArea() {
        return Math.PI*radius*radius;
    }
}
