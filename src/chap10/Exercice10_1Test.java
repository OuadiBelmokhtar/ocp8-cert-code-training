package chap10;

/**
 * Pour bien comprendre le principe de fonctionnement et d execution des threads,
 * prend le temps pour tracer/simuler l execution de ce prog en modelisant la
 * transition du thread par les differentes
 * etats(new->runnable->running->sleeping=>runnable).
 * start()->runnable: creating a thread of execution + new call stack
 * 
 * 
 * @author ouadi
 *
 */
public class Exercice10_1Test {
	public static void main(String[] args) {
		Exercice10_1Job job = new Exercice10_1Job();
		Thread worker = new Thread(job);
		worker.start();
		
		
	}
}
