package Year_2020_1_19_java复习$$$$._005Set;

import java.util.Comparator;
import java.util.TreeSet;

public class TestSetPerson {



    public static void main(String[] args) {

        //自定义一个比较器   ，在创建treeset时把比较器传过去，
        class MyComparactor implements Comparator<Person> {  //匿名内部类实现Comparator
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());//判断重复的规则是名字是否相等
            }
        }

        TreeSet<Person> set=new TreeSet<Person>(new MyComparactor());//传一个自定义的比较器
        set.add(new Person("james",18));
        set.add(new Person("james",19));
        set.add(new Person("jack",20));
        System.out.println(set);

    }
}
