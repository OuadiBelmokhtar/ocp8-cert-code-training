package chap2.patterns;

// Impl using Lazy init and creation code look
public class Singleton {

	private static Singleton INSTANCE = null;

	private Singleton() {
		System.out.println("Instanciation via constructeur");
	}

	public static Singleton getInstance() { // Don’t synchronize complete method
		synchronized (Singleton.class) { // Synchronizing just code block that creates new instance.
			if (INSTANCE == null) {
				INSTANCE = new Singleton(); // Lazy initialization
			}
		}

		return INSTANCE;
	}

}
