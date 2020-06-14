package Year_2019_8_7_集合框架;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private String ID;//学号
    private String name;
    private int age;
    private double score;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getID() {

        return ID;
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

    @Override
    public boolean equals(Object o) {//重写equals
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                Double.compare(student.getScore(), getScore()) == 0 &&
                Objects.equals(getID(), student.getID()) &&
                Objects.equals(getName(), student.getName());
    }

    /*@Override
    public int hashCode() {

        return Objects.hash(getID(), getName(), getAge(), getScore());
    }*/

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Student() {

    }

    public Student(String ID, String name, int age, double score) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.score = score;
    }



    public static void main(String[] args) {
        Student student1=new Student("刘德华",85);
        Student student2=new Student("张学友",100);
        Student student3=new Student("刘杰",65);
        Student student4=new Student("章子怡",58);
        Student student5=new Student("周迅",76);
        LinkedList<Student> linkedList=new LinkedList<>();
        linkedList.addLast(student1);
        linkedList.addLast(student2);
        linkedList.addLast(student3);
        linkedList.addLast(student4);
        linkedList.addLast(student5);
        System.out.println("LinkedList中的对象个数:"+linkedList.size());
        for (int i=0;i<linkedList.size();i++){
            if (linkedList.get(i).getName()=="刘杰"){
                linkedList.remove(linkedList.get(i));
            }
        }
        System.out.println("LinkedList中的对象个数:"+linkedList.size());
        System.out.println("姓名：   得分：");

        for (int i=0;i<linkedList.size();i++){
            if (linkedList.get(i).getName()=="刘德华"){
                linkedList.get(i).setScore(95);
            }
        }
        for (int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i).getName()+"   "+linkedList.get(i).getScore());
        }

        System.out.print("不及格姓名：");
        for (int i=0;i<linkedList.size();i++){
            if (linkedList.get(i).getScore()<60){
                System.out.print(linkedList.get(i).getName()+" ");
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}'+'\n';
    }

    @Override
    public int compareTo(Student o) {
        if (getScore()>o.getScore())
            return 1;
        else if (getScore()<o.getScore())
            return -1;
        else {           //成绩和年龄都相等，按年龄排
            CollationKey key1= Collator.getInstance().getCollationKey(name);
            CollationKey key2= Collator.getInstance().getCollationKey(o.name);
            return key1.compareTo(key2);
        }
    }

}
