package chap11;

import java.sql.DriverManager;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class ParallelStreamsTests {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// int sum = nums.stream().parallel().mapToInt(n -> n).sum();
		// * using peek()
		// int sum = nums.stream().parallel().peek(n -> System.out.println(n + ": " +
		// Thread.currentThread().getName())).mapToInt(n -> n).sum();
		// * using ForkJoingPool to specify the number of cores to use
		ForkJoinPool fjPool = new ForkJoinPool(2); // using only 2 cores
		int sum = 0;
		try {
			sum = fjPool.submit(() -> nums.stream().parallel()
					.peek(n -> System.out.println(n + ": " + Thread.currentThread().getName())).mapToInt(n -> n).sum())
					.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println(sum);
		
	}

	
}
