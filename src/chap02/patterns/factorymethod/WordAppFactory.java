package chap02.patterns.factorymethod;

public class WordAppFactory extends AppFactory{

	@Override
	public App createApp() {
		return new WordProcessor();
	}

}
