import java.util.ArrayList;

class Account {
    int accountNumber;
    double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class Customer {
    String name;
    ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.accountNumber + ", Balance: " + account.balance);
        }
        System.out.println();
    }
}

class Bank {
    String name;
    ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, int accountNumber, double initialDeposit) {
        Account newAccount = new Account(accountNumber, initialDeposit);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account " + accountNumber + " opened for " + customer.name + " with balance " + initialDeposit);
    }

    public void displayCustomers() {
        System.out.println("Customers of " + name + ":");
        for (Customer customer : customers) {
            System.out.println(customer.name);
        }
        System.out.println();
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Customer customer1 = new Customer("Abhay");
        Customer customer2 = new Customer("Nishank");

        bank.openAccount(customer1, 101, 500000);
        bank.openAccount(customer1, 102, 1000000);
        bank.openAccount(customer2, 103, 7500000);

        bank.displayCustomers();

        customer1.viewBalance();
        customer2.viewBalance();
    }
}