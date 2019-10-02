package chap2.patterns.factorymethod;

public class WordAppFactory extends AppFactory{

	@Override
	public App getApp() {
		return new WordProcessor();
	}

}
