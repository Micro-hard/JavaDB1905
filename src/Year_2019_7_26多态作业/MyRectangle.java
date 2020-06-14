package Year_2019_7_26多态作业;

public class MyRectangle extends GeometricObject{//矩形
    private double width;//宽
    private double height;//长

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {

        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double findArea() {
        return width*height;
    }
}
