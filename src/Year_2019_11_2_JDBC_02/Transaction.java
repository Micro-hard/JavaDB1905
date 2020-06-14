package Year_2019_11_2_JDBC_02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Transaction {   //事务练习
    /**
     * 购买图书
     * @param userid：用户id
     * @param bookid：图书id
     * @param amount：图书数量
     * @return
     */
    public boolean Buy(int userid,int bookid,int amount){
        Connection con=JdbcTools.getConnection();
        try{
            //查询图书的价格
            PreparedStatement ps=con.prepareStatement("select price from book where bookid=?");
            ps.setInt(1,bookid);
            ResultSet rs=ps.executeQuery();
            rs.next();
            int price=rs.getInt(1);
            System.out.println("价格："+price);
            //从用户表中减去花费
            ps=con.prepareStatement("update sys_user set remain=remain-? where userid=?");
            ps.setInt(1,price*amount);
            ps.setInt(2,userid);
            ps.execute();
            //验证用户余额
            ps=con.prepareStatement("select remain from sys_user where userid=?");
            ps.setInt(1,userid);
            rs=ps.executeQuery();
            rs.next();
            if (rs.getInt(1)<0){
                throw new Exception("余额不足");
            }
            //去库存
            ps=con.prepareStatement("update bookstore set count=count-? where bookid=?");
            ps.setInt(1,amount);
            ps.setInt(2,bookid);
            ps.execute();
            //验证库存
            ps=con.prepareStatement("select count from bookstore where bookid=?");
            ps.setInt(1,bookid);
            rs=ps.executeQuery();
            rs.next();
            if (rs.getInt(1)<0){
                throw new Exception("图书数量不足");
            }
            con.commit();
            System.out.println("购买成功");
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("购买失败");
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            return false;
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Transaction t=new Transaction();
        boolean flag=t.Buy(1,1,1);
    }
}
