package BT13;

public class Main {
	public static void main(String[] args) {
		PaymentMethod cash = new CashPayment("P01", 90.65);
		cash.processPayment();
		System.out.println();
		PaymentMethod creditCard = new CreditCardPayment("P02", 150, "8197498127", "LE DAO TAN THANH", "01/01/2030");
		creditCard.processPayment();
		System.out.println();
		PaymentMethod eWallet = new EWalletPayment("P03", 16.79, "03564728349", "Mono");
		eWallet.processPayment();
		System.out.println();
		PaymentMethod bankTransfer = new BankTransferPayment("P04", 189.76, "15872938754812", "Viettinbank");
		bankTransfer.processPayment();
		System.out.println();
		PaymentMethod mobile = new MobilePayment("P05", 19.45, "03564728349", "Viettel");
		mobile.processPayment();
		System.out.println();
		PaymentMethod crypto = new CryptoPayment("P06", 0.0001, "0d8f-9a9f-6c8d-0d0a", "Bitcoin");
		crypto.processPayment();
	}
}
