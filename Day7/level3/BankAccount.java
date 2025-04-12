
import java.util.*;

public class BankAccount {

    protected String accountHolder;
    public int accountNumber;
    private double balance;

    BankAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public void setBalance(double r) {
        balance = r;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountHolder, int accountNumber, double balance) {
        super(accountHolder, accountNumber);
        setBalance(balance);
    }

    public void displayBankAccountDetails() {
        System.out.println("accountHolder: " + accountHolder);
        System.out.println("accountNumber: " + accountNumber);
        System.out.println("balance: " + getBalance());
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter accountHolder, accountNumber and balance");
        String accountHolder = sc.next();
        int accountNumber = sc.nextInt();
        double balance = sc.nextDouble();
        SavingsAccount b = new SavingsAccount(accountHolder, accountNumber, balance);
        b.displayBankAccountDetails();
    }

}
