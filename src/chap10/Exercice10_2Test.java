package chap10;

public class Exercice10_2Test {
	public static void main(String[] args) {
		// the same object is shared by the 3 threads 
		StringBuffer letter = new StringBuffer("A");
		Exercice10_2JobWorker t1 = new Exercice10_2JobWorker(letter);
		Exercice10_2JobWorker t2 = new Exercice10_2JobWorker(letter);
		Exercice10_2JobWorker t3 = new Exercice10_2JobWorker(letter);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();
	}

}
