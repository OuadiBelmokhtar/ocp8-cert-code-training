package chap4.resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class Tests {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("Labels", new Locale(args[0]));
		// ResourceBundle rb = ResourceBundle.getBundle("Labels", Locale.CANADA);
		System.out.println(rb.getString("hello"));
	}
}
