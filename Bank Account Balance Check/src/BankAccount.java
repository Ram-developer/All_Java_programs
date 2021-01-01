public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    public BankAccount(String accountNumber,double balance,String customerName,String email,String
                       phoneNumber){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Balance deposit on your account is "+depositAmount+" And Total balance" +
                "is "+this.balance);
    }
    public void withdrow(double withdrowalAmount){
        if ((this.balance-withdrowalAmount<0)){
            System.out.println("Your available balance is "+this.balance+" Withdrawal not processed");
        }
        else
        {
            this.balance-=withdrowalAmount;
            System.out.println("Withdrawal amount is "+withdrowalAmount+" Remaining balance is "+
                    this.balance);
        }
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(long balance) {
        this.balance = balance;

    }
    public double getBalance() {
        return getBalance();
    }

    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public String getCustomerName(){
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}