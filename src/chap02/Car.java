package chap02;

import java.io.FileNotFoundException;

import chap01.Vehicule;

public class Car extends Vehicule {
	
	@Override
	public void m2() { // supprime la declaration de FileNotFoundException
	}
	public void m3() { // ce n est pas la peine de traiter FileNotFoundException
		m2();
	}
}

//public Car() {
//	this.color = "";// OK, by inheritence
//	Car c = new Car();
//	c.color = ""; // Ok, by a subclass reference
//	Vehicule v = new Vehicule();
//	// v.color = ""; // Ko, cannot be accessed by the declaring class reference
//	m();
//
//}
