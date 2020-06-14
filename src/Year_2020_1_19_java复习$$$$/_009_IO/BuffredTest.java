package Year_2020_1_19_java复习$$$$._009_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffredTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("d:/hello.txt"));

        String str=null;
        while((str=br.readLine())!=null){
            System.out.println(str);
        }


        //System.out.println(str);

        br.close();
    }
}
