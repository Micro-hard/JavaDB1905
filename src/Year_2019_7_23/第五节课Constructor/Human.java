package Year_2019_7_23.第五节课Constructor;

/**
 * 人类
 */
public class Human {
    private String nationality;
    private int age;
    private String name;

    public String getNationality() {
        return nationality;
    }

    public String getName() {
        return name;
    }

    public Human(String name, String nationality) {  //构造器
        this.name = name;
        this.nationality = nationality;
    }

    public Human() {
        this.nationality = "中国";//默认国际  中国
    }

    public Human(String name, int age) {
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("姓名："+this.name+"\n年龄："+this.age);
    }

    public static void main(String[] args) {
        Human human = new Human("关羽", "中国");
        Human human1 = new Human();
        Human human2 = new Human("翔蝇耗", 20);

        human2.display();
        System.out.println(human1.nationality);
        System.out.println(human.name);
    }
}
