package chap02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Tests1 {

	static Integer count;

	void m1() {
		Tests1 f = null;
		f.count = 10;
		System.out.println(f.count);
	}

	public static void main(String[] args) {
		new Tests1().m1(); // 10
		LocalDateTime ldt;
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDat(FormatStyle.SHORT); 

	}
//		Animal an = new Horse();
//		Horse h = new Horse();
//		an.doStuff(h);// Horse version that takes Horse param
//		an.doStuff(an); // Horse version
//		
//
//	}

}

interface A {
	default void hello() {
	}
}

interface B extends A {
	default void hello() {
		super.hello();// This is NOT valid.        
		A.super.hello();// This is valid.    
	}
}

class TestClass implements B {
	public void test() {
		hello();// valide. we are callign the inherited hello()
		super.hello();// This is NOT valid.       
		A.super.hello();// This is NOT valid because TestClass does not implement A directly.       
		B.super.hello();// This is valid.    
	}
}

