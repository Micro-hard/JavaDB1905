package Year_2019_8_7_集合_泛型;

import java.util.ArrayList;
import java.util.Date;

public class Box<T> {//<>就是泛型
    private T obj;

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {

        return obj;
    }

    public static void main(String[] args) {
        //在使用过程中需要强转才能使用
        Box<String> box1=new Box<>();//注意尖角号的位置  在括号前面
        box1.setObj("学习是我快乐");
        box1.getObj().substring(0,2);
        Box<Integer> box2=new Box();
        box2.setObj(123);
        System.out.println(box2.getObj().intValue());
        ArrayList<String> List= new ArrayList<>();   //泛型
        List.add("oracle");
        //List.add(new Date());
        //List.add(35000);
       // List.add('c');
        System.out.println();
        float a=1.0f;
        double b=1.00;
        System.out.println(a==b);
        String s="aa";
        System.out.println(s);
        s+="222";
        System.out.println(s);
        String str1="123";
        String str4=str1+"efg";
        str1+="def";
        System.out.println(str4);
        System.out.println(str4.length());

    }
}
