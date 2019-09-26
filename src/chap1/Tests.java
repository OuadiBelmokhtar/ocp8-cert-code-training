package chap1;

public class Tests {
static int A;
	public static void main(String[] args) {
		byte b = 10;
		int i = b; // widening
		System.out.println(i);
		final int i2 = 20;
		byte b2 = i2; // implicit narrowing, its ok only if i2 is a compile-time constant
		System.out.println(b2);
		int i3 = getWidenByte();
		System.out.println(i3);
		byte b3 = getNarrowedInt();
		System.out.println(b3);
	}

	static int getWidenByte() {
		byte b = 30;
		return b;
	}

	static byte getNarrowedInt() {
		final int i = 40;
		return i;
	}

	public Tests() {
		
	}
}
