package chap5.java.io;

import java.io.Console;

public class ConsoleSample {
	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) { // determines if the Console is available
			String userInput = console.readLine("Your email: "); // prompt the msg, then read user's input
			console.writer().println("You entered the following: " + userInput);
		}
	}
}
