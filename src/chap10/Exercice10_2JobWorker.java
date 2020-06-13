package chap10;

public class Exercice10_2JobWorker extends Thread {

	private StringBuffer letter;

	public Exercice10_2JobWorker(StringBuffer letter) {
		this.letter = letter;
	}

	@Override
	public void run() {

		synchronized (letter) {
			for (int i = 0; i < 100; i++) {
				// noter bien l affichage du nom du Thread en cours d execution
				// pr un affichage claire
				System.out.print(Thread.currentThread().getName() + ", " + letter);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			if (letter.toString().equals("A")) {
				letter.setCharAt(0, 'B');
			} else if (letter.toString().equals("B")) {
				letter.setCharAt(0, 'C');
			}
		}
	}

}
