package chap5.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteReadTextFile {
	public static void main(String[] args) {
		write("Ouadi Belmokhtar");
		write("Amine Kamali");
		read();
	}

	private static void write(String data) {
		try {
			File file = new File("fich1.txt");
			PrintWriter pw = new PrintWriter(file);
			pw.println(data); // ecrase le contenu avant d ecrire
			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void read() {

		try {
			File file = new File("fich1.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String ligne = br.readLine();
			System.out.println(ligne);
			br.close();
			fr.close();
			
			// Reading all lines
//			String line = null;
//			while ((line = br.readLine()) != null) { // When THERE IS NO DATA TO READ, readLine() returns a null
//				System.out.println(line);
//			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
