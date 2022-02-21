package chap06.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tests1 {

	// N'ajoute et ne modifie rien ds la list, permet seulement de consulter
	static void consulter(List<? extends Animal> animals) {
		animals.get(0);
		//animals.add(new Dog());
		//animals.set(0, new Dog());
	}

	

	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		consulter(dogs); 
		// ca marche, car Dog IS-A Animal, et la mtd n'ajouyte rien
		// dothing(dogs);
		// consulter(List<Animal> animals) is not applicable for the argument
		// (List<Dog>)

//		
		static void dothing(List list) {
			list.add(new Integer(28));
		}
		
		Object[] os = new Integer[3];
		os[0] = new Integer(10);
		os[1] = new String("ok");// Works at CT, but throws ArrayStoreException at RT
		System.out.println(os[0] + " " + os[1]);

		List list = new ArrayList();
		list.add(new String("ok"));
		// Type mismatch: cannot convert from ArrayList<Integer> to List<Object>

		List<? extends Animal> dogs1 = new ArrayList<Dog>();
		dogs1.get(0);

		List<? super Dog> animals = new ArrayList<Animal>(); // OK, since Animal isSuperType of Dog
		animals.add(new Dog()); // OK
		animals.add(new Canich()); // OK, since Canich IS-A Dog and Animal
		animals.add(new Animal()); // KO, since Animal is not a Dog 
		// The method add() is not applicable for the arguments (Animal)
		animals.add(new Object()); //KO, since Object is not a Dog
		animals.add(new Cat()); //KO, since Cat is not a Dog
		
		

	}

}
