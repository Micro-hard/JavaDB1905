package Year_2019_7_29final_static_静态块;
public class Bank {
    private int username=0;
    public static int total;
    private String password;
    private double amount;//余额
    private static double lilv=0.02;//利率
    private static double minAmount=10.00;//最小余额

    public int getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getAmount() {
        return amount;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Bank(String password, double amount) {
        total++;
        username=total;
        this.password = password;
        this.amount = amount;
    }
    public void display(){
        System.out.println("账号:"+this.username +"密码："+this.password+"余额" +this.amount +"利率："+lilv+"最小余额："+lilv +minAmount);
    }

    public static void main(String[] args) {
        Bank bank1=new Bank("asd",100);
        Bank bank2=new Bank("abc",100);
        Bank bank3=new Bank("dd888",10);
        bank1.display();
        bank2.display();
        bank3.display();
    }
}
