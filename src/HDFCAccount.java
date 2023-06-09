import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{
    private String name;
    private String AccountNo;
    private double balance;
    private String password;
    final double rateOfInterest = 6.1;

    //default constructor or no argument constructor
    public HDFCAccount() {

    }

    public HDFCAccount(String name,double balance, String password) {
        this.name = name;
        this.AccountNo = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String FetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your current balance is :"+this.balance;
        }
        return "Incorrect Password";
    }

    @Override
    public double AddMoney(double amount) {
       this.balance += amount;
       return balance;
    }

    @Override
    public String WithdrawMoney(String password, double amount) {
        if(this.password.equals(password)){
            if(amount <= this.balance){
                this.balance -= amount;
                return "Money has been withdraw. The remaining balance is :"+this.balance;
            }
            else{
                return "Insufficiant balance";
            }
        }
        return "Incorrect Password";
    }

    @Override
    public String ChangePassword(String newPassword, String OldPassword) {
        if(this.password.equals(OldPassword)){
            this.password = newPassword;
            return "Congrats! Your password has been Updated";
        }
        return "Incorrect Password";
    }

    @Override
    public double CalculateInterest(int years) {
        return (this.balance * rateOfInterest * years)/100;
    }
}
