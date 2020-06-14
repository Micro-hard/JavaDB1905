package Year_2020_1_19_java复习$$$$._009_IO;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Download {
    public static void main(String[] args) {
        download("http://cms-bucket.ws.126.net/2020/0130/fb44c748j00q4xby1001qc000ak0057c.jpg?imageView&thumbnail=453y225&quality=85&type=webp","d:/aaa.jpg");
    }

    public static void download(String url,String fileName){
        //创建一个url
        try {
            URL u=new URL(url);
            URLConnection conn=u.openConnection();
            //获得字节流
            InputStream is=conn.getInputStream();
            FileOutputStream fos=new FileOutputStream(fileName);

            byte[] bs=new byte[2048];
            int size=0;
            while((size=is.read(bs))>0){
                fos.write(bs,0,size);
            }

            is.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
