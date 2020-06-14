package Year_2020_1_19_java复习$$$$._005Set;

import java.util.*;

public class TestSet2 {
    public static void main(String[] args) {
        //从1~1000000中取出10个数，（不重复），并排序输出
        int n=1000;
        //找出10个随机数，存在set
        Set<Integer> set=new HashSet<Integer>();
        Random random = new Random();
        while(set.size()<=10){
            set.add(random.nextInt(n)+1);
        }

        List<Integer> list=new ArrayList<Integer>(set);
        Collections.sort(list);

        System.out.println(set);
        System.out.println(list);
    }
}
