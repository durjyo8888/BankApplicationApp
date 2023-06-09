import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("HDFCAccount");

       HDFCAccount hdfcAccount = new HDFCAccount("durjyo", 1000, "durjyo888");
       System.out.println("Congrats!"+hdfcAccount.getName()+"Your Account has been Created with AccountNo: "+hdfcAccount.getAccountNo());

       //Add Money to Account
        System.out.println("Money has been added. New balance is: "+hdfcAccount.AddMoney(100000));

        //withdraw money both case correct or wrong
        System.out.println(hdfcAccount.WithdrawMoney("reddy123", 50000));
        System.out.println(hdfcAccount.WithdrawMoney("durjyo888", 50000));

        //fatch balance for Account
        System.out.println(hdfcAccount.FetchBalance("durjyo888"));

        //change password for Account
        System.out.println(hdfcAccount.ChangePassword("kd123", "durjyo888"));

        //CalculateInterest
        System.out.println("Enter the number of years to calculate interest");
        int years = sc.nextInt();
        System.out.println("Interest for "+ years + " years is " + hdfcAccount.CalculateInterest(years));
        System.out.println();


        //SBI Account
        System.out.println("SBIAccount");

        SBIAccount sbiAccount = new SBIAccount("Reddy", 500, "reddy888");
        System.out.println("Congrats!"+sbiAccount.getName()+"Your Account has been Created with AccountNo: "+sbiAccount.getAccountNo());

        //Add Money to Account
        System.out.println("Money has been added. New balance is: "+sbiAccount.AddMoney(10000));

        //withdraw money both case correct or wrong
        System.out.println(sbiAccount.WithdrawMoney("reddy888", 50000));
        System.out.println(sbiAccount.WithdrawMoney("reddy888", 5000));

        //fatch balance for Account
        System.out.println(sbiAccount.FetchBalance("reddy888"));

        //change password for Account
        System.out.println(sbiAccount.ChangePassword("kdreddy123", "reddy888"));

        //CalculateInterest
        System.out.println("Enter the number of years to calculate interest");
        int year = sc.nextInt();
        System.out.println("Interest for "+ year + " years is " + sbiAccount.CalculateInterest(year));

    }
}