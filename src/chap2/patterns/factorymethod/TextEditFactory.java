package chap2.patterns.factorymethod;

public class TextEditFactory extends AppFactory {

	@Override
	public App getApp() {
		return new TextEditor();
	}

}
