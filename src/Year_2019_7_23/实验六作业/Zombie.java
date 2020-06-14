package Year_2019_7_23.实验六作业;

public class Zombie {
    String name;
    int power;
    int attract;

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setAttract(int attract) {
        this.attract = attract;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getAttract() {
        return attract;
    }

    public static void main(String[] args) {
        Zombie zombie1=new Zombie();
        //zombie1.name="shit";
        zombie1.attract=100;
        zombie1.power=100;
        zombie1.setName("asdf");
        System.out.println(zombie1.getName());
    }
}
