package chap4.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Tests {
	public static void main(String[] args) {

//		Properties prop = System.getProperties();
//		prop.list(System.out);

		//savePropsToFile();
		loadPropsFromFile();
		
	}
	
	static void savePropsToFile() {
		Properties props = new Properties();
		props.setProperty("app.name", "Tests properties");
		props.setProperty("app.goal", "ocp8 chap4 training");
		props.list(System.out);
		try {
			props.store(new FileOutputStream("app.properties"),  "First save");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	static void loadPropsFromFile() {
		Properties props=new Properties();
		try {
			props.load(new FileInputStream("app.properties"));
			props.list(System.out);
			props.setProperty("test", "test");
			props.store(new FileOutputStream("app2.properties"), "update");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

