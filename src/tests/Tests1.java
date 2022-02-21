package tests;

import java.sql.ResultSet;
import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Tests1 {
	enum SIZE {
		TALL, JUMBO, GRANDE
	};

	public static void main(String[] args) {
		int r1 = Integer.compare(6, 4);
		System.out.println(r1); // 1
		int r2 = Integer.compare(3, 7);
		System.out.println(r2); // -1

		int r3 = Integer.max(4, 8);
		System.out.println(r3); // 8

		DoubleStream ds = DoubleStream.of(0, 2, 4);
		double d = 2;
		float f = 8;
		new Object().hashCode();

		//
		TreeSet<SIZE> ts = new TreeSet<Tests1.SIZE>();
		ts.add(SIZE.JUMBO);
		ts.add(SIZE.TALL);
		ts.add(SIZE.GRANDE);
		ts.forEach(System.out::println);// TALL JUMBO GRANDE
//
		System.out.println(Duration.ofMinutes(160)); // PT2H40M
//
		Double db = 12.0;
		db = 3.8;
		System.out.println(db);
		//
		Stream.of(new ArrayList<String>());
		//
		int k = 2;
		for (; k <= 10; k++) {
			System.out.println(k + " "); // 2 3 4 5 6 7 8 9 10
		}
		//
		LocalTime start = LocalTime.of(11, 30);
		LocalTime end = LocalTime.of(13, 29);
		long timeConsumed = 0;
		timeConsumed = start.until(end, ChronoUnit.HOURS);
		System.out.println(timeConsumed);// 1
		//
		List<Integer> lst = Arrays.asList(1, 2, 3);
		lst.stream().forEach(x -> x = x + 1);
		lst.forEach(System.out::println); //1 2 3
		Locale myL;
		

	}
}
