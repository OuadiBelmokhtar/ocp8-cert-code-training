package chap6.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tests3 {
	public static void main(String[] args) {
		Map<Animal, String> map = new HashMap<Animal, String>();
		Animal dog = new Animal();
		dog.nom = "cluver";
		map.put(dog, "Dog animal");
		System.out.println(map.get(dog));// Dog animal
		dog.nom = "bobi";
		System.out.println(map.get(dog));// null, because hashCode() fails
		dog.nom = "bobino";
		System.out.println(map.get(dog)); // Dog animal
		
	}
}
