package chap07;

import java.sql.SQLException;

public class MyOuter {
	int x;
	static void test() {
		
		class in{
			 void m1() {
				// Cannot make a static reference to the non-static field x
				x=10;
			}
		}
	}
	
	void testLocalClass() {
		MyOuter.MyInner1 inner =new MyOuter.MyInner1();
		// Local var
		final String localVar; // not initialized
		// Method-local inner class
		 class LocalC {

			 void m1() {
				// The final local variable localVar cannot be assigned, 
				// since it is defined in an enclosing type
				localVar = "ok";
				System.out.println(localVar);
			}// end m1
		}// end LocalC
	}// end testLocalClass

//	LocalC l = new LocalC();
//	l.m1();
	public static void main(String[] args) {
		// MyInner1 m = new MyInner1();// No enclosing instance of type MyOuter is
		// accessible. Must qualify the
		// allocation with an enclosing instance of type MyOuter (e.g. x.new A() where x
		// is an instance of MyOuter).
		MyOuter outer = new MyOuter();
		 
		outer.testLocalClass();

	}

	class MyInner1 {
		void m1() {
			x = 10;
		}
	}
}
