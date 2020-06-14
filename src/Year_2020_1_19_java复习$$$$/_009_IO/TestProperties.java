package Year_2020_1_19_java复习$$$$._009_IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws IOException {
        //读取properties的内容
        Properties p=new Properties();

        p.load(new FileReader("d:/hello.properties"));//加载

        System.out.println(p.entrySet());

        System.out.println(p.get("方便面"));
        System.out.println(p.getProperty("方便面"));

        p.setProperty("方便面","66");

        p.remove("啤酒");
        p.setProperty("矿泉水","68");
        p.setProperty("鱼片","65");
        System.out.println(p.entrySet());

        //将内存中的数据存到文件中
        p.store(new FileWriter("d:/a.properties"),null);
    }
}
