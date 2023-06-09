public interface BankAccountInterface {
    String FetchBalance(String password);
    double AddMoney(double amount);
    String WithdrawMoney(String password, double amount);
    String ChangePassword(String newPassword, String OldPassword);
    double CalculateInterest(int years);
}
