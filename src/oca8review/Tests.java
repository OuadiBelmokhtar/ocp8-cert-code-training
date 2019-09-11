package oca8review;

import java.util.ArrayList;

public class Tests {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Ahmed"));
		personList.add(new Person("Taha"));
		personList.add(new Person("Kamal"));
		personList.add(new Person("Akram"));
		for (Person p : personList)
			System.out.println(p.name);
		
		personList.removeIf(p -> p.name.startsWith("A"));
		
		System.out.println("-->After deletion");
		for (Person p : personList)
			System.out.println(p.name);

	}
}

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}
}
