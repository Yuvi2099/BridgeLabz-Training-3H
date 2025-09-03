package oops.level2;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 12345, 10000.0);

        acc1.displayBalance();
        System.out.println("------------------------");

        acc1.deposit(5000);
        acc1.displayBalance();
        System.out.println("------------------------");

        acc1.withdraw(3000);
        acc1.displayBalance();
        System.out.println("------------------------");

        acc1.withdraw(20000); // should show insufficient balance
        acc1.displayBalance();
    }
}
