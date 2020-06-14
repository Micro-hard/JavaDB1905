package Year_2019_7_26多态作业;

public class GeometricObject {
    private String color;
    private double weight;

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {

        return color;
    }

    public double getWeight() {
        return weight;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    public double findArea(){
        return weight;
    }
}
