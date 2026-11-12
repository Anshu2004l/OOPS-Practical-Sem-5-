class BankAccount {

    private final String accountHolder;
    private final String accountNumber;
    private double balance;

    BankAccount(String accountHolder, String accountNumber, double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative.");
        }
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit rejected: amount must be positive.");
            return false;
        }
        balance += amount;
        System.out.println("Deposit accepted: " + amount);
        return true;
    }

    boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Withdrawal rejected: insufficient balance.");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrawal accepted: " + amount);
        return true;
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Mira Shah", "AC1024", 1000.0);
        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Starting balance: " + account.getBalance());

        account.deposit(500.0);
        account.deposit(-20.0);
        account.withdraw(200.0);
        account.withdraw(0.0);
        account.withdraw(2000.0);

        System.out.println("Updated balance: " + account.getBalance());

        // Private fields cannot be changed directly by callers. All balance
        // changes pass through methods that reject invalid transactions.
    }
}
