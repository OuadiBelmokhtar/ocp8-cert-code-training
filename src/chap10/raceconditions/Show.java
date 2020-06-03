package chap10.raceconditions;

import java.util.HashSet;
import java.util.Set;

public class Show {
	// volatile makes sure that the creation and assigning process is atomic
	private static volatile Show INSTANCE;
	private Set<String> availableSeats;

	// MUST be synchronized to avoid creation of TWO instances
	public synchronized static Show getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Show();
		}
		return INSTANCE;
	}

	private Show() {
		System.out.println("Show constructor is called");
		availableSeats = new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}

	// MUST be synchronized in order to not book the SAME seat two times.
	// The problem of concurrent access and Race Condition could happen 
	// WITHIN HashSet:remove() method
	public synchronized boolean bookSeat(String name) {
		return availableSeats.remove(name);
	}

}
