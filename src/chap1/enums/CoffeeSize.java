package chap1.enums;

// Enum declared in a separate file
public enum CoffeeSize {
	// 8, 10 and 16 are passed to the constructor
	// BIG(8), HUGE(10), OVERWHELMING(16); // init with 1 arg
	BIG(8, "A"), HUGE(10, "B"), OVERWHELMING(16); // init with 2 args

	// instance variable that represent the state of each enum item
	private int mls;
	private String coverType;

	// constructor of enum
	CoffeeSize(int mls) { // only default or private am is permitted
		this.mls = mls;
	}

	// Overloaded constructor
	CoffeeSize(int mls, String coverType) {
		this.mls = mls;
		this.coverType = coverType;
	}

	// methods as behavior of each enum item
	public int getMls() {
		return mls;
	}

	public String getCoverType() {
		return coverType;
	}

	// Overriding toString() from Enum class
	public String toString() {
		return "[" + mls + ", " + coverType + "]";
	}
}
