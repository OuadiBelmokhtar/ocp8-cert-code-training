package chap05.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyMoveDeleteFile {
	public static void main(String[] args) {
		try {
			Path test1 = Paths.get("copy_move_delete/test1.txt");// exists
			Path test2 = Paths.get("copy_move_delete/test2.txt"); // doesn't yet exist
			Files.copy(test1, test2); // create test2.txt which is a copy of test1.txt 
			Files.delete(test2); // delete test2.txt
			Files.move(test1, test2);// replace test1.txt by test2.txt
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
