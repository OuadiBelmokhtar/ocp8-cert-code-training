package chap05.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Tests {
	public static void main(String[] args) {
		Path p1 = Paths.get("/zoo/../home").getParent().normalize().toAbsolutePath();
		System.out.println(p1);
	}
}
