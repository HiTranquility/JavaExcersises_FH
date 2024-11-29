package BT10;

public class Account {
	private String id;
	private String pin;
	private double balance;
	
	public Account (String id, String pin, double balance) {
		this.id = id;
		this.pin = pin;
		this.balance = balance;
	}
	
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "Account{id='" + id + "', balance=" + balance + '}';
    }
}