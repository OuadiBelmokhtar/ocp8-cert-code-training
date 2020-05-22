package chap10;

public class Exercice10_1Job implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i+" ");
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 10 == 0) {
				System.out.print("Tic Tic Tic ");
			}
		}

	}
}
