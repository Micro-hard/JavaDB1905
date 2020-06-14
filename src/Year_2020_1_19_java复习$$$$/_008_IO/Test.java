package Year_2020_1_19_java复习$$$$._008_IO;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File dir=new File("d:/file/abc/cba/a/b");

        System.out.println(dir.isDirectory());
        if(dir.isDirectory()){
            System.out.println(dir+"是一个目录");
            System.out.println("此文件夹中的子文件有");

            File[] fs=dir.listFiles();
            for(File f:fs){
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
