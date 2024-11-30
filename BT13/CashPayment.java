package BT13;

public class CashPayment extends PaymentMethod {
    public CashPayment(String transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing cash payment. Transaction ID: " + getTransactionId() + ", Amount: " + getAmount());
    }
}
