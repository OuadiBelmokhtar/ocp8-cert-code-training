package chap06.generics;

//public class AnimalHolder<T extends Animal> 

public class AnimalHolder<T> {

	// using T is correct. It wont mean the same T declared in the class
	static <U> void staticMtd(U t) {
	}

	// Overloaded version
	static <U> void staticMtd(U[] t) {
	}

	public static void main(String[] args) {
		AnimalHolder.staticMtd(new Dog()); // (Dog) version
		Dog[] dogs = new Dog[3]; 
		AnimalHolder.staticMtd(dogs); // (Dog[]) version

		AnimalHolder<Dog> ahd = AnimalHolder.getMe(new Dog());
		AnimalHolder<Dog> ah = new AnimalHolder<Dog>();
		ah.notStaticMtd(new Dog());// OK
//		// The method staticMtd(Dog) is undefined for the type AnimalHolder
//		AnimalHolder.staticMtd(new Dog()); // KO
	}

	static <U> AnimalHolder<U> getMe(U u) {
		System.out.println("preparing " + u);
		return new AnimalHolder<U>();
	}

	static <U> AnimalHolder<U> getMe(U[] u) {
		System.out.println("preparing " + u);
		return new AnimalHolder<U>();
	}

	// Cannot make a static reference to the non-static type T
	static void staticMtd(T t) {
	}

	void notStaticMtd(T p) {
	}

	T a;
	T b = new T(); // Cannot instantiate the type T
	static T s; // Cannot make a static reference to the non-static type T
	T[] arr1; // OK
	T[] arr2 = new T[3]; // Cannot create a generic array of T

	void m1(T p) {
		if (p instanceof T) {
			// Cannot perform instanceof check against type parameter T. Use its erasure
			// Object instead since further generic type information will be erased at
			// runtime
		}
	}

//	public <T super Animal> T doSomeThing(T o) {
//	// Syntax error on token "super", , expected
//		T t = o;
//		return t;
//	}
}
