package HomeworkMethod;

public class Vehicle {
    int speed;
    int size;
    //Person a;  类可以引用

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void speedUp(int s) {
        this.speed += s;
    }


    void speedDown(int s) {
        this.speed -= s;
    }

    int move(int s) {
        return s * speed;
    }

    public static void main(String[] args) {
        //Person a=new Person();
        Vehicle car001 = new Vehicle();
        car001.setSize(100);
        car001.setSpeed(80);
        car001.speedUp(30);
        car001.speedDown(10);
        System.out.println("移动了：" + car001.move(10) + "米");
    }

}
