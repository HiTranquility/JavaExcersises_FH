package BT13;

public class MobilePayment extends PaymentMethod {
    private String phoneNumber;
    private String operator;

    public MobilePayment(String transactionId, double amount, String phoneNumber, String operator) {
        super(transactionId, amount);
        this.phoneNumber = phoneNumber;
        this.operator = operator;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing mobile payment. Transaction ID: " + getTransactionId() +
                ", Amount: " + getAmount() + ", Phone Number: " + phoneNumber + ", Operator: " + operator);
    }
}

