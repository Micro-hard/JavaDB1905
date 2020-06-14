package Year_2020_1_19_java复习$$$$._003List;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("张三丰");
        list.add("张三");
        list.add("张丰");
        list.add(new Date());
        //list.add(null);
        list.set(3,"赵云");
        list.remove(2);
        for (Object o:list
             ) {
            System.out.println(o);
        }

        List list1=new ArrayList();
        list1.add("令狐冲");
        list1.add("关羽");
        list1.add("张三丰");
        System.out.println(list1);

        list.addAll(list1);
        list.removeAll(list1);
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list.containsAll(list1));//list里含有list1集合所有元素

    }
}
