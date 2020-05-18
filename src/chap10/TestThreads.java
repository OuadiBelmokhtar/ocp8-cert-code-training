package chap10;

import java.util.Arrays;

public class TestThreads {
	
	public static void main(String[] args) {
		// Creating a separate job
		Runnable runnableJob = () -> {
			for (int i = 1; i < 6; i++) {
				System.out.println("Runnable running " + i);
			}
			System.out.println("Thread name inside run(): "+Thread.currentThread().getName());
		};
		
		// Instanciating the worker and passing the target Runnable
		Thread worker = new Thread(runnableJob);
		// start the thread
		worker.start();
		
		System.out.println("Thread name within main(): "+Thread.currentThread().getName());

	}
}
