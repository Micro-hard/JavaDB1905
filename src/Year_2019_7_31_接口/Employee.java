package Year_2019_7_31_接口;

public abstract class Employee {
    private String name;
    private int ID;
    private int level;

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {

        return name;
    }

    public int getID() {
        return ID;
    }

    public int getLevel() {
        return level;
    }

    public Employee(String name, int ID, int level) {
        this.name = name;
        this.ID = ID;
        this.level = level;
    }

    public abstract double Salary();//抽象方法  计算工资

    public static void main(String[] args) {
        HighEmployee highEmployee=new HighEmployee("赵四",100001,2);
        System.out.println(highEmployee.Salary());
    }
}
