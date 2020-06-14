package Year_2020_1_19_java复习$$$$._003List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStringSort{
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("james");
        list.add("andy");
        list.add("yao");
        list.add("tiger");
        list.add("adams");

        //反转
        Collections.reverse(list);
        System.out.println(list);
        //排序
        Collections.sort(list);
        System.out.println(list);
        //洗牌
//        Collections.shuffle(list);
//        System.out.println(list);

        System.out.println(Collections.binarySearch(list,"yao"));
    }
}
