package BT13;

public class CryptoPayment extends PaymentMethod {
    private String walletAddress;
    private String cryptoType;

    public CryptoPayment(String transactionId, double amount, String walletAddress, String cryptoType) {
        super(transactionId, amount);
        this.walletAddress = walletAddress;
        this.cryptoType = cryptoType;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public String getCryptoType() {
        return cryptoType;
    }

    public void setCryptoType(String cryptoType) {
        this.cryptoType = cryptoType;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing cryptocurrency payment. Transaction ID: " + getTransactionId() +
                ", Amount: " + getAmount() + ", Wallet Address: " + walletAddress + ", Crypto Type: " + cryptoType);
    }
}
