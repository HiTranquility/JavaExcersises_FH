package BT10;

public class Main {
	public static void main(String[] args) {
		ATM atm = new ATM();
		System.out.println("ATM after initing:");
		atm.showAllAccounts();
		System.out.println("In using: " + atm.getInUsing());
		System.out.println();
		atm.initializeData();
		System.out.println("ATM after calling initializeData() method:");
		atm.showAllAccounts();
		System.out.println("In using: " + atm.getInUsing());
		System.out.println();
		System.out.println("Recharge but not logged in yet:");
		atm.recharge(50);
		atm.showAllAccounts();
		System.out.println("In using: " + atm.getInUsing());
		System.out.println();
		System.out.println("Login account:");
		atm.login("tanthanh", "12345678");
		atm.showAllAccounts();
		System.out.println("In using: " + atm.getInUsing());
		System.out.println();
		System.out.println("Recharge money:");
		atm.recharge(50);
		atm.showAllAccounts();
		System.out.println("In using: " + atm.getInUsing());
		System.out.println();
		System.out.println("Withdraw money:");
		atm.withdraw(100);
		atm.showAllAccounts();
		System.out.println("In using: " + atm.getInUsing());
		System.out.println();
		System.out.println("Transfer money:");
		atm.transfer("hoangphuc", 125);
		atm.showAllAccounts();
		System.out.println("In using: " + atm.getInUsing());
		System.out.println();
		System.out.println("Logout account:");
		atm.logout();
		atm.showAllAccounts();
		System.out.println("In using: " + atm.getInUsing());
		System.out.println();
		System.out.println("Recharge but logged out:");
		atm.recharge(50);
		atm.showAllAccounts();
		System.out.println("In using: " + atm.getInUsing());
		}
}
