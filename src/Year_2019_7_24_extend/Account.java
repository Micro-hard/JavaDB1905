package Year_2019_7_24_extend;

public class Account {
    private int id;
    protected double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    /*public Account(){

    }*/

    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public void deposit (double amount){//存款
        this.balance+=amount;
    }
    public void withdraw (double amount){//取款
        if(this.balance-amount<0) {
            System.out.println("余额不足!\n您的账户余额为：" + this.balance);
            System.out.println("您的账户余额为：" + this.balance + "\n月利率为：" + getMonthlyInterest());
        }
        else
            this.balance-=amount;
    }
    public double getMonthlyInterest(){//返回月利率
        return annualInterestRate/12;
    }
    public void display(){
        System.out.println("您的账户余额为：" + this.balance + "\n月利率为：" + getMonthlyInterest());
    }

    public static void main(String[] args) {
        Account account=new Account(1122,20000,0.045);
        account.withdraw(30000);
        account.withdraw(2500);
        account.deposit(3000);
        account.display();
    }
}
