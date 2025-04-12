
class BankAccount {

    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void getBankAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

}

class SavingsAccount extends BankAccount {

    int interestRate;

    SavingsAccount(int accountNumber, double balance, int interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
        super.getBankAccountDetails();
        System.out.println("Interest Rate: " + interestRate);
        
    }
    
}

class CheckingAccount extends BankAccount {
    
    double withdrawalLimit;
    
    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    
    void displayAccountType() {
        System.out.println("Checking Account");
        super.getBankAccountDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
        
    }
    
}

class FixedDepositAccount extends BankAccount {
    
    int numberOfFds;
    
    FixedDepositAccount(int accountNumber, double balance, int numberOfFds) {
        super(accountNumber, balance);
        this.numberOfFds = numberOfFds;
    }
    
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
        super.getBankAccountDetails();
        System.out.println("Number of Fixed Deposits: " + numberOfFds);
    }

}

class Main4 {

    public static void main(String[] args) {

        SavingsAccount o = new SavingsAccount(123, 20000, 12);
        o.displayAccountType();
        CheckingAccount c = new CheckingAccount(1243, 50000, 2000);
        c.displayAccountType();
        FixedDepositAccount f = new FixedDepositAccount(112, 100000, 3);
        f.displayAccountType();
    }
}
