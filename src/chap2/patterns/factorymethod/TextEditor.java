package chap2.patterns.factorymethod;

public class TextEditor implements App {
	public void open(String fileName) {
		System.out.println("Launch TextEditor using " + fileName);
	}
}
