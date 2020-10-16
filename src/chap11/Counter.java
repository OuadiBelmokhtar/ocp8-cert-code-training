package chap11;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	private AtomicInteger count = new AtomicInteger();

	public void increment() {
		count.getAndIncrement(); // atomic operation
	}
	
	public int getValue() {
		return count.intValue();
	}
}
