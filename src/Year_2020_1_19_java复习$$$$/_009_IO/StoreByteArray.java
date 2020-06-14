package Year_2020_1_19_java复习$$$$._009_IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Date;

public class StoreByteArray{
    public static void main(String[] args) throws Exception{
        ByteArrayOutputStream baos=new ByteArrayOutputStream();

        ObjectOutputStream oos=new ObjectOutputStream(baos);

        oos.writeObject(new Date());

        byte[] bs=baos.toByteArray();

        oos.close();

        System.out.println(Arrays.toString(bs));
        System.out.println(bs.length);




        ByteArrayInputStream bais=new ByteArrayInputStream(bs);
        ObjectInputStream ois=new ObjectInputStream(bais);
        Date date=(Date) ois.readObject();
        System.out.println(date);
    }
}
