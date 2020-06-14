package Year_2019_8_9_集合框架Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public class ChooseMonkeyKing {
    public static void main(String[] args) {
        ChooseMonkeyKing.mk(15);
        //使用迭代器迭代ArrayList   LinkedList  HashSet
        ArrayList<Integer> list=new ArrayList();
        list.add(1);
       /* for (Iterator<Integer> it=list.iterator();it.hasNext();){///两种方法001
            Integer i=it.next();
        }

        Iterator<Integer> it=list.iterator();///两种方法002
        while (it.hasNext()){

        }*/

         /////使用HashMap集合表达JS对象
        HashMap<String,Object> p=new HashMap<>();
        p.put("name","张三");
        p.put("age",15);
        HashMap<String,Object> p1=new HashMap<>();
        p1.put("name","赵四");
        p1.put("age",18);
        ArrayList<HashMap<String,Object>> ps=new ArrayList();
        ps.add(p);
        ps.add(p1);
        StringBuilder sb=new StringBuilder("[");
        for (HashMap<String,Object> hm:ps){
            sb.append("{");
            for (String key:hm.keySet()){
                sb.append("\""+key+"\":\""+hm.get(key)+"\",");

            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("},");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        System.out.println(sb.toString());
    }
    public static int mk(int count){
        ArrayList<Integer> monkeys=new ArrayList<>();
        //吧数组放到集合
        for (int i=1;i<=count;i++){
            monkeys.add(new Integer(i));
        }
        //吧集合放到迭代器里
        ListIterator<Integer> it=monkeys.listIterator();
        int i=0;
        while(monkeys.size()>1){//要调用迭代器的remove方法，删到剩一个
            if (it.hasNext()){//判断是否有迭代的元素
                i++;
                it.next();
                if (i%7==0){
                    it.remove();
                }
            }else {
                while (it.hasPrevious()){
                    it.previous();
                }
            }
        }
        System.out.println(monkeys);
        return 0;
    }

}
class Person{
    private String name;
    private int age;
}