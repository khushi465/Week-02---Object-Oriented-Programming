
import java.util.*;

public class P2_BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    P2_BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void depositMoney(double amount) {
        balance += amount;
    }

    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Holder,  Account numberr and balance");
        String accountHolder = sc.nextLine();
        int accountNumber = sc.nextInt();
        double balance = sc.nextDouble();
        P2_BankAccount acc = new P2_BankAccount(accountHolder, accountNumber, balance);
        acc.display();
        acc.depositMoney(1200);
        acc.withdrawMoney(200);
        acc.display();

    }
}
