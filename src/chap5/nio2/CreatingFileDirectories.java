package chap5.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreatingFileDirectories {
	public static void main(String[] args) {

		try {
			Path path = Paths.get("fich3.txt");
			Files.createFile(path);
			List<String> lines1 = new ArrayList<String>();
			lines1.add("ahmed");
			lines1.add("Taha");
			lines1.add("Karim");
			// Ecrire ds le fichier
			Files.write(path, lines1);
			// Lire le contenu du fichier
			List<String> lines2 = Files.readAllLines(path);

			for (String l : lines2)
				System.out.println(l);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Path path2 = Paths.get("a/b/c");
			Files.createDirectories(path2);
			// Path path3=Paths.get("a/b/c/f1.txt");
			Path path3 = Paths.get(path2.toString(), "f1.txt");
			if (Files.notExists(path3)) {
				Files.createFile(path3);
			} else {
				System.out.println("File already exists");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
