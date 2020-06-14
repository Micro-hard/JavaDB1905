package Year_2020_1_8_设计模式.装饰模式;

public class Student implements Person{
    String name;
    String sex;

    public Student(String name,String sex){
        super();
        this.name=name;
        this.sex=sex;
    }
    @Override
    public void show() {
        System.out.println("这是一个"+sex+"学生，名字"+this.name);
    }
}
