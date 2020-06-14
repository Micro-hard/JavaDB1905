package Year_2019_10_26_JDBC;

import java.sql.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//加载驱动
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/myfriend","root","");//链接
        System.out.println("链接成功");
        Statement sta=con.createStatement();//声明
        // sta.execute("insert into emp values('8888','10','项英浩','duck','2018-09-06','200','6666')");//发送sql


        /**                              高效率 直接查出来         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("用户名：");
        String name=scanner.nextLine();
        System.out.println("密码：");
        String password=scanner.nextLine();
        String sql="select * from user where name='"+name+"' and password='"+password+"'";
        ResultSet rs=sta.executeQuery(sql);
        if (rs.next()){
            System.out.println("登陆成功你的id是："+rs.getString(1));
        }else {
            System.out.println("用户名或密码错误");
        }
        sta.close();
        con.close();
    }
}
