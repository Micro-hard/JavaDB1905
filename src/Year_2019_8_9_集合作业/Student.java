package Year_2019_8_9_集合作业;

public class Student {
    private String name;
    private int age;
    private double score;
    private String classNum;

    public Student(String name, int age, double score, String classNum) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", classNum='" + classNum + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    public String getClassNum() {
        return classNum;
    }
}
