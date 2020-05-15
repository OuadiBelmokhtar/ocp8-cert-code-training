package chap02.patterns.factorymethod;

public class Client {

	public static void main(String[] args) {
//		App app1 = AppFactory.getAppInstance(".doc");
//		app1.open("/Users/rapport.doc");
//		//
//		App app2 = AppFactory.getAppInstance(".txt");
//		app2.open("/Users/bd.xml");

		AppFactory factory = new TextEditFactory(); //
		App wordApp = factory.getAppInstance(); // la version de getApp() (encapsuleds getAppInstance())
												// qui sera invoque est celle de lobjet
												// ds le heap TextEditFactory
		wordApp.open("/Users/rapport.doc");
	}
}