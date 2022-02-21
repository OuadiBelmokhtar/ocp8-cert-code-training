package chap06.generics;

import java.util.ArrayList;
import java.util.List;

public class Tests4 {
	public static void main(String[] args) {
		
		List lst1 = new ArrayList<Integer>();
		lst1.add("ok");
		// ArrayList is a raw type. References to generic type 
		// ArrayList<E> should be parameterized
		List<Integer> lst2 = new ArrayList();
		lst2.add(2);
		Object o=9;
		System.out.println(o);
		
		List lst3 = new ArrayList();
		lst3.add(9);
	}
}
