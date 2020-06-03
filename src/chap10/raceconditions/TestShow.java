package chap10.raceconditions;

public class TestShow {

	public static void main(String[] args) {
		new TestShow().go();
	}

	public void go() {

		Thread tGetSeats1 = new Thread(() -> {
			// make sure you sell both seats to the same thread
			synchronized (this) {// makes both booking ops as ATOMIC operation
				tiketAgentBooks("1A");
				tiketAgentBooks("1B");
			}

		}, "tGetSeats1");

		Thread tGetSeats2 = new Thread(() -> {
			// make sure you sell both seats to the same thread
			synchronized (this) { // makes both booking ops as ATOMIC operation
				tiketAgentBooks("1A");
				tiketAgentBooks("1B");
			}

		}, "tGetSeats2");

		tGetSeats1.start();
		tGetSeats2.start();
		
	}

	public void tiketAgentBooks(String seatName) {
		Show showSingleton = Show.getInstance();
		System.out.println(
				Thread.currentThread().getName() + " booked " + seatName + ": " + showSingleton.bookSeat(seatName));
	}
}
