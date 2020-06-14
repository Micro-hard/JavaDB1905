package api;

import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;

public class StringDemo {
    public static void main(String[] args) {
        String str1="abc";      //字符串被优化过，所以可以直接用等号赋值  经常用
        String str2=new String("abc");
        String str3=new String();//定义一个空字符串，不是null
        char [] c={'h','e','l','l','o'};
        String str5=new String(c);   //根据字符数组生成新的字符串
        String str6=new String("你好".getBytes());
        //String(byte[] bytes,String charsetName)//字符数组
        try {
            String str7=new String("你好".getBytes(),"UTF-8");
            System.out.println(str7);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //因为字符串是不可变的，是被final修饰的类，你用+号的操作都会生成新的
        String str4=str1+"efg";
        str1+="def";
        System.out.println(str4.length());
        int number=12345678;
        System.out.println((number+"").length());
        //indexOf(String):int
        String browser ="MSIE WEBKIT ";
        if (browser.toLowerCase().indexOf("webkit")!=-1){
            System.out.println("这个是谷歌");
        }else if (browser.toLowerCase().indexOf("msie")!=-1)
            System.out.println("这个是微软");
        else
            System.out.println("啥也不是");
        System.out.println(browser.indexOf('W'));
        System.out.println(str1.indexOf("e"));
        System.out.println("hello".charAt(2));

        //substring(int):String
        System.out.println("helloword".substring(5));

        //substring(int start ,int end):String
        System.out.println("2019-08-02".substring(5,7));
        System.out.println("Compenent.java");
        String [] names={"alpha.txt","company.java","论文.docx"};
        System.out.println(names[0].substring(names[0].indexOf(".")+1));

        //concat  链接两个字符串
        System.out.println("abc".concat("def"));
        System.out.println("abc"+"def");

        //replace   替换
        System.out.println("aaabbbaaaccc".replace("aa","ddd"));

        //正则表达式
        System.out.println("aaabbbaaaccc".replaceAll("\\w","3"));
        System.out.println("   aa   ff".trim());

        //                                                    split
        String stunames="daivd.tom.rose.jack.jonh";
        String []array = stunames.split("\\.");
        System.out.println(array.length);

        //比较字符串
        String a="abc";
        String b="ABC";
                                //equald  Sring 类重写了  比较字符串中的第一个字符
        System.out.println(a.equalsIgnoreCase(b));//忽略大小写
        System.out.println("abd".compareTo("abc"));
        System.out.println(a==b);

        //找到2019年的订单
        String [] order={"201900011","201842131","201924443"};

        //找到扩展名为class的文件
        String [] file={"xx.java","yyy.cpp","zzz.class"};
        System.out.println(order[0].startsWith("2019")?order[0]:0);
        System.out.println(file[2].endsWith("class")?file[2]:0);
        String shadu="卡巴斯基#杀毒软件#免费版#俄罗斯";
        System.out.println(shadu.split("#")[0]);
        String haha="那车水马龙的人世间，那样的来 那样的去，太匆忙";
        System.out.println(haha.lastIndexOf("那")+1);

        String str10=new String("oracl");
        String str11=new String("oracl");//新对象
        String str12="oracle";/////////////////这个是字符串池
        String str13="oracle";
        System.out.println(str10==str11);
        System.out.println(str12==str13);
        System.out.println(str10.equals(str11));
        System.out.println(str12.equals(str13));

    }
}
class ss{
    private int name;

}
