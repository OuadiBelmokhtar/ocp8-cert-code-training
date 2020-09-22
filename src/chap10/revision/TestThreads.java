package chap10.revision;

public class TestThreads {
	public static void main(String[] args) {
		// Define a job using Runnable and Lambda
		Runnable runnableTarget = () -> {
			System.out.println("run() de runnableTarget");
			for (int i = 1; i < 6; i++)
				System.out.println("Thread is running " + i);
			System.out.println("Thread name inside run(): " + Thread.currentThread().getName());
		};
		// Create a worker
		Thread worker = new Thread(runnableTarget);
		// Start the worker
		worker.start();
		
		System.out.println("Thread courant: " + Thread.currentThread().getName());
	}

}
