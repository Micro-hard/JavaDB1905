package Year_2020_1_19_java复习$$$$._009_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建流
//        FileOutputStream os=new FileOutputStream("d:/stream.txt");
//
//        //2.写入字节
//        String str="hello world";
//        byte[] bytes=str.getBytes();//将字符串转成字节数组
//        os.write(bytes);
//
//        //3.关闭流
//        os.close();

        FileInputStream is=new FileInputStream("d:/stream.txt");

        byte[] bs=new byte[is.available()];  //创建字节数组，长度与流中的字节数相同
        System.out.println(Arrays.toString(bs));
        //读取流中的字节，并存在数组中
        is.read(bs);
        System.out.println(Arrays.toString(bs));

        String str=new String(bs);//字节数组转成字符串
        System.out.println(str);
        //3.关闭流
        is.close();
    }
}
