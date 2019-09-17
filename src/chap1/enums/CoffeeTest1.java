package chap1.enums;

import chap1.enums.Coffee.CoffeeName;

public class CoffeeTest1 {

	public static void main(String[] args) {
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
		drink1.size = CoffeeSize.HUGE;
		Coffee drink2 = new Coffee();
		drink2.size = CoffeeSize.BIG;
		System.out.println(drink1.size.getMls()); // prints 10

		for()
		System.out.println(CoffeeSize.HUGE + " " + hugeMl + " mls");
	}
}
