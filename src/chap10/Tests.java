package chap10;

public class Tests {
	public synchronized static void main(String[] args) {
		System.out.println(Thread.currentThread().getId());
		
		Thread t = new Thread();
		t.start();
		try {
			// You MUST handle the checked exception
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		
	}
}
