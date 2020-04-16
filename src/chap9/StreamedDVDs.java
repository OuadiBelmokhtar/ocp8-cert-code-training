package chap9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamedDVDs {
	public static void main(String[] args) {
		try (Stream<String> dvdStream = Files.lines(Paths.get("dvds.txt"))) {
			List<DVDInfo> dvdsList = dvdStream
					.map(line -> new DVDInfo(line.split("/")[0], line.split("/")[1], line.split("/")[2]))
					.collect(Collectors.toList());
			dvdsList.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
} 
