package Year_2020_1_19_java复习$$$$._003List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(9);
        list.add(2);
        list.add(2);
        list.add(12);
        list.add(654);
        list.add(44);
        list.add(-1);
        list.add(50);
        list.add(444);
        list.add(66);
        list.add(123);
        System.out.println(list);

        //反转
        Collections.reverse(list);
        System.out.println(list);
        //排序
        Collections.sort(list);
        System.out.println(list);
        //洗牌
        Collections.shuffle(list);
        System.out.println(list);
    }
}
