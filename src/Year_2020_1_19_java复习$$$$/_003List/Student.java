package Year_2020_1_19_java复习$$$$._003List;

public class Student implements Comparable<Student>{  //这个类实现了comparable接口  自然排序，也叫内部比较器
    String name;
    int age;
    int score;


    //自然排序只能有一个，在类里的
    @Override//  如果this大返回正数，如果o大返回符数，相等返回零
    public int compareTo(Student o) {  //泛型写的student  要是不写泛型，还得强转
        //return this.score-o.score;//分数从小到大
        return this.age==o.age?this.score-o.score:this.age-o.age;//年龄相等按分数排,
    }

    public Student(String name, int age, int score) {
        super();
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }
}
