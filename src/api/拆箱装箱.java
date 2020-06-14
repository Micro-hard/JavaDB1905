package api;

import java.util.ArrayList;

public class 拆箱装箱 {
    public static void main(String[] args) {
        int i = 100;
        double d=100.1234;
        Integer ii=new Integer(i);//装箱
        Double dd = new Double(d);
        double ddd=dd.doubleValue();//拆箱
        ArrayList arrayList=new ArrayList();
        arrayList.add(new Integer(1));
        arrayList.add(100);
        //吧字符串变整形
        String number1="1000";
        System.out.println(Integer.parseInt(number1)+90);
        //吧字符串变浮点数
        String number2="1900.8";
        System.out.println(Double.parseDouble(number2)+90);
    }
}
