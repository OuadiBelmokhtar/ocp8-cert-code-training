package chap10;
/**
 * Question: Est ce qu’on aura ce MÊME comportement si CHAQUE thread avait SON
 * PROPRE job (3 jobs différents) ? Ds ce cas, le Scheduler va t-il se comporter
 * de la MÊME manière pour ORCHESTRER LE TOUR entre les threads ? Ou bien on
 * aura 3 threads qui s’exécutent EN PARALLÈLE chacun sur SON PROPRE Job et ds
 * SA PROPRE callstack ?
 * 
 * @author ouadi
 *
 */
public class EachThreadWithItsOwnJob {
	public static void main(String[] args) {
		Runnable job1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + ", i=" + i);
			}
		};

		Runnable job2 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + ", i=" + i);
			}
		};

		Runnable job3 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + ", i=" + i);
			}
		};
		
		Thread worker1 = new Thread(job1, "worker1");
		Thread worker2 = new Thread(job2, "worker2");
		Thread worker3 = new Thread(job3, "worker3");
		worker1.start();
		worker2.start();
		worker3.start();
		
		
	}
	
	synchronized void  m1() {
		
	}
}
