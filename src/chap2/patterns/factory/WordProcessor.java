package chap2.patterns.factory;

public class WordProcessor implements App {
	public void open(String fileName) {
		System.out.println("Launch WordProcessor using " + fileName);
	}
}
