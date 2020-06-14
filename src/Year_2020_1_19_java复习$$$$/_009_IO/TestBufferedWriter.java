package Year_2020_1_19_java复习$$$$._009_IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {
    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("d:/hello.txt",true);  //是否追加,true追加

        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("你是我的小apple");  //写入
        bw.newLine();  //换行
        bw.write("你是我的小apple");
        bw.newLine();
        bw.write("你是我的小apple");
        bw.newLine();

        bw.close();
    }
}
