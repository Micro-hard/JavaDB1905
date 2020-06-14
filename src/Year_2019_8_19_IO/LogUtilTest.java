package Year_2019_8_19_IO;

import java.io.*;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class LogUtilTest {
    public void readProperties(){
        Properties prop = new Properties();
        InputStream in = getClass().getResourceAsStream("D:\\IDEAPJT\\javadb1905\\src\\Year_2019_8_19_IO\\log.properties");
        try {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Set keyValue = prop.keySet();
        for (Iterator it = keyValue.iterator(); it.hasNext();)
        {
            String key = (String) it.next();
        }

    }
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
                        System.out.println();
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
                        System.out.println();
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
                        System.out.println();
                        e.printStackTrace();
                    }
                } else {
                    try {
                        file_2.createNewFile();
                        err = new FileOutputStream(file_2, true);
                        err.write(("\n" + str1 + time).getBytes());
                    } catch (IOException e) {
                        System.out.println();
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

    public static void main(String[] args) {
        LogUtilTest l=new LogUtilTest();
        l.readProperties();
    }
}
