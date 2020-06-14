package Year_2019_8_19_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 写 {
    public static void main(String[] args) {
        //字节输出流
        String path = "D:\\IO819\\一个文件";
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(path, true);
                                                        //想记录创建输出流成功
            LogUtil.log("想记录创建输出流成功", "info");
            out.write("\n天终于晴了...".getBytes());
                                                        //想记录写成功
            Thread.sleep(1000);
                                                        //想记录写完成
        } catch (FileNotFoundException e) {
            System.out.println("文件没找见");
            LogUtil.log("文件没找见", "err");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO错误");
            LogUtil.log("IO错误", "err");
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
