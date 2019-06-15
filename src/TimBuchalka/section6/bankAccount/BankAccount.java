package TimBuchalka.section6.bankAccount;

public class BankAccount {


    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;


    public BankAccount() {
    }

    public BankAccount(String customerName, String email, int phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int value) {
        this.balance += value;
        System.out.println("You deposit " + value + "." + " Your balance now is " + this.balance);
    }

    public void withdraw(int value) {
        if (balance - value < 0) {
            System.out.println("Only " + balance + " availble.");
        } else {
            balance -= value;
            System.out.println("Withdrawal of " + value + " processed. Balance is now " + balance);
        }
    }
}