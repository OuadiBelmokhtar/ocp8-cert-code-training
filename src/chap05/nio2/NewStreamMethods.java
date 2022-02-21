package chap05.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class NewStreamMethods {
	public static void main(String[] args) {
		Path src = Paths.get(".").toAbsolutePath().normalize();
		System.out.println("src: "+src);
		try {
			// *** walk()
			//Files.walk(src).filter(p -> p.toString().endsWith(".java")).forEach(System.out::println);
			// *** find()
//			Files.find(src, Integer.MAX_VALUE, (p, a) -> p.toString().endsWith(".java")
//					&& a.lastModifiedTime().toMillis() >= Instant.now().minus(Duration.ofHours(1)).getEpochSecond()).forEach(System.out::println);
			// *** list(): filtrer et afficher les repertoires seulement
			Files.list(src).filter(p->Files.isDirectory(p)).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
