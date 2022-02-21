package chap08;

@FunctionalInterface
public interface DogQuerier extends SuperInterface{
	// Invalid '@FunctionalInterface' annotation;
	// DogQuerier is not a functional interface
	 default  boolean test1() {
		return false;
	}

	abstract boolean test2();

	// heritee de Object et redeclaree abstract
	abstract boolean equals(Object o);
}
