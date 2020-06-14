package Year_2019_8_19_IO;



import java.io.*;

public class 字符流 {
    public static void main(String[] args) throws IOException {
        //字符缓冲   一行一行读
        BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\\\IO819\\\\8888.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("D:\\\\IO819\\\\8888.txt"));
        String line="";
        while ((line=bufferedReader.readLine())!=null){
            bw.write(bufferedReader.readLine().replace("int","aaa"));
        }
        bufferedReader.close();


//        BufferedOutputStream w=new BufferedOutputStream(new FileOutputStream("D:\\IO819\\8888.txt"));
//        w.write("多么美好的一天".getBytes("UTF-8"));
//        w.close();
//
//
//        Reader reader=new FileReader("D:\\IO819\\8888.txt");
//
//        FileWriter writer=new FileWriter("D:\\IO819\\8888.txt");
//        BufferedWriter bufferedWriter=new BufferedWriter(writer);
//        bufferedWriter.write("学习使我快乐");
//        bufferedWriter.newLine();
//        bufferedWriter.write("what's the fucking day!");
//        bufferedWriter.append("李克强来哈尔滨谈就业");
//        bufferedWriter.close();
//        //writer.write("哈哈sdasd\r\nhahahaha");
//        writer.close();
//        System.out.println(new String(((char)reader.read()+"").getBytes(),"UTF-8"));
//        System.out.println(new String(((char)reader.read()+"").getBytes(),"UTF-8"));
//        System.out.println(new String(((char)reader.read()+"").getBytes(),"UTF-8"));
//        System.out.println(new String(((char)reader.read()+"").getBytes(),"UTF-8"));
//        System.out.println(new String(((char)reader.read()+"").getBytes(),"UTF-8"));
//        System.out.println(new String(((char)reader.read()+"").getBytes(),"UTF-8"));
//        System.out.println(new String(((char)reader.read()+"").getBytes(),"UTF-8"));
//
//        reader.close();
    }
}
