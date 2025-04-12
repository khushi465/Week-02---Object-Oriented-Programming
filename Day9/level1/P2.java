
import java.util.*;

class Customer {

    private String customerName;
    private int customerID;
    private ArrayList<BankAccount> accounts;

    Customer(String customerName, int customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.accounts = new ArrayList<>();
    }

    String getName() {
        return customerName;
    }

    int getID() {
        return customerID;
    }

    void addAccount(int accNo, double balance, Bank b) {
        BankAccount a = new BankAccount(accNo, customerName, balance);
        b.openAccount(accNo, customerName, balance);
        accounts.add(a);
    }

    void viewBalance() {
        System.out.println(customerName);
        for (int i = 0; i < accounts.size(); i++) {
            System.out.print(accounts.get(i).getNumber() + "\t");
            System.out.println(accounts.get(i).getBalance());
        }
    }
    
}

class Bank {
    
    private String name;
    private ArrayList<BankAccount> accounts;
    
    Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    
    void openAccount(int accountNumber, String accountHolderName, double balance) {
        BankAccount a = new BankAccount(accountNumber, accountHolderName, balance);
        accounts.add(a);
    }
    
    String getName() {
        return name;
    }
    
    void viewAccounts() {
        System.out.println(name);
        for (BankAccount ba : accounts) {
            System.out.print(ba.getName() + "\t");
            System.out.print(ba.getNumber() + "\t");
            System.out.println(ba.getBalance());
        }
    }
}

class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String acountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = acountHolderName;
        this.balance = balance;
    }

    int getNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    String getName() {
        return accountHolderName;
    }

}

class Main {

    public static void main(String[] args) {
        Bank b1 = new Bank("HDFC");
        Bank b2 = new Bank("Axis");
        Customer c1 = new Customer("Khushi", 123);
        Customer c2 = new Customer("Esha", 434);
        c1.addAccount(111, 500, b1);
        c1.addAccount(112, 5200, b2);
        c2.addAccount(113, 100, b2);
        c1.viewBalance();
        c2.viewBalance();
        b1.viewAccounts();
        b2.viewAccounts();

    }
}
