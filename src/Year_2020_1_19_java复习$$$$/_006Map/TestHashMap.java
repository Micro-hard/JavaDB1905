package Year_2020_1_19_java复习$$$$._006Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer, String>();
        map.put(1,"james");
        map.put(2,"jack");
        map.put(3,"jordan");
        map.put(4,"joe");

//        System.out.println(map.remove(9));
//        System.out.println(map.size());
//        System.out.println(map.get(1));


        //遍历map的三种方法

        //1.通过keyset（）
        Set<Integer> set=map.keySet();//获得所有键的set视图
        for(Integer i:set){
            System.out.println(i+":"+map.get(i));
        }

        //2.通过values（）
        for(String str:map.values()){  //获得所有值的collection视图
            System.out.println(str);
        }

        //3.通过entrySet（）
        Set<Map.Entry<Integer,String>> set1=map.entrySet();//返回所有 键-值 的set视图
        for(Map.Entry<Integer,String> e:set1){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
