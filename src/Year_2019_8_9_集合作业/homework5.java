package Year_2019_8_9_集合作业;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class homework5 {
    public static void main(String[] args) {
    HashSet set=new HashSet();
        set.add("青撸");
        set.add("青撸");
        set.add("哈哈");
        set.add("秀琴");
        set.add("搓灰");
        for (Object s:set)
            System.out.println(s);
        for (Iterator it=set.iterator();it.hasNext();)
            System.out.println(it.next());
    }
}
