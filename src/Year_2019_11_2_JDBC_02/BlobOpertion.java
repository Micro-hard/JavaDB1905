package Year_2019_11_2_JDBC_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlobOpertion {
    public static void main(String[] args) throws SQLException, IOException {
        String sql="insert into book values(null ,?,?,?,?)";
        try(Connection con=JdbcTools.getConnection();PreparedStatement ps=con.prepareStatement(sql)){
            //创建Blob
            Blob blob=con.createBlob();
            OutputStream ois=blob.setBinaryStream(1);//从头开始写
            FileInputStream fis=new FileInputStream("C:\\Users\\11466\\Desktop\\图片\\01.jpg");
            //创建字节数组
            byte[] bs=new byte[fis.available()];
            fis.read(bs);
            fis.close();
            //写到blob中
            ois.write(bs);
            ois.close();
            //执行ps
            ps.setString(1,"百年孤独");
            ps.setInt(2,59);
            ps.setString(3,"马斯克");
            ps.setBlob(4,blob);
            ps.execute();
            con.commit();
        }
    }
}
