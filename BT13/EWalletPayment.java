package BT13;

public class EWalletPayment extends PaymentMethod {
    private String walletId;
    private String walletProvider;

    public EWalletPayment(String transactionId, double amount, String walletId, String walletProvider) {
        super(transactionId, amount);
        this.walletId = walletId;
        this.walletProvider = walletProvider;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getWalletProvider() {
        return walletProvider;
    }

    public void setWalletProvider(String walletProvider) {
        this.walletProvider = walletProvider;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing e-wallet payment. Transaction ID: " + getTransactionId() +
                ", Amount: " + getAmount() + ", Wallet ID: " + walletId + ", Provider: " + walletProvider);
    }
}
