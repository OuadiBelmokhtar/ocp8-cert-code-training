package chap5.nio2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamSample1 {
	public static void main(String[] args) {
		try {
			Path path2 = Paths.get("a");
			DirectoryStream<Path> stream = Files.newDirectoryStream(path2, "*.txt");
			for (Path p : stream) {
				System.out.println(p);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
