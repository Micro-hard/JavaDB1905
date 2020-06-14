package Year_2019_8_19_IO;



import java.io.*;
import java.util.Scanner;

public class 缓冲字节流 {
    public static void main(String[] args) {
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try {
            inputStream=new FileInputStream("D:\\IO819\\8888.txt");
            outputStream=new FileOutputStream("D:\\IO819\\9999.txt",true);//输出流时如果没有，就创建
            BufferedInputStream bis=new BufferedInputStream(inputStream,100);
            BufferedOutputStream bos=new BufferedOutputStream(outputStream,100);//缓冲区大小
            byte[] b=new byte[bis.available()];
            bis.read(b);
            System.out.println(new String(b,"gbk"));
            bis.close();
            bos.write(b);
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PrintStream print=new PrintStream("D:\\IO819\\8888.txt");
            print.append("1.39\n");
            print.print(2.9);
            print.print('u');
            print.print("usb");
            print.print(new Scanner(System.in));
            print.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
