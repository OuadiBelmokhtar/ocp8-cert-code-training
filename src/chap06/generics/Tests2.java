package chap06.generics;

import java.util.ArrayList;
import java.util.List;

public class Tests2 {

	/**
	 * 1. Declaration du type parametre
	 **/
	// Correct
	// Exp of call: Integer i = m10(new Integer(10));
	<T> T m10(T o) {
		return o;
	}

	// Correct
	<T> void m11(List<T> list) {

	}

	// Correct, it returns the same type used as
	// the parameterized type of the passed List.
	// Exp of call: Animal a1 = m12(new ArrayList<Animal>());
	<T> T m12(List<T> list) {
		return list.get(0);
	}

	// Correct, it returns the same type used as
	// the parameterized type of the passed List.
	// Ex of call: Animal a2 = m3(new ArrayList<Animal>());
	<T> T m13(List<? extends T> list) {
		return list.get(0);
	}

	// Correct.
	// Exp of call:
	// m14(new Integer(10));// Comp Err: The method m14(T) is not applicable for the
	// arguments (Integer)
	// m14(new Dog()); // Ok
	<T extends Animal> void m14(T o) {

	}

	// Correct.
	// Exp of call:
	// m141(new ArrayList<Dog>()); // ok
	// m141(new ArrayList<Integer>()); // Comp Err: The method m141(List<T>) is not
	// applicable for the arguments (Integer)
	<T extends Animal> void m141(List<T> o) {

	}

	// Correct. Car <? extends Number> n est pas lie avec <T extends Animal>
	// Exp of call: m142(new ArrayList<Integer>());// Ok
	<T extends Animal> void m142(List<? extends Number> o) {

	}

	// ONLY extends is allowed for declaring parameterized type
	<T super Animal> void m15(T o) {

	}

	<T extends Animal> T m16(T o) {
		return new T(); // Cannot instantiate the type T
	}

	// you cannot use ? for declaring the parameterized type of the mtd.
	// ? is used only for declaring reference variables/params
	// Use a legal identifier(T) instead
	<? extends Animal> void m17(List<? extends Animal> list) {

	}

	// Warning: the type parameter CC is hiding the type CC
	// CC est deja declare comme une class
	<CC extends Animal> CC m18(CC o) {
		return new CC(); // Cannot instantiate the type CC
		// si CC est considere comme une class, linstanciation sera accepte
	}

	/**
	 * 2. Declaration du type de retour
	 **/

	// Return type of the mtd is missing
	// Will not compile because the return type ISN'T actually a type.
	// You are writing the method. You know what type it is supposed to return.
	// You don’t get to specify this as a wildcard.
	<T> <T extends Animal> m20(List<? extends T> list) {
			
	}

	// Return type of the mtd is missing
	// Will not compile because the return type ISN'T actually a type.
	// You are writing the method. You know what type it is supposed to return.
	// You don’t get to specify this as a wildcard.
	<T> <? extends T> m23(List<? extends T> list) { 
		return list.get(0);
	}

	// Return type of the mtd is missing
	// Will not compile because the return type ISN'T actually a type.
	// You are writing the method. You know what type it is supposed to return.
	// You don’t get to specify this as a wildcard.
	<T> <? extends Animal> m26(List<? extends T> list) { 
			
	}

	/**
	 * 3. Declaration de largument
	 **/
	// Correct. Pas besoin de declare le type parametere
	void m30(List<? extends Animal> o) {

	}

	// correct to use wildcard <? extends T> to declare a ref param
	<T> void m31(List<? extends T> o) {

	}

	// correct to use wildcard <?> to declare a ref param
	<T> void m32(List<?> o) {

	}

	// Des not compile because it tries to mix
	// a method-specific type parameter with a wildcard.
	// A wildcard must have a ? in it.
	// Normalement cette syntaxe concerne la declaration du type parametre de la mtd
	<T> void m33(List<T extends Animal> o) {

	}

	public static void main(String[] args) {
		m14(new Dog());
		m14(new Integer(10));// The method m14(T) is not applicable for the arguments (Integer)
		m141(new ArrayList<Dog>());
		m141(new ArrayList<Integer>()); // The method m141(List<T>) is not applicable for the arguments (Integer)
		m142(new ArrayList<Integer>());// Ok
		Integer i = m0(new Integer(10));
		m1(new ArrayList<String>());
		Animal a1 = m2(new ArrayList<Animal>());
		Animal a2 = m3(new ArrayList<Animal>());
	}

}
