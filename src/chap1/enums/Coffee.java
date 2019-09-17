package chap1.enums;

public class Coffee {
	// Enum declared inside the classe
	 enum CoffeeName {
		CAPPUCINO, NORMAL, CREME
	}

	// declaring instance variables of type enums
	String name;
	CoffeeSize size;
	// ...
 
	public Coffee() {

	}

	public Coffee(CoffeeName name, CoffeeSize size) {
		super();
		this.name = name.name();
		this.size = size;
	}
	public Coffee(String name, CoffeeSize size) {
		super();
		this.name = name;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", size=" + size + "]";
	}

}
