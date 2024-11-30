package BT13;

public class CreditCardPayment extends PaymentMethod {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;

    public CreditCardPayment(String transactionId, double amount, String cardNumber, String cardHolderName, String expiryDate) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment. Transaction ID: " + getTransactionId() +
                ", Amount: " + getAmount() + ", Card Number: " + cardNumber + ", Card Holder: " + cardHolderName);
    }
}
