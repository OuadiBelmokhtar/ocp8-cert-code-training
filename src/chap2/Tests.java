package chap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tests {
	List<String> favoriteFoods;
	
	// Should not return the original instance var list
	public List<String> getFavoriteFoods() {
		// create a new ArrayList with the same elts of the arg favoriteFoods, and return it
		List<String> copie = new ArrayList<String>(favoriteFoods);
		return copie;
	}

	public static void main(String[] args) {
		List<String> list0 = new ArrayList<String>();
		list0.add("A");
		
		ArrayList<String> list2 = new ArrayList<String>(list0);// create a new ArrayList with the same elts of list1
		System.out.println(list0 == list2); // prints false

		List<String> list1 = new ArrayList<String>();
		list1.add("A");
		// create and return a read-only list with the same content as the list passed as arg
		List<String> list3 = Collections.unmodifiableList(list1);
		System.out.println(list1 == list3);// prints false
		for (String s : list3)
			System.out.println("list3:" + s);// prints A
		// Trying to add an elt to the read-only list3 
		list3.add("A");// throws UnsupportedOperationException
		
		
		// list1=list3;
		
//		list1.add("A");
//		// list3.add("B");
//		
//		for (String s : list2)
//			System.out.println("list2:" + s);

	}

}
