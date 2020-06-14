package Year_2019_8_19_IO;

import java.io.*;

public class work6 {
    public static void copyFile(File file) {        //复制文件
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            byte[] b = new byte[fileInputStream.available()];
            fileInputStream.read(b);
            if (file.getPath().contains(".")) {  //路径有.
                String tmp1 = file.getPath().substring(file.getPath().indexOf('.'));
                file = new File(file.getPath().substring(0, file.getPath().indexOf('.')) + "copy" + tmp1);
            } else {   //路径没有.
                file = new File(file.getPath() + "copy");
            }
            System.out.println(file.getName());
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(b);
        } catch (
                FileNotFoundException e)

        {
            e.printStackTrace();
        } catch (
                IOException e)

        {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void copyDirectory(File file,File toFile) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        String filepath=file.getPath();//原路径
        String toFilepath=toFile.getPath();//复制到的路径
        File filetmp=null;
        String newPath=null;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            filetmp=new File(toFilepath);
            if (!filetmp.exists()){
                System.out.println("test!!!");
                filetmp.mkdir();
            }
            if (files != null) {
                    String s=filetmp.getPath();
                for (File file1 : files) {
                    String tmpString=file1.getPath().substring(file.getPath().length(),file1.getPath().length());//下一个文件夹和母文件夹差的字符串
                    newPath=s+"\\"+tmpString;
                    filetmp=new File(s+"\\"+tmpString+"copy");//新的路径=上一个新的路径+路径+copy
                    copyDirectory(file1,filetmp);
                }
            }
        } else {
            try {
                fileInputStream = new FileInputStream(file);
                byte[] b = new byte[fileInputStream.available()];
                fileInputStream.read(b);
                if (file.getPath().contains(".")) {  //路径有.
                    String tmp1 = file.getPath().substring(file.getPath().indexOf('.'));
                    file = new File(newPath+"\\"+file.getName().substring(0,file.getName().indexOf('.')) + "copy" + tmp1);
                } else {   //路径没有.
                    file = new File(newPath+"\\"+file.getName() + "copy");
                }
                System.out.println(file.getName());
                if (file.exists())
                    if (file.isFile())
                        file.createNewFile();
                fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(b);
            } catch (
                    FileNotFoundException e)

            {
                e.printStackTrace();
            } catch (
                    IOException e)

            {
                e.printStackTrace();
            } finally {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        //copyFile(new File("D:\\IO819\\8888.txt"));
        copyDirectory(new File("D:\\IO819\\test"),new File("D:\\IO819\\testCopy"));
    }
}
