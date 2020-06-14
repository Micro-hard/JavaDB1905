package HomeworkMethod;

public class Account {
    private int id;//ID
    private double balance;//余额
    private double annualInterestRate;//年利率

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Account(int id, double balance, double annualInterestRate) {//构造
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {//取款
        if (this.balance - amount < 0)
            System.out.println("余额不足，取款失败");
        else {
            this.balance -= amount;
            System.out.println("成功取出："+amount);
        }
    }

    public void deposit(double amount) {//存款
        this.balance += amount;
        System.out.println("成功存入：" + amount);
    }
}
