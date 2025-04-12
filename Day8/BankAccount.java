
public class BankAccount {

    public static String bankName;
    public static int count;
    public String accountHolderName;
    public final int accountNumber;

    public static int getTotalAccounts() {
        return count;
    }

    public BankAccount(String accountHolderName, int accountNumber, String bankName) {
        count++;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    public void display() {
        System.out.println("Account Holder Name " + accountHolderName);
        System.out.println("Account Number " + accountNumber);
    }
    
}


class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bank name, account Holder name and account number");
        String bankName = sc.nextLine();
        String accountHolderName = sc.nextLine();
        int accountNumber = sc.nextInt();
        BankAccount obj = new BankAccount(accountHolderName, accountNumber, bankName);
        if (obj instanceof BankAccount) {
            System.out.println(BankAccount.getTotalAccounts());
            obj.display();
            System.out.println("Bank Name " + BankAccount.bankName);
        } else {
            System.out.println("Not an instance");
        }

    }
}
