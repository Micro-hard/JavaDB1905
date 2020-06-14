package Year_2020_1_19_java复习$$$$._005Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> set=new TreeSet<Integer>();  //因为integer实现了comparable接口，所以可以排序
        set.add(9);
        set.add(98);
        set.add(938);
        set.add(948);
        set.add(99);
        set.add(99);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet(100));  //比100小的
        System.out.println(set.tailSet(100));//比100大的
        System.out.println(set.subSet(90,940));//90到940之间的
    }
}
