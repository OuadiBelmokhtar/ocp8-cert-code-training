package chap06.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Tests3<T extends String> {
	public static void main(String[] args) {
		Map<Animal, String> map = new HashMap<Animal, String>();
		List<? extends String> lst=new ArrayList<String>();
		Animal dog = new Animal();
		dog.nom = "cluver";
		map.put(dog, "Dog animal");
		System.out.println(map.get(dog));// Dog animal
		dog.nom = "bobi";
		System.out.println(map.get(dog));// null, because hashCode() fails
		dog.nom = "bobino";
		System.out.println(map.get(dog)); // Dog animal
		PriorityQueue<String> pq = new PriorityQueue<String>();

		TreeSet ts = new TreeSet();
		ts.add(new Object());// throws ClassCastException: Object class cannot be cast to Comparable
		int a, b, c;
		for (a = 1, b = 3, c = a * b; a < 10; a++) {
Tests3<String> t= new Tests3<String>();
		}
		
	}
}
