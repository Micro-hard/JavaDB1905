package Year_2019_8_19_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

/**
 * 日志工具类
 * 日志的扩展名是log，以日期为文件名
 * 文件有两种，一种是info，另一种是err
 * <p>
 * 指定一个目录
 */
public class LogUtil {
    public static void log(String str1, String str2) {
        File file_1;
        File file_2 = null;
        FileOutputStream info = null;
        FileOutputStream err = null;
        Calendar calendar = Calendar.getInstance();
        String time = calendar.getTime().toLocaleString();
        switch (str2) {
            case "info":
                System.out.println("test1111");
                file_1 = new File("D:\\IO819\\" + calendar.get(Calendar.YEAR) + calendar.get(Calendar.MONTH) + calendar.get(Calendar.DATE) + "." + str2);
                if (file_1.exists()) {
                    System.out.println("test12222");
                    try {
                        info = new FileOutputStream(file_1, true);
                        info.write(("\n" + str1 + time).getBytes());
                        System.out.println("test1333");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("test44444");
                    try {
                        file_1.createNewFile();
                        info = new FileOutputStream(file_1, true);
                        info.write(("\n" + str1 + time).getBytes());
                        System.out.println("test5555");
                    } catch (IOException e) {
                        System.out.println("创建日志文件出错");
                        e.printStackTrace();
                    }
                }
                break;

            case "err":
                file_2 = new File("D:\\IO819\\" +calendar.get(Calendar.YEAR) + calendar.get(Calendar.MONTH) + calendar.get(Calendar.DATE) + "." + str2);
                if (file_2.exists()) {
                    try {
                        err = new FileOutputStream(file_2, true);
                        err.write(("\n" + str1 + time).getBytes());
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {

                        e.printStackTrace();
                    }
                } else {
                    try {
                        file_2.createNewFile();
                        err = new FileOutputStream(file_2, true);
                        err.write(("\n" + str1 + time).getBytes());
                    } catch (IOException e) {
                        System.out.println("创建日志文件出错");
                        e.printStackTrace();
                    }
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
