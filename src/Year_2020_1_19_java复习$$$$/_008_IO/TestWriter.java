package Year_2020_1_19_java复习$$$$._008_IO;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("d:/hello.txt",true);//追加，false是覆盖
        fw.write("hello 111world,向文件写点啥呀？\r\n");
        fw.close();
    }
}
