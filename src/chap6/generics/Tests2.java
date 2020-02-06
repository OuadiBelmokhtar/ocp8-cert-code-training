package chap6.generics;

import java.util.ArrayList;
import java.util.List;

public class Tests2 {

	static <T> T m0(T o) {
		return o;
	}

	static <T> void m1(List<T> list) {

	}

	static <T> T m2(List<T> list) {
		return list.get(0);
	}

	// it returns the same type used as the parameterized type of the passed List
	static <T> T m3(List<? extends T> list) {
		return list.get(0);
	}

	// you cannot use ? for declaring the parameterized type of the mtd.
	// ? is used only for declaring reference variables/params
	// Use a legal identifier(T) instead
	<? extends Animal> void m4(List<? extends Animal> list) {

	}

	<T extends Animal> void m5(T o) {

	}
	
	// only extends is allowed here
	<T super Animal> void m6(T o) {

	}

	// Return type of the mtd is missing
	// Will not compile because the return type isn’t actually a type.
	// You are writing the method. You know what type it is supposed to return.
	// You don’t get to specify this as a wildcard.
	<T> <? extends T> m5(List<? extends T> list) { 
		return list.get(0);
	}

	public static void main(String[] args) {
		Integer i = m0(new Integer(10));
		m1(new ArrayList<String>());
		Animal a1 = m2(new ArrayList<Animal>());
		Animal a2 = m3(new ArrayList<Animal>());
	}

}
