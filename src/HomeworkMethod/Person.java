package HomeworkMethod;

public class Person {
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        System.out.println("姓名:"+this.name+"\n年龄:"+this.age);
    }

    public static void main(String[] args) {
        Person person=new Person();
        person.setName("张三");
        person.setAge(20);
        person.display();
    }
}
