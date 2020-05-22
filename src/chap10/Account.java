package chap10;

/**
 * Example page 1060
 * 
 * @author ouadi
 *
 */
public class Account {

	private int balance = 50;

	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
		
	}
}
