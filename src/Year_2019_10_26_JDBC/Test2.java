package Year_2019_10_26_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");//加载驱动
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myfriend","root","");//链接
        System.out.println("链接成功");
        Statement sta=con.createStatement();//声明
        Scanner scanner=new Scanner(System.in);
        System.out.println("用户名：");
        String name=scanner.nextLine();
        System.out.println("密码：");
        String password=scanner.nextLine();
        ResultSet rs=sta.executeQuery("select * from user");//低效率登陆得全查出来一个一个比
        while (rs.next()){
            if (rs.getString(2).equals(name)&&rs.getString(3).equals(password)){
                System.out.println("success");
                break;
            }else {
                System.out.println("defeat");
                break;
            }
        }
    }
}
