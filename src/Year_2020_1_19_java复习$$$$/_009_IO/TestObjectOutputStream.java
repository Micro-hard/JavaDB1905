package Year_2020_1_19_java复习$$$$._009_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:/stream.txt",true));

        oos.writeBoolean(true);
        oos.writeChar('中');
        oos.writeFloat(56.67f);
        oos.writeDouble(88.98);

        oos.writeInt(100);
        oos.writeLong(987);

        //str
        oos.writeUTF("你是我的喜羊羊");
        oos.writeUTF("你是我的灰太狼");

        oos.writeObject(new Date());
    }
}
