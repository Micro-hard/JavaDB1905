package Year_2019_8_19_IO;

import java.io.File;
import java.io.IOException;

public class work2 {
    public static void isCunzai(File file){   //存在输出路径，大小，最后修改时间

        if (file.exists()){
            System.out.println("大小："+file.getTotalSpace());
            System.out.println("大小："+file.length()/1024);
            System.out.println("路径："+file.getPath());
            System.out.println("最后修改时间："+file.lastModified());
        }else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void creatFile(File file){    //创建多层目录    用mkdirs（）方法
        System.out.println(file.mkdirs());
    }
    public static void creatTempFile(){  //创建临时文件
        File file=new File("");
        for (int i=0;i<20;i++){
            try {
                file.createTempFile("888"+i,"txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        isCunzai(new File("D:\\IO819\\01.jpg"));
        creatFile(new File("D:\\IO819\\A\\B\\C"));
    }
}
