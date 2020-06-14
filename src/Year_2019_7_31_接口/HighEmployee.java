package Year_2019_7_31_接口;

public class HighEmployee extends Employee{
    public HighEmployee(String name, int ID, int level) {
        super(name, ID, level);
    }

    @Override
    public double Salary() {
        return  getLevel()*1000;
    }
}
