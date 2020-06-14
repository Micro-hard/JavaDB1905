package Year_2019_7_31_接口.作业;

public  class Student {
    private String name;//姓名
    private int grade;//成绩
   // private boolean isPass;//是否及格

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /*public void setPass(boolean pass) {
        isPass = pass;
    }*/

    public String getName() {

        return name;
    }

    public int getGrade() {
        return grade;
    }

    /*public boolean isPass() {
        return isPass;
    }*/

    public Student(String name, int grade) {

        this.name = name;
        this.grade = grade;
    }
    public Student(){

    }
}
