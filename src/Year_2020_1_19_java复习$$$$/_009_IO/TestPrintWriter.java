package Year_2020_1_19_java复习$$$$._009_IO;

import java.io.*;

public class TestPrintWriter {
    public static void main(String[] args) throws IOException {
 //       try {
//            PrintWriter out=new PrintWriter("d:/hello.txt");
//
//            out.print("你是我的小苹果");
//            out.println("你是我的小苹果");
//            out.println("你是我的小苹果");
//            out.println("你是我的小苹果");
//            out.println("你是我的小苹果");
//            out.println("你是我的小苹果");
//
//            out.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //测试文本文件复制
        copy(new File("d:/hello.txt"),new File("d:/hello1.txt"));
    }

    /**
     * 自己的，将所有的读出来，一起写
     * @param src 源文件
     * @param dest 目标文件
     * @throws IOException
     */
    public static void copy(File src,File dest) throws IOException {  //文本文件的复制，
        BufferedReader br=new BufferedReader(new FileReader(src));
        String str=null;
        String txt="";
        while((str=br.readLine())!=null){
            System.out.println(str);
            txt+=str+"\n";        //写入写一个 \n ？？？？？
        }
        br.close();
        //读出文件内容
        System.out.println(str);
        System.out.println(txt);

        //向文件中写入

        PrintWriter pw=new PrintWriter(dest);
        pw.print(txt);
        pw.close();           //不要忘了关闭流，否则写不进去
        System.out.println("复制完成");
    }

    /**
     * 老师的方法，读一行写一行  ,！！！底下是字节流的方法！！！1
     * @param src
     * @param dest
     */
    public static void copy001(File src,File dest) throws IOException {
        //定义两个流
//        BufferedReader br=new BufferedReader(new FileReader(src));
//        PrintWriter out=new PrintWriter(dest);
//
//        String str=null;
//        while((str=br.readLine())!=null){
//            out.println(str);
//        }
//
//        br.close();
//        out.close();


        //创建两个流
        FileInputStream fis=new FileInputStream(src);
        FileOutputStream fos=new FileOutputStream(dest);

        byte[] bs=new byte[8192];// 8K
        int size=0;

        while((size=fis.read(bs))>0){
            fos.write(bs,0,size);//读多少写多少
        }

        //关闭流
        fis.close();
        fos.close();
    }
}
