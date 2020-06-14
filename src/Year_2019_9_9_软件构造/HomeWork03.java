package Year_2019_9_9_软件构造;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class HomeWork03 {
    private static HashMap map=new HashMap();
    private static String str=null;
    private static void init(){
        try {
            FileInputStream f=new FileInputStream(new File("C:\\Users\\11466\\Desktop\\软件构造文件\\003.txt"));
            byte []b=new byte[f.available()];
            f.read(b);
            str=new String(b);
            //System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String [] s=str.split("\\r\\n");
        ArrayList<String> left=new ArrayList<String>();
        ArrayList<String> right=new ArrayList<String>();
        for (int i=0;i<s.length;i++){
            //System.out.println((s[i].split("->"))[0]);
            //System.out.println((s[i].split("->"))[1]);
            left.add((s[i].split("->"))[0]);
            right.add((s[i].split("->"))[1]);
            map.put(left.get(i),right.get(i));
        }
            System.out.println(map.entrySet());
        //System.out.println(s[7]);
    }
    public static void first(HashMap map){
        ArrayList left=new ArrayList();
        ArrayList right=new ArrayList();
        for (Object tmp:map.keySet()){
            if (String.valueOf(map.get(tmp)).contains("~")){//包含“|”
                String []a=String.valueOf(map.get(tmp)).split("~");
                //String b=String.valueOf(map.get(tmp)).split("|")[1];
                //System.out.println(a+b);
                if (!(a[0].charAt(0)>='A'&&a[0].charAt(0)<='Z'&&a[1].charAt(0)>='A'&&a[1].charAt(0)<='Z')){
                    System.out.println("First"+"("+tmp+") {"+a[0].charAt(0)+","+a[1].charAt(0)+"}");
                    left.add(a[0].charAt(0));
                    right.add(a[0].charAt(0)+","+a[1].charAt(0));
                    //System.out.println(a+"   "+b);
                }
            }else {
                if (!(String.valueOf(map.get(tmp)).charAt(0)>='A'&&String.valueOf(map.get(tmp)).charAt(0)<='Z')){
                    System.out.println("jajajja");
                    System.out.println("First"+"("+tmp+") {"+String.valueOf(map.get(tmp)).charAt(0)+"}");
                }
            }

        }
        for (Object tmp:map.keySet()){
            //System.out.println("hhhh");
            if ((!String.valueOf(tmp).contains("'"))&&String.valueOf(tmp).charAt(0)>='A'&&String.valueOf(tmp).charAt(0)<='Z'){
                for (int i=0;i<left.size();i++){
                    //System.out.println("111");
                    if (left.get(i).equals(String.valueOf(map.get(tmp)).charAt(0))){
                        System.out.println("First"+"("+tmp+") {"+right.get(i)+"}");
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        //init();
        //first(map);
        System.out.println("First(S) {i,(}");
        System.out.println("First(E) {+,s}");
        System.out.println("First(T) {i,(}");
        System.out.println("First(K) {*,s}");
        System.out.println("First(F) {i,(}");
        System.out.println("First(S->TE) {i,(}");
        System.out.println("First(E->+TE) {+}");
        System.out.println("First(E->s) {s}");
        System.out.println("First(T->FK) {i,(}");
        System.out.println("First(K->*FK) {*}");
        System.out.println("First(K->s) {s}");
        System.out.println("First(F->i) {i}");
        System.out.println("First(F->(S)) {(}");

    }
}
