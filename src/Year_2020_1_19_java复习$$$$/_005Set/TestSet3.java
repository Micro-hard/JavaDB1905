package Year_2020_1_19_java复习$$$$._005Set;

import java.util.HashSet;
import java.util.Set;

public class TestSet3 {
    public static void main(String[] args) {
        Set<Person> set=new HashSet<Person>();
        Person p1=new Person("james",18);
        Person p2=new Person("james",18);
        set.add(p1);
        set.add(p2);

        System.out.println(p1.hashCode());//重写了hashcode才相等的，否则object的hashcode是不相等的。！！！！！！！！！！
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));//重写了equals才相等的（比较内容），否则object的比的是地址==  ！！！！！！1
        System.out.println(set);
    }
}
