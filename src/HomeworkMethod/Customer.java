package HomeworkMethod;
/*         222222*/

/**
 * 111111111111111111111
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public Customer(String f, String l) {//构造
        this.firstName = f;
        this.lastName = l;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Smith", "Jane");
        customer.account = new Account(1000, 2000, 0.0123);
        //customer.account.setId(1000);//ID
        //customer.account.setBalance(2000);//余额
        //customer.account.setAnnualInterestRate(0.0123);//年利率
        customer.account.deposit(100);
        customer.account.withdraw(960);
        customer.account.withdraw(2000);
        System.out.println("Customer[" + customer.firstName + "," + customer.lastName + "]has a account :id is" + customer.account.getId() + ",annuallnterestRate is " + customer.account.getAnnualInterestRate() * 100 + "%,balance is" + customer.account.getBalance());
    }
}
