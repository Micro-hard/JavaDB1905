package Year_2019_11_2_JDBC_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStatementDemo {//PrepareStatement防止sql注入，多次执行同一sql性能更佳。
    public static void main(String[] args) {
        Connection con=JdbcTools.getConnection();
        String sql="insert into user values(?,?,?)";
        try( PreparedStatement ps=con.prepareStatement(sql)){//不用close（）了，1.7后try里可以写
            ps.setInt(1,8);
            ps.setString(2,"name");
            ps.setString(3,"password");
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//selec * from studen 可以用statement
}
