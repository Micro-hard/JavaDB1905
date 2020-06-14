package Year_2020_1_19_java复习$$$$._008_IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader2 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("d:/hello.txt");

//        int c=0;
//        while((c=fr.read())!=-1){ //一个一个字符都，直到结束返回-1
//            System.out.println((char)c);
//        }


//        char[] c=new char[300];  //浪费
//        int i=fr.read(c);//真正读到的字符数
//        System.out.println(new String(c,0,i));//将字符数组直接转成字符串,取其中一部分,否则会多出空格

        char[] c=new char[50];  //避免浪费，多次进行读取

        int i=0;

        while((i=fr.read(c))>0){ //需要i来接住返回值，
            System.out.println("--------"+i+"-----");
            System.out.println(new String(c,0,i));
        }

        fr.close();
    }
}
