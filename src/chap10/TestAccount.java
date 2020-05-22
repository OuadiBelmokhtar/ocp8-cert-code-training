package chap10;

/**
 * Example page 1060
 * 
 * @author ouadi
 *
 */
public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account(50);
		WithdrawJob withdrawJob = new WithdrawJob(account);
		Thread t1 = new Thread(withdrawJob, "Fred");
		Thread t2 = new Thread(withdrawJob, "Lucy");
		t1.start();
		t2.start();
	}

	
}
