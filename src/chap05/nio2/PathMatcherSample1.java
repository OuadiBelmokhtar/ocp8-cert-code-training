package chap05.nio2;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.util.HashSet;

public class PathMatcherSample1 {
	public static void main(String[] args) {

		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**.txt"); // ** donne le meme resultat que
																						// *** et **/*
		Path path1 = Paths.get("/a/b/c/fich.txt");
		System.out.println(matcher.matches(path1)); // true

//		PathMatcher matcher =FileSystems.getDefault().getPathMatcher("glob:*.txt"); 
//		Path path1 = Paths.get("fich.txt/a/b/c"); // meme resultat si je commence avec /
//		System.out.println(matcher.matches(path1)); // false

		// Path path1 = Paths.get("/a/b/p.txt");


	}
}
