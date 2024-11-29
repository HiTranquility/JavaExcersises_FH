package BT10;
import java.util.ArrayList;
public class ATM {
	private ArrayList<Account> accountList;
	private Account inUsing;
	
	public ATM() {
		this.accountList = new ArrayList<>();
		this.inUsing = null;
	}
	
	public ArrayList<Account> getAccountList() {
		return accountList;
	}
	
	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}
	
	public Account getInUsing() {
        return inUsing;
    }

    public void setInUsing(Account inUsing) {
        this.inUsing = inUsing;
    }
    public void initializeData() {
        accountList.add(new Account("123", "1234", 1000));
        accountList.add(new Account("456", "5678", 2000));
        accountList.add(new Account("789", "9101", 1500));
    }
    public void showAllAccounts() {
        if (accountList.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account account : accountList) {
                System.out.println(account);
            }
        }
    }

    // Log in with an account ID and PIN
    public boolean login(String id, String pin) {
        for (Account account : accountList) {
            if (account.getId().equals(id) && account.getPin().equals(pin)) {
                inUsing = account;
                System.out.println("Logged in successfully.");
                return true;
            }
        }
        System.out.println("Invalid ID or PIN.");
        return false;
    }

    // Withdraw money
    public void withdraw(double money) {
        if (inUsing != null) {
            if (inUsing.getBalance() >= money) {
                inUsing.setBalance(inUsing.getBalance() - money);
                System.out.println("Withdrawal successful. New balance: " + inUsing.getBalance());
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("No account logged in.");
        }
    }

    // Recharge (deposit money)
    public void recharge(double money) {
        if (inUsing != null) {
            inUsing.setBalance(inUsing.getBalance() + money);
            System.out.println("Recharge successful. New balance: " + inUsing.getBalance());
        } else {
            System.out.println("No account logged in.");
        }
    }

    public void transfer(String id, double money) {
        if (inUsing != null) {
            if (inUsing.getBalance() >= money) {
                for (Account account : accountList) {
                    if (account.getId().equals(id)) {
                        inUsing.setBalance(inUsing.getBalance() - money);
                        account.setBalance(account.getBalance() + money);
                        System.out.println("Transfer successful. Your new balance: " + inUsing.getBalance());
                        return;
                    }
                }
                System.out.println("Recipient account not found.");
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("No account logged in.");
        }
    }

    public void logout() {
        if (inUsing != null) {
            System.out.println("Logged out successfully.");
            inUsing = null;
        } else {
            System.out.println("No account logged in.");
        }
    }
}
