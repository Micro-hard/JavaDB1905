package Year_2019_8_18_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class read {
    public static void main(String[] args) {
        FileInputStream input=null;
        File file=new File("D:\\IO818\\AA.docx");
        //打开一个流
        try {            //文件未找到异常
            input=new FileInputStream(file);
            byte[] b=new byte[input.available()];
            input.read(b);
            System.out.println(new String(b,"gb2312")+"00");//字符集不同
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("读文件出错，有可能没权限");
        } finally {
            try {
                if (input!=null)
                    input.close();//如果创建输入输出流失败是不能调用close方法的
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
