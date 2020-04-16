package chap9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.Stream;

public class Tests1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		Stream<Integer> stream = nums.stream();
		long count = stream.peek(e -> System.out.println("number is:" + e)) // print number
				.map(i -> i * i) // transform
				.filter(i -> i > 20) // filter
				.peek(s -> System.out.println("square is:" + s)) // print square
				.count(); // count
		System.out.println("count: " + count);

		OptionalDouble od = OptionalDouble.empty();
		System.out.println(od);// OptionalDouble.empty
		// System.out.println(od.getAsDouble());// NoSuchElementException: No value
		// present
		// Test Associativity
		double r1 = (1 + 2) + 3 / 3;
		System.out.println("r1=" + r1); // 4.0
		double r2 = 1 + (2 + 3) / 3;
		System.out.println("r2=" + r2); // 2.0
		Double dl = new Double(1.3);
		double d = dl;
		System.out.println(d);

		Optional<String> os = Optional.empty();
//		String s = os.get(); // NoSuchElementException: No value present
//		System.out.println(s);
		boolean b= false || false || false;
		System.out.println(b);
		String s="abc;def;ghi";
		System.out.println(s.split(";")[0]);
	}
}
