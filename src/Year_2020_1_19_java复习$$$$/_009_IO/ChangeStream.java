package Year_2020_1_19_java复习$$$$._009_IO;

import java.io.*;

public class ChangeStream {
    public static void main(String[] args) throws Exception {
        //已知一个字节流
        FileInputStream fis=new FileInputStream("d:/stream.txt");
        //转换包装
        Reader r=new InputStreamReader(fis);  //字节流转成字符流
        //包装成一个更容易操作的缓冲流
        BufferedReader br=new BufferedReader(r);  //转成缓冲的，这样可以读一行了

        String str=null;
        while((str=br.readLine())!=null){
            System.out.println(str);
        }

        //关闭流
        br.close();


        //已知一个字节流
        FileOutputStream fos=new FileOutputStream("d:/stream.txt");

        Writer w=new OutputStreamWriter(fos);

        PrintWriter out=new PrintWriter(w);

        out.print("hello world;世界那么大，我要去看看");

        out.close();
    }
}
