package chap05.java.io;

import java.io.Console;
import java.util.Arrays;

public class LoginConsole {
	public static void main(String[] args) {
		String name = null;
		char pwd[] = new char[8];// to store the password
		Console console = System.console();
		if (console == null) {
			throw new RuntimeException("Console isn't supported in this environement");
		} else {
			console.writer().println("User name: ");
			name = console.readLine();
			console.writer().println("Password ");
			pwd = console.readPassword(); // inputed characters are not visible while typing
			console.writer().println("Hello, " + name + ", your pwd is " + Arrays.toString(pwd));
			
		}
	}
}

//name=cons.readLine("%s", "You name?");
//cons.format("%s", name);