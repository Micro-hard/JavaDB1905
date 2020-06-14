package Year_2019_11_2_JDBC_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTools {
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //获得数据库的链接
    public static Connection getConnection(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/transaction","root","");
            con.setAutoCommit(false);//手动控制事务
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
