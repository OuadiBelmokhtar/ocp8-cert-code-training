package chap02.patterns.factorymethod;

public class WordProcessor implements App {
	public void open(String fileName) {
		System.out.println("Launch WordProcessor using " + fileName);
	}
}
