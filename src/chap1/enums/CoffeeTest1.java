package chap1.enums;

import chap1.enums.Coffee.CoffeeName;

public class CoffeeTest1 {
	static CoffeeSize enumVar;

	public static void main(String[] args) {
		// access using var but not the class name
		System.out.println(enumVar.BIG);
		System.out.println(CoffeeSize.BIG);

		// If the enum is imported as above, using class name as prefix becomes optional
		CoffeeName name = CoffeeName.CAPPUCINO;
		String strName = Coffee.CoffeeName.CAPPUCINO.toString(); 
		// ...

		CoffeeSize enumSize = CoffeeSize.HUGE;

		Object objSize = CoffeeSize.HUGE;
		String strSize = CoffeeSize.HUGE.name();
		Coffee coffee1 = new Coffee(name, enumSize);
		System.out.println(coffee1);
		System.out.println("StrSize:" + strSize);
		System.out.println("ObjSize:" + objSize);
		System.out.println("StrName:" + strName);
		//

		Coffee drink1 = new Coffee();
		drink1.size = CoffeeSize.HUGE;// porteur de donnees
		Coffee drink2 = new Coffee();
		drink2.size = CoffeeSize.BIG;
		System.out.println(drink1.size.getMls()); // prints 10
		System.out.println(drink1.size.getCoverType()); // prints B

		//
		System.out.println("*Affichage des enums via boucle");
		for (CoffeeSize cs : CoffeeSize.values())
			System.out.println(cs); // prints all enums
		//
		System.out.println("*Affichage des Mls des enums");
		for (CoffeeSize cs : CoffeeSize.values())
			System.out.println(cs + " " + cs.getMls());
		//
		System.out.println("*Affichage via indice");
		System.out.println(CoffeeSize.values()[0]); // print BIG

		// System.out.println(CoffeeSize.HUGE + " " + hugeMl + " mls");
	}
}
