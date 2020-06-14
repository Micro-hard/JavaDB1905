package Year_2019_8_19_IO;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class TestProperties {
    public String readProperties(String key1){
        String value="";
        Properties prop = new Properties();
        InputStream in = getClass().getResourceAsStream("log.properties");//从当前类路径得到配置文件创建输入流
        try {
            prop.load(in);// 加载输入流，让配置类分析出键值对
        } catch (IOException e) {
            e.printStackTrace();
        }
        Set keyValue = prop.keySet();
        for (Iterator it = keyValue.iterator(); it.hasNext();)
        {
            String key = (String) it.next();
            if (key.equals("savePath")){
                System.out.println("保存路径："+prop.getProperty(key));
            }
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(new TestProperties());
    }
}
