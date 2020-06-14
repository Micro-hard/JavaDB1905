package Year_2019_7_23.第四节课oop;

public class Person001 {
    private String name;
    private int age;
    private String sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void study(){
        System.out.println("studying"+name);
    }
    public void showAge(){
        //System.out.println(this.age);
        System.out.println(age);
    }
    public void addAge(int i){
        //this.age+=1;
        age+=i;
    }

    public static void main(String[] args) {
        Person001 person001=new Person001();
        Person001 person002=new Person001();
        person001.setName("001");
        person001.setAge(20);
        person001.setSex("boy");
        person001.study();
        person001.addAge(100);
        person001.showAge();

        person002.setName("002");
        person002.setAge(23);
        person002.setSex("boy");
        person002.study();
        person002.addAge(100);
        person002.showAge();
    }
}
