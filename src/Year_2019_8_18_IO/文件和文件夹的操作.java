package Year_2019_8_18_IO;

import java.io.File;

/**
 * 主讲File类
 */

public class 文件和文件夹的操作 {
    public static void getMyPath(File file, int i) { //递归打印文件夹信息
        if (file.isDirectory()) {//如果是路径就遍历这个目录的列表
            File[] files = file.listFiles();
            if (files != null) {
                for (int j = 0; j < i; j++)
                    System.out.print(" ");
                System.out.println(file.getPath());
            }
            for (File file1 : files) {
                getMyPath(file1, i + 4);
            }
        } else {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            System.out.println(file.getName());
        }
    }

    public static void deleteFile(File file){   //递归删除
        if (file.isDirectory()) {//如果是路径就遍历这个目录的列表
            File[] files=file.listFiles();
            if (files==null){
                System.out.println("test");
                file.delete();
            }
            if (files!=null){
                for (File file1:files){
                    deleteFile(file1);
                }
                file.delete();
            }
        }else {
            file.delete();
        }
    }

    public static void main(String[] args) {
        getMyPath(new File("D:\\IO818"), 0);
        deleteFile(new File("D:\\IO818"));
//        String path = "D:\\818IO";
//        File wj = new File(path);
//
//        String newpath = "D:\\IO818";
//        File wj1 = new File(newpath);
//        if (wj.canExecute()) {
//            if (wj.renameTo(wj1)) {
//                System.out.println("修改成功");
//            } else {
//                System.out.println("修改失败");
//            }
//
//        }

//        System.out.println(wj.exists());
//        System.out.println(wj.isFile());//是否是文件
//        System.out.println(wj.isDirectory());//是否是路径
//        System.out.println(wj.getParent());
//        System.out.println(wj.getPath());
//        System.out.println(wj.getAbsolutePath());

//        File abc = new File(wj1.getPath() + "\\a\\b\\c");
//        System.out.println(abc.mkdirs());   //创建目录
//        File tmp = new File("src/com/oracle/io/Account.java");
//        System.out.println("++" + tmp.exists() + "++");

//        File c = new File("c:\\");
//        for (File t : c.listFiles()) {    //File是文件和文件夹的抽象
//            if (t.isFile()) {//判断他是文件再找点
//
//                if (t.getName().contains("."))
//                    System.out.println(t.getName().substring(t.getName().indexOf('.')));
//            }
//            if (t.isDirectory()) {
//                File[] files = t.listFiles();
//                if (files != null)
//                    for (File tt : files) {
//                        System.out.println(tt.getPath());
//                    }
//            }
//        }
    }
}

