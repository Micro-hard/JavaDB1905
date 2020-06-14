package Year_2020_1_19_java复习$$$$._006Map;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<Integer, String>();//排序的map，Integer实现了comparable接口，自然排序
        map.put(1,"张三丰");
        map.put(12,"张三");
        map.put(32,"张无极");
        map.put(18,"张翠山");
        map.put(4,"刘备");
        map.put(6,"刘玄德");

        System.out.println(map);

        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

        Map<Integer,String> map1=map.headMap(10);  //key的值小于10的  返回一个新的map
        System.out.println(map1);

        Map<Integer,String> map2=map.tailMap(18);  //key的值大于等于18的  返回一个新的map
        System.out.println(map2);

        Map<Integer,String> map3=map.subMap(6,18);  //key的值在6 和 18 之间的  返回一个新的map（包含6，不包含18）
        System.out.println(map3);
    }
}
