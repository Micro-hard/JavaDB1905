package Year_2019_8_19_IO;

import java.io.Serializable;

public class Employee implements Serializable {    //雇员
    private String name;   //姓名
    private int age;       //年龄

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
