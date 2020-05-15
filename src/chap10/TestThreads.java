package chap10;

public class TestThreads {
	
	public static void main(String[] args) {
		// Creating a separate job
		Runnable runnableJob = () -> {
			for (int i = 1; i < 6; i++) {
				System.out.println("Runnable running " + i);
			}
		};
		
		// Instanciating the worker
		Thread worker = new Thread(runnableJob);
		// start the thread
		worker.start();
		
		System.out.println("Current Thread name: "+Thread.currentThread().getName());
	}
}
