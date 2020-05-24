package chap10;

/**
 * Example page 1060
 * 
 * @author ouadi
 *
 */
public class WithdrawJob implements Runnable {
	private Account account;

	public WithdrawJob(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			makeWithdrawal(10);

			if (account.getBalance() < 0) {
				System.err.println("The account is overdrawn !");
			}
		}

	}

	private synchronized void makeWithdrawal(int amt) {

		if (account.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw. Balance BEFORE withdrawal: "
					+ account.getBalance());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.withdraw(amt);
			System.out.println(Thread.currentThread().getName()
					+ " completes the withdrawal. New balance AFTER withdrawal: " + account.getBalance());
		} else {
			System.err.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw: "
					+ account.getBalance());

		}

	}
}
