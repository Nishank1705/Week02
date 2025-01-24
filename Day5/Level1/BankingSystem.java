// Superclass BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void displayAccountType(){
        
    }
    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs" + balance);
    }

}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call to the superclass constructor
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call to the superclass constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Withdrawal Limit: Rs" + withdrawalLimit);
    }
}

// Subclass FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    double depositAmount;
    int depositTerm; // Term in months

    FixedDepositAccount(String accountNumber, double balance, double depositAmount, int depositTerm) {
        super(accountNumber, balance); // Call to the superclass constructor
        this.depositAmount = depositAmount;
        this.depositTerm = depositTerm;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Deposit Amount: Rs" + depositAmount);
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}

// Main class to test the system
public class BankingSystem {
    public static void main(String[] args) {
        // Creating objects of each class
        SavingsAccount savings = new SavingsAccount("SA123", 50000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA456", 30000.0, 20000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FDA789", 100000.0, 100000.0, 12);

        // Displaying information of each account
        savings.displayAccountType();
        savings.displayInfo();
        System.out.println();

        checking.displayAccountType();
        checking.displayInfo();
        System.out.println();

        fixedDeposit.displayAccountType();
        fixedDeposit.displayInfo();
    }
}
