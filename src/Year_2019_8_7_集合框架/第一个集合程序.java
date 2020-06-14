package Year_2019_8_7_集合框架;

import java.util.ArrayList;
import java.util.HashMap;

public class 第一个集合程序 {
    public static void main(String[] args) {
        //数组的缺点
        int[] array_int=new int[3];
        //array_int[3]=10;不能自动扩容  和减容
        //集合框架就是要解决这个问题
        //集合分为两种，一种时Collection
        //另一种时Map
        ArrayList n=new ArrayList();
        n.add("张宏");
        n.add("王刚");
        System.out.println(n.get(0));//下标

        HashMap m=new HashMap();
        m.put("001","张宏");
        m.put("002","王刚");
        System.out.println(m.get("001"));//界
    }
}
