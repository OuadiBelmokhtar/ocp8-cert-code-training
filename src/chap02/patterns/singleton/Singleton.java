package chap02.patterns.singleton;

// Impl using Lazy init and creation code look, with double-checked locking practice
public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
		System.out.println("Instanciation via constructeur");
	}

	public static Singleton getInstance() { // Don’t synchronize complete method
		if (instance == null) { // double-checked locking, in order to not perform block locking for each call
								// to this method. Which enhances exec performance.
			synchronized (Singleton.class) { // Synchronizing just code block that creates new instance.
				if (instance == null) {
					instance = new Singleton(); // Lazy initialization
				}
			}
		}
		return instance;
	}

}


