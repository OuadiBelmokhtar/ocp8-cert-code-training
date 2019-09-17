package chap1.enums;

// Enum declared in a separate file
public enum CoffeeSize {
	
	BIG(8), HUGE(10), OVERWHELMING(15); // ; is required
	
	// instance variable
	private int mls;

	CoffeeSize(int mls) { // only default or private am is permitted
		this.mls = mls;
	}

	public int getMls() {
		return mls;
	}
}

