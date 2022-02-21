package chap08;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Tests2 {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = v -> v * 2;
		Function<Integer, Integer> f2 = v -> v + 1;
		Integer r1 = f1.andThen(f2).apply(5); // 5*2=10+1=11
		System.out.println("andThen result: " + r1); // 11
		Integer r2 = f1.compose(f2).apply(5); // 5+1=6*2=12
		System.out.println("compose result: " + r2); // 12
		
		Stream<Integer> s=Stream.of(1,2,3,4);
		s.forEach(System.out::print);//  1234
	}
	
	

}
