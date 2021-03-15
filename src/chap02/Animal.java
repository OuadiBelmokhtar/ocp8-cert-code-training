package chap02;

public class Animal {
	public void doStuff(Animal a) {
		System.out.println("Animal version");
	}

	// Overloaded version
	public void doStuff(Horse h) {
		System.out.println("Animal version that takes Horse param");
	}
}
