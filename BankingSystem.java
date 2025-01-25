// Main class to demonstrate the Banking System
public class BankingSystem {
    public static void main(String[] args) {
        // Create different account types
        BankAccount savingsAccount = new SavingsAccount("12345", "John Doe", 5000);
        BankAccount currentAccount = new CurrentAccount("67890", "Jane Smith", 10000);

        // Demonstrate polymorphism
        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());
        System.out.println("Current Account Interest: " + currentAccount.calculateInterest());

        // Demonstrate deposit and withdrawal
        savingsAccount.deposit(2000);
        currentAccount.withdraw(1500);

        // Display balances
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}

// Abstract class representing a bank account
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}

// SavingsAccount class with unique interest calculation
class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

// CurrentAccount class with unique interest calculation
class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}
