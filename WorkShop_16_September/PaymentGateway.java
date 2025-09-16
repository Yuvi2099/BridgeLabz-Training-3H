package WorkShop_16_September;
// Superclass
class Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " initiated.");
    }
}

// Subclass for Credit Card
class CreditCard extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card.");
    }
}

// Subclass for Debit Card
class DebitCard extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Debit Card.");
    }
}

// Subclass for UPI
class UPI extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
}

// Main class
public class PaymentGateway {
    public static void main(String[] args) {
        Payment payment;   // Reference of superclass

        // Pay using CreditCard
        payment = new CreditCard();
        payment.pay(1000);

        // Pay using DebitCard
        payment = new DebitCard();
        payment.pay(2000);

        // Pay using UPI
        payment = new UPI();
        payment.pay(500);
    }
}