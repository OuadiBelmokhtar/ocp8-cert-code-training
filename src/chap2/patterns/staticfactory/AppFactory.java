package chap2.patterns.staticfactory;

public class AppFactory {

	public static App getAppInstance(String fileExtension) {
		switch (fileExtension) {
		case ".doc":
			return new WordProcessor();
		case ".txt": // empty means OR
		case ".xml":
			return new TextEditor();
		default:
			return null;
		}
	}
}
