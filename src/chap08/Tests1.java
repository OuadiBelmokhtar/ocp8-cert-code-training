package chap08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Tests1 {
	public static void main(String[] args) {
		Supplier<Integer> supp = () -> 20;

		System.out.println(supp.get());

		Consumer<String> redOrBlue = color -> {
			if (color.equals("red"))
				System.out.println("It is red");
			else if (color.equals("blue"))
				System.out.println("It is blue");
		};

		redOrBlue.accept("blue");

		List<String> listOfNames = Arrays.asList("Ahmed", "Taha", "Karim");
		// Performs the given action for each element of the Iterable until all elements
		// have been processed or the action throws an exception.
		listOfNames.forEach(name -> {
			if (name.equals("Taha"))
				System.out.println(name);
		});
		
		System.out.println("--- method reference ---");
		listOfNames.forEach(Tests1::testRef);

		BiConsumer<Integer, Integer> biC = (a, b) -> System.out.println(a + b);
		biC.accept(30, 40);
	
	}
	
	void testRef(String s) {
		
	}
}
