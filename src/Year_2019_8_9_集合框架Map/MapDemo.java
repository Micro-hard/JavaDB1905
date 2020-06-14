package Year_2019_8_9_集合框架Map;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo {
    public static void main(String[] args) {
        //Hashmap,  TreeMap,HashTable
        HashMap<Character, Integer> map = new HashMap();       //泛型
        //添加元素对，也叫键值对，不是add而是 put
        //put(Object key,Object value)
        //既然key代表唯一标识，通常使用String，Integer
        map.put('a', 1);
        map.put('p', 1);
        map.put('l', 1);
        //获取值，不是获取键值对，
        System.out.println(map.get('u'));
        System.out.println(map.get('a'));
        //吧键全都取出来，形成一个集合  keySet
        //遍历会用到
        for (Object temp : map.keySet()) {
            System.out.println("key=" + temp + "  value=" + map.get(temp));
        }
        //吧里面的值全都取出来，形成一个集合
        System.out.println(map.values());
        for (Iterator it = map.values().iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
        String str = "apple is apple";
        HashMap<Character, Integer> ci = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            if (ci.keySet().contains(str.charAt(i))) {
                ci.put(str.charAt(i),ci.get(str.charAt(i))+1);       // 出现次数加一    ++   put时把老的覆盖掉
            } else {
                ci.put(str.charAt(i), 1);
            }
        }
        for (Object temp : ci.keySet()) {
            System.out.println("key=" + temp + "  value=" + ci.get(temp));
        }
    }
}
