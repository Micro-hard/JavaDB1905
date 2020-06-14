package Year_2019_7_24_extend;

public class CheckAccount extends Account {
    private double overdraft;//可透支限额

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
        super(id,balance,annualInterestRate);
        this.overdraft=overdraft;
    }

    public void withdraw(double amount) {//取款
        if(amount<getBalance()){
            setBalance(getBalance()-amount);
        }
        if (amount>getBalance()){
            double tmp=amount-getBalance();//需要透支的额度
            if(overdraft>tmp){
                setBalance(0);
                setOverdraft(getOverdraft()-tmp);
            }
            else {
                System.out.println("超过可透支额的限额");
            }
        }
    }
    public void display(){
        System.out.println("余额："+this.balance+"可透支："+this.overdraft);
    }

    public static void main(String[] args) {
        CheckAccount test=new CheckAccount(1122,20000,0.045,5000);
        test.withdraw(5000);
        test.display();
        test.withdraw(18000);
        test.display();
        test.withdraw(3000);
        test.display();
    }
}
