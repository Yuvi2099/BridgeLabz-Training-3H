package constructor.AccessModifiers;

class BankAccountModel {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccountModel() {
        this("Unknown", "Unknown", 0.0);
    }

    BankAccountModel(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccountModel {
    private double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: $" + getBalance() + ", Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccountModel a1 = new BankAccountModel("ACC1001", "Alice", 5000.0);
        a1.display();

        a1.setBalance(5500.0);
        System.out.println("Updated Balance: $" + a1.getBalance());

        SavingsAccount sa1 = new SavingsAccount("ACC2001", "Bob", 10000.0, 4.5);
        sa1.displaySavingsDetails();
    }
}

