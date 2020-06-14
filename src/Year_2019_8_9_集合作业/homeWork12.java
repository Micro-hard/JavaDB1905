package Year_2019_8_9_集合作业;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class homeWork12 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Tom", "CoreJava");
        hashMap.put("John", "Oracle");
        hashMap.put("Susan", "Oracle");
        hashMap.put("Jerry", "JDBC");
        hashMap.put("Jim", "Unix");
        hashMap.put("Kevin", "JSP");
        hashMap.put("Lucy", "JSP");
        hashMap.put("Allen", "JDBC");
        hashMap.put("Lucy", "CoreJava");
        Set<Map.Entry<String, String>> entry2 = hashMap.entrySet();//entry
        for (Map.Entry<String, String> entry1 : entry2) {
            System.out.println(entry1.getKey() + " " + entry1.getValue());
        }
        for (Map.Entry<String, String> entry1 : entry2) {
            if (entry1.getValue().equals("JSP")) {
                System.out.println(entry1.getKey());
            }
        }
        HashMap<Integer,Student> entrySet=new HashMap<>();
        entrySet.put(1,new Student("1",1,1,"0"));
        entrySet.put(2,new Student("1",1,1,"0"));
        entrySet.put(3,new Student("1",1,1,"0"));
        Set sets=entrySet.entrySet();
        for (Iterator<Map.Entry<Integer,Student>> it = sets.iterator();it.hasNext();){
            Map.Entry<Integer,Student> entry=it.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
