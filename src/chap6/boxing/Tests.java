package chap6.boxing;

import java.util.ArrayList;
import java.util.List;

import chap6.generics.Animal;
import chap6.generics.Dog;

public class Tests {

	// N'ajoute rien ds la list, permet seulement de consulter
	static void consulter(List<? extends Animal> animals) {
		animals.get(0);
	}
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		consulter(dogs); // ca marche, car Dog IS-A Animal, et la mtd n'ajouyte rien
		
		// consulter(List<Animal> animals) is not applicable for the argument (List<Dog>)

//		List<String> list= Arrays.asList("abc", "de","fg");
//		list.add("hi");
//		for(String s:list)
//			System.out.println(s);
//		
//		TreeSet<String> tre=new TreeSet<String>();
//		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();

//		String[] strArr= {">ff<","> f<", ">f <",">FF<", ">3f<"};
//		PriorityQueue<String> pq2=new PriorityQueue<String>();
//		for(String s:strArr)
//			pq2.offer(s);
//		
//		for(String s:strArr)
//			System.out.print(pq2.poll()+ "  ");
//		//printed order: > f<  >3f<  >FF<  >f <  >ff< 
//			LinkedHashSet l;
//			List<Integer> list=new ArrayList<>();


	}

}
