public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public BankAccount() {
        this("123456", 200, "Default Name",
                "Default email", "Default phone");
        //CALLING A CONSTRUCTOR FROM A CONSTRUCTOR! TO SET DEFAULT VALUES!
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
        System.out.println("Call constructor with parameters");
    }


    public BankAccount(String customerName, String customerEmail, String phoneNumber) {
        this("99999", 100, customerName, customerEmail, phoneNumber);
        //this helps with code duplication
        //this.customerName = customerName;
        //this.customerEmail = customerEmail;
        //this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount) {
        this.balance = balance + amount;
    }

    public void withdrawFunds(double amount) {
        if (this.balance - amount >= 0) {
            this.balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("12345", 200, "Mer",
                "mer@email", "234567" );
        //BankAccount myAccount = new BankAccount();
        System.out.println(myAccount.balance);
        myAccount.withdrawFunds(200);
        System.out.println(myAccount.balance);
        myAccount.depositFunds(130);
        System.out.println(myAccount.balance);
        myAccount.withdrawFunds(20);
        System.out.println(myAccount.balance);
        myAccount.withdrawFunds(140);
        System.out.println(myAccount.balance);

        //bank account made with a constructor where 2 fields are default and 3 are not
        BankAccount accountThirdConstructor = new BankAccount("Mer", "mer@mer.com", "546473");
        System.out.println(accountThirdConstructor.getAccountNumber() + " name " + accountThirdConstructor.customerName);

    }

}
