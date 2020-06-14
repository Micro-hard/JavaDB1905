package Year_2019_7_29final_static_静态块;

public class Chinese {
    private String name;//姓名
    private int age;//年龄
    public static int total;
    private static final String NATIONALITY="中国";//国籍   静态常量

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



    public Chinese(String name, int age) {
        System.out.println(this);
        this.name = name;
        this.age = age;
        total++;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + NATIONALITY + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Chinese chinese0=new Chinese("张三",20);
        System.out.println(chinese0);
        Chinese chinese1=new Chinese("李四",23);
        System.out.println(chinese1);
        System.out.println(total);
    }
}
