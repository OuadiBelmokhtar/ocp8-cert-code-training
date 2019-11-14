package chap5.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Tests1 {
	public static void main(String[] args) {
//		Path path = Paths.get("fich2.txt");
//		try {
//			// Files.createFile(path);
//			// List<String> lines=Files.readAllLines(path);
//			List<String> lines = new ArrayList<String>();
//			lines.add("ahmed");
//			lines.add("Taha");
//			Files.readAllLines(path).get(1);
//			Files.write(path, lines);
//			for (String l : lines)
//				System.out.println(l);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

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
