package chap10;

public class BumpedThread {
	public static void main(String[] args) {
		Runnable runnableJob = () -> {
			for (int i = 1; i < 400; i++) {
				System.out.println("Run by " + Thread.currentThread().getName() + ", i is " + i);
			}
		};

		// all threads are using the same target runnable
		Thread worker1 = new Thread(runnableJob);
		Thread worker2 = new Thread(runnableJob);
		Thread worker3 = new Thread(runnableJob);
		// each thread has it's name
		worker1.setName("Fred");
		worker2.setName("Lucky");
		worker3.setName("Ricky");
		// start all threads
		worker1.start();
		worker2.start();
		worker3.start();
	}
}
