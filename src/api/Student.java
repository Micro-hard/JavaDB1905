package api;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getAge());
    }

    public static void main(String[] args) {
        Student student1=new Student("aa",1);
        Student student2=new Student("ab",1);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.equals(student2));
    }
}
