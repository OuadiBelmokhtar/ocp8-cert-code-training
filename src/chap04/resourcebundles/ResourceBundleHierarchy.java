package chap04.resourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleHierarchy {
	public static void main(String[] args) {
		Locale locFr = new Locale("fr");
		ResourceBundle rb = ResourceBundle.getBundle("BR", locFr);
		System.out.println("Base: "+rb.getBaseBundleName());
		
		System.out.println(rb.getString("hello"));
	}
}
