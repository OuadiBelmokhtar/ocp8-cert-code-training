package chap2.patterns.factorymethod;

public class TextEditFactory extends AppFactory {

	@Override
	public App createApp() {
		return new TextEditor();
	}

}
