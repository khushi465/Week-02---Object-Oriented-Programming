
import java.util.*;

interface Loanable{
    public boolean applyForLoan(double amount);
    public double calculateLoanEligibility();
}
abstract class BankAccount implements Loanable{
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    boolean granted=false;
    double loanAmount=0;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    int getAccNo(){return accountNumber;}
    String getName(){return accountHolderName;}
    double getBalance(){return balance;}
    
    void deposit(double amount){
        System.out.println("Amount of "+amount+" deposited to account "+accountNumber);
        System.out.println("Current Balance "+balance);
        
        balance+=amount;
    }
    void withdraw(double amount){
        if(balance>=amount&&balance>0&&amount>0){
            System.out.println("Amount of "+amount+" withdrawn from account "+accountNumber);
        System.out.println("Current Balance "+balance);
            balance-=amount;
        }
        else{
            System.out.println("Insufficient balance or Invalid Amount");
        }
    }
    public boolean applyForLoan(double amount){
      
        if(amount<=balance*2){
            granted=true;
            loanAmount=amount;
        }
        return granted;//2x of balance loan amount
    }
    public double calculateLoanEligibility(){
        return balance*2;
    }
    abstract double calculateInterest(double time);
    public String getAccountDetails() {
        return "Account: " + accountNumber + ", Holder: " + accountHolderName + ", Balance: $" + balance;
    }
}

class SavingsAccount extends BankAccount{
    private double interestRate=0.10;
    SavingsAccount(int accountNumber, String accountHolderName, double balance){
        super(accountNumber, accountHolderName, balance);
    }
    double calculateInterest(double time){
        return interestRate*time*getBalance();
    }
}
class CurrentAccount extends BankAccount{
    
    private double interestRate=0.07;
    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
    double calculateInterest(double time){
        return interestRate*time*getBalance();
    }
    
}
class BankManager {
    public static void processAccounts(List<BankAccount> accounts) {
        System.out.println("=== Account Summary ===");
        for (BankAccount account : accounts) {
            System.out.println(account.getAccountDetails());
            System.out.printf("Interest Earned: $%.2f%n", account.calculateInterest(1));
            System.out.printf("Loan Eligibility: $%.2f%n", account.calculateLoanEligibility());
            System.out.print("Loan Amount: "+account.loanAmount);
            System.out.println("------------------------");
        }
    }
}

// Main Application
class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accountList = new ArrayList<>();

        BankAccount acc1 = new SavingsAccount(001, "Alice Smith", 5000);
        BankAccount acc2 = new CurrentAccount(002, "Bob Johnson", 8000);

        acc1.deposit(1000);
        acc2.withdraw(500);
        acc1.applyForLoan(2000);


        accountList.add(acc1);
        accountList.add(acc2);

        // Polymorphic processing
        BankManager.processAccounts(accountList);
    }
}