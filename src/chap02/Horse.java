package chap02;

public class Horse extends Animal {

	@Override
	public void doStuff(Animal a) {
		System.out.println("Horse version");
	}

	// Overloaded version of Animal.doStuff(Animal a)
	// Overidden version of Animal.doStuff(Horse a)
	@Override
	public void doStuff(Horse h) {
		System.out.println("Horse version that takes Horse param");
	}
}
