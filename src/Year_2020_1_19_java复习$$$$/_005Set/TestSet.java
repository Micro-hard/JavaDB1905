package Year_2020_1_19_java复习$$$$._005Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();
        System.out.println(set.add("james"));
        System.out.println(set.add("james"));
        System.out.println(set.add("ames"));
        System.out.println(set.add("sames"));
        System.out.println(set.size());

        Iterator<String> ite=set.iterator();
        while(ite.hasNext()){
            String s=ite.next();   //不要多次调用next
            System.out.println(s);
            if(s.startsWith("ja")){
                ite.remove();
            }
        }
        System.out.println(set);
    }
}
